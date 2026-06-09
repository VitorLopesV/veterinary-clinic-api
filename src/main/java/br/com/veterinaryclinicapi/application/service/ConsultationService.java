package br.com.veterinaryclinicapi.application.service;

import br.com.veterinaryclinicapi.application.dto.request.ConsultationRequest;
import br.com.veterinaryclinicapi.application.dto.response.ConsultationResponse;
import br.com.veterinaryclinicapi.application.mapper.ConsultationDtoMapper;
import br.com.veterinaryclinicapi.domain.model.Consultation;
import br.com.veterinaryclinicapi.domain.repository.ConsultationRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.ArrayList;
import java.util.List;

@Service
public class ConsultationService {

    private final ConsultationRepository repository;

    private final ConsultationDtoMapper mapper;

    public ConsultationService(ConsultationRepository repository, ConsultationDtoMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    public ConsultationResponse save(ConsultationRequest consultationRequest) {
        Consultation saveConsultation = this.repository.save(mapper.toDomain(consultationRequest));
        return mapper.toResponse(saveConsultation);
    }

    public ConsultationResponse findById(Long id) {
        Consultation consultation = this.repository.findById(id);

        if (consultation == null) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Consultation Not Found");
        }

        return mapper.toResponse(consultation);
    }

    public List<ConsultationRequest> findAll() {
        List<ConsultationRequest> consultations = new ArrayList<>();
        for (Consultation consultation : this.repository.findAll()) {
            consultations.add(mapper.toRequest(consultation));
        }
        return consultations;
    }

    public ConsultationResponse update(Long id, ConsultationRequest consultationRequest) {
        Consultation consultation = this.findConsultationById(id);

        consultation.setVeterinarianName(consultationRequest.getVeterinarianName());
        consultation.setCrmv(consultationRequest.getCrmv());
        consultation.setDescription(consultationRequest.getDescription());
        consultation.setConsultationDate(consultationRequest.getConsultationDate());

        Consultation savedConsultation = this.repository.save(consultation);
        return mapper.toResponse(savedConsultation);
    }

    public void remove(Long id) {
        Consultation consultation = this.findConsultationById(id);
        this.repository.delete(consultation);
    }

    private Consultation findConsultationById(Long id) {
        Consultation consultation = this.repository.findById(id);

        if (consultation == null) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Consultation Not Found");
        }

        return consultation;
    }
}
