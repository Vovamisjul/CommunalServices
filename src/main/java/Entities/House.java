package Entities;

import java.util.ArrayList;
import java.util.List;

public class House {
    private HouseAddress address;
    private List<Apartment> apartments = new ArrayList<>();

    public House() {
    }

    public House(HouseAddress address) {
        this.address = address;
    }
}
