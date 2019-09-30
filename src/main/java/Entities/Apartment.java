package Entities;

import Entities.People.Resident;

import java.util.ArrayList;
import java.util.List;

public class Apartment {
    private int number = 0;
    private float powerConsumption = 0;
    private float hotWaterConsumption = 0;
    private float coldWaterConsumption = 0;
    private List<Resident> residents = new ArrayList<>();

    public Apartment() {
    }

    public Apartment(int number) {
        this.number = number;
    }
}
