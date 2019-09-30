package Entities.People;

import java.io.Serializable;

public abstract class Person implements Serializable {
    String name;

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

    Gender gender;

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
        return person.getName().equals(name) && person.getGender() == gender;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}