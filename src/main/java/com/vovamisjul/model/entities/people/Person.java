package com.vovamisjul.model.entities.people;

import org.apache.commons.lang.builder.HashCodeBuilder;

import java.io.Serializable;

public abstract class Person implements Serializable {
    String name;
    Gender gender;

    public Person() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public Person(String name, Gender gender) {
        this.name = name;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Person " + name + ", " + gender;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this)
            return true;
        if (obj == null || obj.getClass() != getClass())
            return false;
        var person = (Person)obj;
        return person.name.equals(name) && person.gender == gender;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(name).append(gender).toHashCode();
    }
}