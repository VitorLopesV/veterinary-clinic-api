package br.com.veterinaryclinicapi.application.dto.response;

import br.com.veterinaryclinicapi.infrastructure.bd.PatientEntity;

import java.time.LocalDateTime;

public record ConsultationResponse(Long id, Long patient, String veterinarianName, String crmv,
                                   String description, LocalDateTime consultationDate) {

}
