package br.com.veterinarianAPI.enums;

public enum CanineRaces {

    PIT_BULL("PitBull"),
    YORKSHIRE("Yorkshire"),;

    String name;

    CanineRaces(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
}
