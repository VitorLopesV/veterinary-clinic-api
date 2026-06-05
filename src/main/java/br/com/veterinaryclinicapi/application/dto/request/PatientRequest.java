package br.com.veterinaryclinicapi.application.dto.request;

import br.com.veterinaryclinicapi.domain.enums.Classifications;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Date;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class PatientRequest {

    /** Identificador do paciente. */
    private Long id;

    /** Nome do paciente. */
    private String name;

    /** Id do tutor responsavel pelo paciente. */
    private Long tutorId;

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
