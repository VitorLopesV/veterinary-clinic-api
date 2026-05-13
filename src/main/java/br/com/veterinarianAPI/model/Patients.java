package br.com.veterinarianAPI.model;

import br.com.veterinarianAPI.enums.Classifications;
import br.com.veterinarianAPI.enums.FelineRaces;
import lombok.Data;

import java.util.Date;

/**
 * Representa um paciente veterinario cadastrado no sistema.
 * <p>
 * Armazena dados basicos do animal, como nome, tutor, data de nascimento,
 * sexo, raca felina e classificacao.
 */
@Data
public class Patients {

    /** Nome do paciente. */
    private String name;

    /** Tutor responsavel pelo paciente. */
    private Tutors tutor;

    /** Data de nascimento do paciente. */
    private Date dateOfBirth;

    /** Sexo do paciente. */
    private String sex;

    /** Raca felina do paciente. */
    private FelineRaces felineRaces;

    /** Classificacao do paciente. */
    private Classifications classification;

}
