package br.com.veterinaryclinicapi.application.mapper;

import br.com.veterinaryclinicapi.application.dto.request.ConsultationRequest;
import br.com.veterinaryclinicapi.application.dto.response.ConsultationResponse;
import br.com.veterinaryclinicapi.domain.model.Consultation;
import org.springframework.stereotype.Component;

@Component
public class ConsultationDtoMapper {

    public Consultation toDomain(ConsultationRequest consultationRequest) {
        return new Consultation(consultationRequest.getId(), consultationRequest.getPatientId(),
                consultationRequest.getVeterinarianName(), consultationRequest.getCrmv(),
                consultationRequest.getDescription(), consultationRequest.getConsultationDate());
    }

    public ConsultationResponse toResponse(Consultation consultation) {
        return new ConsultationResponse(consultation.getId(), consultation.getPatientId(),
                consultation.getVeterinarianName(), consultation.getCrmv(), consultation.getDescription(),
                consultation.getConsultationDate());
    }

    public ConsultationRequest toRequest(Consultation consultation) {
        return new ConsultationRequest(consultation.getId(), consultation.getPatientId(),
                consultation.getVeterinarianName(), consultation.getCrmv(), consultation.getDescription(),
                consultation.getConsultationDate());
    }

}
