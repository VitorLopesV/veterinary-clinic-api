package br.com.veterinarianAPI.enums;

public enum FelineRaces {

    PERSA("Persa"),
    RAGDOLL("Ragdoll"),;

    String name;

    FelineRaces(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
}
