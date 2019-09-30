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

    public void incPowerCons(float delta) {
        powerConsumption += delta;
    }

    public void incHotWaterCons(float delta) {
        hotWaterConsumption += delta;
    }

    public void incColdWaterCons(float delta) {
        coldWaterConsumption += delta;
    }

    public void resetConsumptions() {
        powerConsumption = hotWaterConsumption = coldWaterConsumption = 0;
    }

    @Override
    public String toString() {
        return "Apartment " + number;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this)
            return true;
        if (obj == null || obj.getClass() != getClass())
            return false;
        var apartment = (Apartment)obj;
        return apartment.number == number &&
                apartment.powerConsumption == powerConsumption &&
                apartment.coldWaterConsumption == coldWaterConsumption &&
                apartment.hotWaterConsumption == hotWaterConsumption &&
                apartment.residents.equals(residents);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

}
