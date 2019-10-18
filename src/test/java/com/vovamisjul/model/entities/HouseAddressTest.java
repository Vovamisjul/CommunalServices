package com.vovamisjul.model.entities;

import org.junit.Test;

import static org.junit.Assert.*;

public class HouseAddressTest {

    @Test
    public void testEqualsAndHashCode() {
        var address1 = new HouseAddress("Minsk", "Gikalo", 9);
        var address2 = new HouseAddress("Minsk", "Gikalo", 9);
        assertEquals(address1, address2);
        assertEquals(address1.hashCode(), address2.hashCode());
    }
}