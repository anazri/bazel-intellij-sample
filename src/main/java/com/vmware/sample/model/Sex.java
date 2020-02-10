package com.vmware.sample.model;

public enum Sex {
    MALE(0, "Male"),
    FEMALE(1, "Female");

    private Integer sex;
    private String message;

    Sex(Integer sex, String message) {
        this.sex = sex;
        this.message = message;
    }

    @Override
    public String toString() { return this.message; }
}
