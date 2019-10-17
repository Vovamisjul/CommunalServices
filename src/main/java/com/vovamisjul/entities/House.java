package com.vovamisjul.entities;

import java.util.ArrayList;
import java.util.List;

public class House {
    private HouseAddress address = new HouseAddress();
    private List<Apartment> apartments = new ArrayList<>();

    public HouseAddress getAddress() {
        return address;
    }

    public List<Apartment> getApartments() {
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

    public Apartment getApartment(int i) throws Exception{
        if (i > apartments.size() || i < 0)
            throw new IllegalArgumentException("Number of apartment is out of bounds!");
        return apartments.get(i);
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append("Address: ").append(address).append("\n").append("Apartments: ");
        for (var apartment: apartments
        ) {
            result.append(apartment).append("\n");
        }
        return result.substring(0, result.length() - "\n".length());
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
        return super.hashCode();
    }
}
