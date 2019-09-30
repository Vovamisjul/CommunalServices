package Entities.People;

public class Staff extends Person {
    private Position position = Position.WORKER;

    public Staff(String name, Gender gender, Position position) {
        super(name, gender);
        this.position = position;
    }

    @Override
    public String toString() {
        return "Staff " + name + " - " + position + ", " + gender;
    }
}

enum Position {
    WORKER("Worker"),
    DIRECTOR("Director");

    public String getName() {
        return name;
    }

    private String name;

    Position(String name) {
        this.name = name;
    }
}