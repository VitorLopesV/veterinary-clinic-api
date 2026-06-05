package br.com.veterinaryclinicapi.application.dto.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class ConsultationRequest {

    /** Identificador da consulta. */
    private Long id;

    /** Paciente relacionado a consulta. */
    private Long patientId;

    /** Nome do veterinario responsavel pela consulta. */
    private String veterinarianName;

    /** CRMV do veterinario responsavel pela consulta. */
    private String crmv;

    /** Descricao da consulta. */
    private String description;

    /** Data da consulta. */
    private LocalDateTime consultationDate;

}
