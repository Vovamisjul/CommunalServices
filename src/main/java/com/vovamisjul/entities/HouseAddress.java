package com.vovamisjul.entities;

public class HouseAddress {
    private String city = "";
    private String street = "";
    private int house = 0;

    public HouseAddress() {
    }

    public HouseAddress(String city, String street, int house) {
        this.city = city;
        this.street = street;
        this.house = house;
    }

    @Override
    public String toString() {
        return "City: " + city + "; street: " + street + "; number: " + house;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this)
            return true;
        if (obj == null || obj.getClass() != getClass())
            return false;
        var address = (HouseAddress)obj;
        return address.city.equals(city) &&
                address.street.equals(street) &&
                address.house== house;
    }
}
