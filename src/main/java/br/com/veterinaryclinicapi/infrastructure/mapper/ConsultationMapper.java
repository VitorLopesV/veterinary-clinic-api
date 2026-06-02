package br.com.veterinaryclinicapi.infrastructure.mapper;

import br.com.veterinaryclinicapi.domain.model.Consultation;
import br.com.veterinaryclinicapi.infrastructure.bd.ConsultationEntity;
import org.springframework.stereotype.Component;

@Component
public class ConsultationMapper {

    public ConsultationEntity toEntity(Consultation consultation) {
        return new ConsultationEntity(consultation.getId(), consultation.getPatientId(),
                consultation.getVeterinarianName(), consultation.getCrmv(), consultation.getDescription(),
                consultation.getConsultationDate());
    }

    public Consultation toDomain(ConsultationEntity entity) {
        return new Consultation(entity.getId(), entity.getPatientId(), entity.getVeterinarianName(), entity.getCrmv(),
                entity.getDescription(), entity.getConsultationDate());
    }

}
