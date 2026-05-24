package br.com.veterinarianAPI.domain.model;

import java.time.LocalDateTime;

/**
 * Representa uma consulta cadastrada no sistema.
 * <p>
 * Armazena dados basicos da consulta, como paciente, nome do veterinario,
 * crmv, descricao e data da consulta.
 */
public class Consultation {

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

    public Consultation(Long id, Long patientId, String veterinarianName, String crmv, String description,
                        LocalDateTime consultationDate) {
        this.id = id;
        this.patientId = patientId;
        this.veterinarianName = veterinarianName;
        this.crmv = crmv;
        this.description = description;
        this.consultationDate = consultationDate;
    }

    public Consultation(Long patientId, String veterinarianName, String crmv, String description,
                        LocalDateTime consultationDate) {
        this.patientId = patientId;
        this.veterinarianName = veterinarianName;
        this.crmv = crmv;
        this.description = description;
        this.consultationDate = consultationDate;
    }

    public Long getId() {
        return id;
    }

    public Long getPatientId() {
        return patientId;
    }

    public void setPatientId(Long patientId) {
        this.patientId = patientId;
    }

    public String getVeterinarianName() {
        return veterinarianName;
    }

    public void setVeterinarianName(String veterinarianName) {
        this.veterinarianName = veterinarianName;
    }

    public String getCrmv() {
        return crmv;
    }

    public void setCrmv(String crmv) {
        this.crmv = crmv;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDateTime getConsultationDate() {
        return consultationDate;
    }

    public void setConsultationDate(LocalDateTime consultationDate) {
        this.consultationDate = consultationDate;
    }
}
