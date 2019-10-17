package com.vovamisjul.model;

import com.vovamisjul.model.entities.House;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class CommunalServices implements Serializable {
    private List<House> servicedHouses = new ArrayList<>();

    public CommunalServices() {
    }

    public void addHouse(House house) {
        servicedHouses.add(house);
    }

    public List<House> getServicedHouses() {
        return servicedHouses;
    }

    public House getHouse(int index) {
        return servicedHouses.get(index);
    }

    public void deleteHouse(int index) {
        servicedHouses.remove(index);
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (var house: servicedHouses
             ) {
            result.append(house).append("\n");
        }
        if (result.length() == 0)
            return "empty";
        return result.substring(0, result.length() - "\n".length());
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
        var service = (CommunalServices)obj;
        return service.servicedHouses.equals(servicedHouses);
    }
}
