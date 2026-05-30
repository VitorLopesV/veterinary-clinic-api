package br.com.veterinaryclinicapi.domain.enums;

/**
 * Representa as classificacoes de pacientes disponiveis no sistema.
 */
public enum Classifications {

    /** Classificacao para pacientes caninos. */
    CANINE("Canino"),

    /** Classificacao para pacientes felinos. */
    FELINE("Felino"),

    /** Classificacao para pacientes aves. */
    BIRDS("Ave");

    /** Nome de exibicao da classificacao. */
    String name;

    /**
     * Construtor.
     *
     * @param name nome de exibicao da classificacao
     */
    Classifications(String name) {
        this.name = name;
    }

    /**
     * Retorna o nome de exibicao da classificacao.
     *
     * @return nome de exibicao da classificacao
     */
    public String getName() {
        return name;
    }
}
