package br.com.veterinarianAPI.domain.model;

import br.com.veterinarianAPI.domain.enums.Classifications;
import lombok.Data;

import java.util.Date;

/**
 * Representa um paciente veterinario cadastrado no sistema.
 * <p>
 * Armazena dados basicos do animal, como nome, tutor, data de nascimento,
 * sexo, raca e classificacao.
 */
@Data
public class Patient {

    /** Nome do paciente. */
    private String name;

    /** Tutor responsavel pelo paciente. */
    private Tutor tutor;

    /** Data de nascimento do paciente. */
    private Date dateOfBirth;

    /** Peso do paciente. */
    private double weight;

    /** Raca do paciente. */
    private String race;

    /** Classificacao do paciente. */
    private Classifications classification;

    /** Indica se o paciente e castrado. */
    private boolean isCastrated;

    /** Sexo do paciente. */
    private String sex;

}
