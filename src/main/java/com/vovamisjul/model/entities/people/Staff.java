package com.vovamisjul.model.entities.people;

public class Staff extends Person {
    private Position position = Position.WORKER;

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public Staff(String name, Gender gender, Position position) {
        super(name, gender);
        this.position = position;
    }

    @Override
    public String toString() {
        return "Staff " + name + " - " + position + ", " + gender;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this)
            return true;
        if (obj == null || obj.getClass() != getClass())
            return false;
        var staff = (Staff)obj;
        return staff.name.equals(name) &&
                staff.gender == gender &&
                staff.position == position;
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