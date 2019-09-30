package Entities;

import java.util.ArrayList;
import java.util.List;

public class House {
    public HouseAddress getAddress() {
        return address;
    }

    private HouseAddress address = new HouseAddress();

    public List<Apartment> getApartments() {
        return apartments;
    }

    private List<Apartment> apartments = new ArrayList<>();

    public House() {
    }

    public House(HouseAddress address, List<Apartment> apartments) {
        this.address = address;
        this.apartments = apartments;
    }

    public int getApartmentsCount() {
        return apartments.size();
    }

    public Apartment getApartment(int i) throws Exception{
        if (i > apartments.size() || i < 0)
            throw new IllegalArgumentException("Number of apartment is out of bounds!");
        return apartments.get(i);
    }
}
