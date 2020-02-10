package com.vmware.sample.model;

public enum Race {
    WHITE_RACE(0, "Caucasian"),
    YELLOW_RACE(1, "Xanthoderm"),
    BLACK_RACE(2, "Melanoderm");

    private Integer race;
    private String message;

    Race(Integer race, String message) {
        this.race = race;
        this.message = message;
    }

    @Override
    public String toString() { return this.message; }
}
