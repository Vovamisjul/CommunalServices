package com.vovamisjul.model;

import com.vovamisjul.model.entities.Apartment;
import com.vovamisjul.model.entities.House;
import com.vovamisjul.model.entities.HouseAddress;
import com.vovamisjul.model.entities.people.Gender;
import com.vovamisjul.model.entities.people.Resident;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CommunalServicesTest {

    private CommunalServices communalServices;
    @Before
    public void init() {
        communalServices = new CommunalServices();
    }

    @Test
    public void addAndGetApartments() {
        var house = new House(new HouseAddress("Minsk", "Gikalo", 9));
        communalServices.addHouse(house);
        assertEquals(communalServices.getHouse(new HouseAddress("Minsk", "Gikalo", 9)), house);
    }

    @Test(expected = IllegalArgumentException.class)
    public void getIllegalApartments() {
        var house = new House(new HouseAddress("Minsk", "Gikalo", 9));
        communalServices.addHouse(house);
        communalServices.getHouse(new HouseAddress("Minsk", "P. Brovki", 9));
    }

    @Test
    public void testEqualsAndHashCode() {
        var house1 = new House(new HouseAddress("Minsk", "Gikalo", 9));
        var apartment1 = new Apartment();
        apartment1.addResident(new Resident("petr", Gender.CIS_GENDER));
        var apartment2 = new Apartment();
        apartment2.addResident(new Resident("petr", Gender.CIS_GENDER));
        house1.addApartments(apartment1);
        var house2 = new House(new HouseAddress("Minsk", "Gikalo", 9));
        house2.addApartments(apartment2);
        communalServices.addHouse(house1);
        var communalServices2 = new CommunalServices();
        communalServices2.addHouse(house2);
        assertEquals(communalServices, communalServices2);
        assertEquals(communalServices.hashCode(), communalServices2.hashCode());
    }
}