package com.vovamisjul.model.entities;

import org.apache.commons.lang.builder.HashCodeBuilder;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class House implements Serializable {
    private HouseAddress address = new HouseAddress();
    private Map<Integer, Apartment> apartments = new HashMap<>();

    public HouseAddress getAddress() {
        return address;
    }

    public Map<Integer, Apartment> getApartments() {
        return apartments;
    }

    public House() {
    }

    public House(HouseAddress address) {
        this.address = address;
    }

    public int getApartmentsCount() {
        return apartments.size();
    }

    public Apartment getApartment(int index){
        return apartments.get(index);
    }

    public void addApartments(Apartment apartment) {
        if (apartments.containsKey(apartment.getNumber()))
            throw new IllegalArgumentException("Apartment with this key already exists");
        apartments.put(apartment.getNumber(), apartment);
    }

    public void deleteApartments(int index) {
        apartments.remove(index);
    }

    @Override
    public String toString() {
        var result = new StringBuilder();
        result.append("Address: ").append(address).append("\n").append("Apartments: ");
        if (apartments.size() == 0) {
            result.append("empty");
            return result.toString();
        }
        for (var apartment: apartments.values()
        ) {
            result.append(apartment.getNumber()).append(", ");
        }
        return result.substring(0, result.length() - ", ".length());
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this)
            return true;
        if (obj == null || obj.getClass() != getClass())
            return false;
        var house = (House)obj;
        return house.apartments.equals(apartments) &&
                house.address.equals(address);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(apartments).append(address).toHashCode();
    }
}
