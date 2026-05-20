package br.com.veterinarianAPI.domain.model;

import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * Representa uma vacina cadastrada no sistema.
 * <p>
 * Armazena dados basicos da vacina, como paciente, nome, fabricante,
 * data de aplicacao, proxima dose e lote.
 */
public class Vaccine {

    /** Paciente relacionado a vacina. */
    private Patient patient;

    /** Nome da vacina. */
    private String name;

    /** Fabricante da vacina. */
    private String manufacturer;

    /** Data de aplicacao da vacina. */
    private LocalDateTime applicantDate;

    /** Data da proxima dose. */
    private LocalDate nextDose;

    /** Lote da vacina. */
    private String batch;

}
