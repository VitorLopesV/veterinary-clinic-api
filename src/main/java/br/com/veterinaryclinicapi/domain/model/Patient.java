package br.com.veterinaryclinicapi.domain.model;

import br.com.veterinaryclinicapi.domain.enums.Classifications;

import java.util.Date;

/**
 * Representa um paciente veterinario cadastrado no sistema.
 * <p>
 * Armazena dados basicos do animal, como nome, tutor, data de nascimento,
 * sexo, raca e classificacao.
 */
public class Patient {

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

    public Patient(Long id, String name, Long tutorId, Date dateOfBirth, double weight, String race,
                   Classifications classification, boolean isCastrated, String sex) {
        this.id = id;
        this.name = name;
        this.tutorId = tutorId;
        this.dateOfBirth = dateOfBirth;
        this.weight = weight;
        this.race = race;
        this.classification = classification;
        this.isCastrated = isCastrated;
        this.sex = sex;
    }

    public Patient(String name, Long tutorId, Date dateOfBirth, double weight, String race,
                   Classifications classification, boolean isCastrated, String sex) {
        this.name = name;
        this.tutorId = tutorId;
        this.dateOfBirth = dateOfBirth;
        this.weight = weight;
        this.race = race;
        this.classification = classification;
        this.isCastrated = isCastrated;
        this.sex = sex;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getTutorId() {
        return tutorId;
    }

    public void setTutorId(Long tutorId) {
        this.tutorId = tutorId;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public Classifications getClassification() {
        return classification;
    }

    public void setClassification(Classifications classification) {
        this.classification = classification;
    }

    public boolean isCastrated() {
        return isCastrated;
    }

    public void setCastrated(boolean castrated) {
        isCastrated = castrated;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
