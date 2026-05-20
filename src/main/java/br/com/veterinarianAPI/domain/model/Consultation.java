package br.com.veterinarianAPI.domain.model;

import java.time.LocalDateTime;

/**
 * Representa uma consulta cadastrada no sistema.
 * <p>
 * Armazena dados basicos da consulta, como paciente, nome do veterinario,
 * crmv, descricao e data da consulta.
 */
public class Consultation {

    /** Paciente relacionado a consulta. */
    private Patient patient;

    /** Nome do veterinario responsavel pela consulta. */
    private String veterinarianName;

    /** CRMV do veterinario responsavel pela consulta. */
    private String crmv;

    /** Descricao da consulta. */
    private String description;

    /** Data da consulta. */
    private LocalDateTime consultationDate;

}
