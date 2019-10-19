package com.vovamisjul.model;

import com.sun.source.tree.Tree;
import com.vovamisjul.model.entities.House;
import com.vovamisjul.model.entities.HouseAddress;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CommunalServices implements Serializable {
    private TreeMap<HouseAddress, House> servicedHouses = new TreeMap<>();

    public CommunalServices() {
    }

    public void addHouse(House house) {
        if (servicedHouses.containsKey(house.getAddress()))
            throw new IllegalArgumentException("House with this address already exists");
        servicedHouses.put(house.getAddress(), house);
    }

    public House getHouse(HouseAddress address) {
        if (servicedHouses.containsKey(address))
            return servicedHouses.get(address);
        throw new IllegalArgumentException("There are no such house");
    }

    public void deleteHouse(HouseAddress address) {
        servicedHouses.remove(address);
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (var house: servicedHouses.values()
             ) {
            result.append(house.getAddress()).append("\n");
        }
        if (result.length() == 0)
            return "empty";
        return result.substring(0, result.length() - "\n".length());
    }

    @Override
    public int hashCode() {
        return servicedHouses.hashCode();
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
