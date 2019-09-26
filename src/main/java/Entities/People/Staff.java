package Entities.People;

public class Staff extends Person {
    private Position position;
}

enum Position {
    WORKER,
    DIRECTOR
}