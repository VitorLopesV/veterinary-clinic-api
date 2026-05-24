package br.com.veterinarianAPI.infrastructure.bd;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Table(name = "consultations")
@Data
@NoArgsConstructor
public class ConsultationEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /** Identificador do paciente. */
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
