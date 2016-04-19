package se.patrikbergman.java.autovalue.basic;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BandTest {

    @Test
    public void testAnimal() {
        Band band = Band.create("Iron Maiden", 10);
        assertEquals("Iron Maiden", band.name());
        assertEquals(10, band.rockFactor());

        assertEquals("Band{name=Iron Maiden, rockFactor=10}", band.toString());
    }
}
