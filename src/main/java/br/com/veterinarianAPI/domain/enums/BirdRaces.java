package br.com.veterinarianAPI.domain.enums;

/**
 * Representa as racas de aves disponiveis no sistema.
 */
public enum BirdRaces {

    /** Pato. */
    DUCK("Duck"),

    /** Galinha. */
    CHICKEN("Chicken"),

    /** Outra raca de ave. */
    OTHER("Other");

    /** Nome de exibicao da raca de ave. */
    String name;

    /**
     * Construtor.
     *
     * @param name nome de exibicao da raca de ave
     */
    BirdRaces(String name) {
        this.name = name;
    }

    /**
     * Retorna o nome de exibicao da raca de ave.
     *
     * @return nome de exibicao da raca de ave
     */
    public String getName() {
        return name;
    }
}
