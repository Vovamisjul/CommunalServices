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

    @Test
    public void testCompareTo1() {
        var address1 = new HouseAddress("Minsk", "Gikalo", 9);
        var address2 = new HouseAddress("Minsk", "Gikalo", 9);
        assertTrue(address1.compareTo(address2) == 0);
    }

    @Test
    public void testCompareTo2() {
        var address1 = new HouseAddress("Minsk", "Gikalo", 9);
        var address2 = new HouseAddress("Ainsk", "Gikalo", 9);
        assertTrue(address1.compareTo(address2) > 0);
    }

    @Test
    public void testCompareTo3() {
        var address1 = new HouseAddress("Minsk", "Gikalo", 9);
        var address2 = new HouseAddress("Ainsk", "Zikalo", 9);
        assertTrue(address1.compareTo(address2) > 0);
    }

    @Test
    public void testCompareTo4() {
        var address1 = new HouseAddress("Minsk", "Gikalo", 9);
        var address2 = new HouseAddress("Minsk", "Aikalo", 1111);
        assertTrue(address1.compareTo(address2) > 0);
    }

    @Test
    public void testCompareTo5() {
        var address1 = new HouseAddress("kek", "lol", 321);
        var address2 = new HouseAddress("kek", "loa", 333);
        assertTrue(address1.compareTo(address2) > 0);
    }
}