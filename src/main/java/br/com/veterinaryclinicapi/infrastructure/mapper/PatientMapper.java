package br.com.veterinaryclinicapi.infrastructure.mapper;

import br.com.veterinaryclinicapi.domain.model.Patient;
import br.com.veterinaryclinicapi.infrastructure.bd.PatientEntity;
import org.springframework.stereotype.Component;

@Component
public class PatientMapper {

    public PatientMapper() {
    }

    public PatientEntity toEntity(Patient patient) {
        return new PatientEntity(patient.getId(), patient.getName(), patient.getTutorId(), patient.getDateOfBirth(),
                patient.getWeight(), patient.getRace(), patient.getClassification(), patient.isCastrated(),
                patient.getSex());
    }

    public Patient toDomain(PatientEntity entity) {
        return new Patient(entity.getId(), entity.getName(), entity.getTutorId(), entity.getDateOfBirth(),
                entity.getWeight(), entity.getRace(), entity.getClassification(), entity.isCastrated(),
                entity.getSex());
    }
}
