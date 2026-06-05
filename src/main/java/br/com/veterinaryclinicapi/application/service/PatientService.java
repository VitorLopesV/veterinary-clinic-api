package br.com.veterinaryclinicapi.application.service;

import br.com.veterinaryclinicapi.application.dto.request.PatientRequest;
import br.com.veterinaryclinicapi.application.dto.response.PatientResponse;
import br.com.veterinaryclinicapi.application.mapper.PatientDtoMapper;
import br.com.veterinaryclinicapi.domain.model.Patient;
import br.com.veterinaryclinicapi.domain.repository.PatientRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.ArrayList;
import java.util.List;

@Service
public class PatientService {

    private final PatientRepository repository;

    private final PatientDtoMapper mapper;

    public PatientService(PatientRepository repository, PatientDtoMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    public PatientResponse save(PatientRequest patientRequest) {
        for (Patient patient : this.repository.findAll()) {
            if (patient.getId().equals(patientRequest.getId())) {
                System.out.println("Patient with id " + patient.getId() + " already exists");
            }
        }

        Patient patient = this.repository.save(mapper.toDomain(patientRequest));
        return mapper.toResponse(patient);
    }

    public List<PatientResponse> findAll() {
        List<PatientResponse> patients = new ArrayList<>();
        for (Patient patient : this.repository.findAll()) {
            patients.add(mapper.toResponse(patient));
        }
        return patients;
    }

    public PatientResponse findById(Long id) {
        Patient patient = this.repository.findById(id);

        if (patient == null) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Patient Not Found");
        }

        return mapper.toResponse(patient);
    }

    public void remove(Long id) {
        Patient patientToRemove = this.repository.findById(id);
        this.repository.delete(patientToRemove);
    }

}
