package br.com.veterinaryclinicapi.application.mapper;

import br.com.veterinaryclinicapi.application.dto.request.PatientRequest;
import br.com.veterinaryclinicapi.application.dto.response.PatientResponse;
import br.com.veterinaryclinicapi.domain.model.Patient;
import org.springframework.stereotype.Component;

@Component
public class PatientDtoMapper {

    public Patient toDomain(PatientRequest patientRequest) {
        return new Patient(patientRequest.getId(), patientRequest.getName(), patientRequest.getTutorId(),
                patientRequest.getDateOfBirth(), patientRequest.getWeight(), patientRequest.getRace(),
                patientRequest.getClassification(), patientRequest.isCastrated(), patientRequest.getSex());
    }

    public PatientResponse toResponse(Patient patient) {
        return new PatientResponse(patient.getId(), patient.getName(), patient.getTutorId(),
                patient.getDateOfBirth(), patient.getWeight(), patient.getRace(),
                patient.getClassification(), patient.isCastrated(), patient.getSex());
    }

    public PatientRequest toRequest(Patient patient) {
        return new PatientRequest(patient.getId(), patient.getName(), patient.getTutorId(),
                patient.getDateOfBirth(), patient.getWeight(), patient.getRace(),
                patient.getClassification(), patient.isCastrated(), patient.getSex());
    }
}
