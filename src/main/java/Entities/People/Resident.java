package Entities.People;

public class Resident extends Person {
    @Override
    public String toString() {
        return "Resident " + name + ", " + gender;
    }
}
