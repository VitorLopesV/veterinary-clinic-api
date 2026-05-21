package br.com.veterinarianAPI.infrastructure.bd;

import br.com.veterinarianAPI.domain.enums.Classifications;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Table(name ="patients")
@Entity
@Data
@NoArgsConstructor
public class PatientEntity {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

    /** Nome do paciente. */
    private String name;

    /** Tutor responsavel pelo paciente. */
    @OneToOne() // Informa que 1 paciente só vai ter 1 tutor
    @JoinColumn(name ="tutor_id") // Define qual coluna do banco será usada como chave estrangeira.
    private TutorEntity tutor;

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
