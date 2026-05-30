package br.com.veterinaryclinicapi.domain.model;

import br.com.veterinaryclinicapi.domain.enums.ExamType;

import java.time.LocalDateTime;

/**
 * Representa um exame cadastrado no sistema.
 * <p>
 * Armazena dados basicos do exame, como paciente, tipo de exame, responsavel tecnico,
 * descricao e data da consulta.
 */
public class Exam {

    /** Paciente relacionado ao exame. */
    private Patient patient;

    /** Tipo do exame. */
    private ExamType examType;

    /** Responsavel tecnico pelo exame. */
    private String technicalManager;

    /** Descricao do exame. */
    private String description;

    /** Data da consulta relacionada ao exame. */
    private LocalDateTime consultationDate;
}
