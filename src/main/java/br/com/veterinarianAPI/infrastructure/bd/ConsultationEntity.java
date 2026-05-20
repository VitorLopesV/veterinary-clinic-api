package br.com.veterinarianAPI.infrastructure.bd;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "consultations")
public class ConsultationEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /** Paciente relacionado a consulta. */
    @ManyToOne  // Informa que 1 paciente pode ter várias consultas
    @JoinColumn(name = "patient_id") // Define qual coluna do banco será usada como chave estrangeira.
    private PatientEntity patient;

    /** Nome do veterinario responsavel pela consulta. */
    private String veterinarianName;

    /** CRMV do veterinario responsavel pela consulta. */
    private String crmv;

    /** Descricao da consulta. */
    private String description;

    /** Data da consulta. */
    private LocalDateTime consultationDate;

}
