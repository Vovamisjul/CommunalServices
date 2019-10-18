package com.vovamisjul.model.entities.people;

public class Resident extends Person {

    public Resident(String name, Gender gender) {
        super(name, gender);
    }
    @Override
    public String toString() {
        return "Resident " + name + ", " + gender;
    }
}
