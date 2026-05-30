package br.com.veterinaryclinicapi.domain.enums;

/**
 * Representa os tipos de exame disponiveis no sistema.
 */
public enum ExamType {

    /** Exame de sangue. */
    BLOOD_TEST("Bloodtest"),

    /** Raio-x. */
    X_RAY("X-ray"),

    /** Ultrassom. */
    ULTRASOUND("Ultrasound"),

    /** Outro tipo de exame. */
    OTHER("Other");

    /** Nome de exibicao do tipo de exame. */
    String name;

    /**
     * Construtor.
     *
     * @param name nome de exibicao do tipo de exame
     */
    ExamType(String name) {
        this.name = name;
    }

    /**
     * Retorna o nome de exibicao do tipo de exame.
     *
     * @return nome de exibicao do tipo de exame
     */
    public String getName() {
        return name;
    }
}
