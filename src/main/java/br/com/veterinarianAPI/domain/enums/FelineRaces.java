package br.com.veterinarianAPI.domain.enums;

/**
 * Representa as racas felinas disponiveis no sistema.
 */
public enum FelineRaces {

    /** Persa. */
    PERSA("Persa"),

    /** Ragdoll. */
    RAGDOLL("Ragdoll"),

    /** Outra raca felina. */
    OTHER("Other");

    /** Nome de exibicao da raca felina. */
    String name;

    /**
     * Construtor.
     *
     * @param name nome de exibicao da raca felina
     */
    FelineRaces(String name) {
        this.name = name;
    }

    /**
     * Retorna o nome de exibicao da raca felina.
     *
     * @return nome de exibicao da raca felina
     */
    public String getName() {
        return name;
    }
}
