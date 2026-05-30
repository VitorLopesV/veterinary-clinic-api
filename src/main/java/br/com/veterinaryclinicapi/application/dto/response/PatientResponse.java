package br.com.veterinaryclinicapi.application.dto.response;

import br.com.veterinaryclinicapi.infrastructure.bd.PatientEntity;

import java.time.LocalDateTime;

public record PatientResponse(Long id, PatientEntity patient, String veterinarianName, String crmv, String description,
                              LocalDateTime consultationDate) {

}
