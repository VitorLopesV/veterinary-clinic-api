package br.com.veterinarianAPI.enums;

/**
 * Representa as racas caninas disponiveis no sistema.
 */
public enum CanineRaces {

    /** Pit Bull. */
    PIT_BULL("PitBull"),

    /** Yorkshire. */
    YORKSHIRE("Yorkshire"),

    /** Outra raca canina. */
    OTHER("Other");

    /** Nome de exibicao da raca canina. */
    String name;

    /**
     * Construtor.
     *
     * @param name nome de exibicao da raca canina
     */
    CanineRaces(String name) {
        this.name = name;
    }

    /**
     * Retorna o nome de exibicao da raca canina.
     *
     * @return nome de exibicao da raca canina
     */
    public String getName() {
        return name;
    }
}
