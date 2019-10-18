package com.vovamisjul.model.entities;

import com.vovamisjul.model.entities.people.Gender;
import com.vovamisjul.model.entities.people.Resident;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class HouseTest {

    private House house;
    @Before
    public void init() {
        house = new House();
    }

    @Test
    public void addAndGetApartments() {
        house.addApartments(new Apartment(1));
        house.addApartments(new Apartment(2));
        assertEquals(house.getApartment(2), new Apartment(2));
    }

    @Test(expected = IllegalArgumentException.class)
    public void getIllegalApartments() {
        house.addApartments(new Apartment(1));
        house.addApartments(new Apartment(2));
        house.getApartment(3);
    }

    @Test
    public void deleteApartments() {
        house.addApartments(new Apartment(2));
        house.deleteApartments(2);
        assertEquals(house, new House());
    }

    @Test
    public void testEqualsAndHashCode() {
        house = new House(new HouseAddress("Minsk", "Gikalo", 9));
        var apartment1 = new Apartment();
        apartment1.addResident(new Resident("petr", Gender.CIS_GENDER));
        var apartment2 = new Apartment();
        apartment2.addResident(new Resident("petr", Gender.CIS_GENDER));
        house.addApartments(apartment1);
        var testHouse = new House(new HouseAddress("Minsk", "Gikalo", 9));
        testHouse.addApartments(apartment2);
        assertEquals(house, testHouse);
        assertEquals(house.hashCode(), testHouse.hashCode());
    }
}