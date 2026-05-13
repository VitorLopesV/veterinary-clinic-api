package br.com.veterinarianAPI.enums;

public enum BirdRaces {

    DUCK("Duck"),
    CHICKEN("Chicken");

    String name;

    BirdRaces(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
}
