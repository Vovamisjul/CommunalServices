package com.vovamisjul.model.entities;

import java.io.Serializable;
import org.apache.commons.lang.builder.HashCodeBuilder;

public class HouseAddress implements Serializable, Comparable<HouseAddress> {
    private final String city;
    private final String street;
    private final int house;

    public HouseAddress() {
        city = "";
        street = "";
        house = 0;
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
        return new HashCodeBuilder().append(city).append(street).append(house).toHashCode();
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
                address.house == house;
    }

    @Override
    public int compareTo(HouseAddress o) {
        int res;
        if ((res = city.compareTo(o.city)) != 0)
            return res;
        if ((res = street.compareTo(o.street)) != 0)
            return res;
        return Integer.compare(house, o.house);
    }
}
