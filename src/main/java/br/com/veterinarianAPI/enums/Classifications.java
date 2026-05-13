package br.com.veterinarianAPI.enums;

public enum Classifications {

    CANINE("Canino"),
    FELINE("Felino"),
    BIRDS("Ave");

    String name;

    Classifications(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
}
