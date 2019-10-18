package com.vovamisjul.model.entities.people;

import org.junit.Test;

import static org.junit.Assert.*;

public class ResidentTest {

    @Test
    public void testEqualsAndHashCode() {
        var resident1 = new Resident("Ivan", Gender.GENDER_FLUID);
        var resident2 = new Resident("Ivan", Gender.GENDER_FLUID);
        assertEquals(resident1, resident2);
        assertEquals(resident1.hashCode(), resident2.hashCode());
    }
}