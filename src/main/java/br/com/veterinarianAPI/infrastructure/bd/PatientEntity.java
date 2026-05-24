package br.com.veterinarianAPI.infrastructure.bd;

import br.com.veterinarianAPI.domain.enums.Classifications;
import br.com.veterinarianAPI.domain.model.Tutor;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Table(name = "patients")
@Entity
@Data
@NoArgsConstructor
public class PatientEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /** Nome do paciente. */
    private String name;

    /** Identificador do tutor. */
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
