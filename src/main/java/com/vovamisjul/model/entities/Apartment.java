package com.vovamisjul.model.entities;

import com.vovamisjul.model.entities.people.Resident;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Apartment implements Serializable {
    private int number = 0;
    private double powerConsumption = 0;
    private double hotWaterConsumption = 0;
    private double coldWaterConsumption = 0;
    private List<Resident> residents = new ArrayList<>();

    public Apartment() {
    }

    public Apartment(int number) {
        this.number = number;
    }

    public void incPowerCons(double delta) {
        powerConsumption += delta;
    }

    public void incHotWaterCons(double delta) {
        hotWaterConsumption += delta;
    }

    public void incColdWaterCons(double delta) {
        coldWaterConsumption += delta;
    }

    public void resetConsumptions() {
        powerConsumption = hotWaterConsumption = coldWaterConsumption = 0;
    }

    public List<Resident> getResidents() {
        return residents;
    }

    public void addResident(Resident resident) {
        residents.add(resident);
    }

    public Resident getResident(int index){
        return residents.get(index);
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
