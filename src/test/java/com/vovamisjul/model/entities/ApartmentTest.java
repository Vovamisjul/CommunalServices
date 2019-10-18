package com.vovamisjul.model.entities;

import com.vovamisjul.model.entities.people.Gender;
import com.vovamisjul.model.entities.people.Resident;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ApartmentTest {

    private Apartment apartment;
    @Before
    public void init() {
        apartment = new Apartment();
    }
    @Test
    public void incPowerCons() {
        apartment.incPowerCons(0.4);
        assertEquals(apartment.getPowerConsumption(), 0.4, 0.001);
    }

    @Test
    public void resetConsumptions() {
        apartment.resetConsumptions();
        assertEquals(apartment.getPowerConsumption(), 0, 0.001);
    }

    @Test
    public void addResident() {
        apartment.addResident(new Resident("ivan", Gender.CIS_GENDER));
        apartment.addResident(new Resident("petr", Gender.FEMALE));
        assertEquals(apartment.getResident(0), new Resident("ivan", Gender.CIS_GENDER));
    }

    @Test
    public void testEqualsAndHashCode() {
        apartment = new Apartment(1);
        apartment.addResident(new Resident("ivan", Gender.CIS_GENDER));
        apartment.incPowerCons(0.4);
        var newApartment = new Apartment(1);
        newApartment.addResident(new Resident("ivan", Gender.CIS_GENDER));
        newApartment.incPowerCons(0.4);
        assertEquals(apartment, newApartment);
        assertNotEquals(apartment, new Apartment(1));
        assertEquals(apartment.hashCode(), newApartment.hashCode());
    }
}