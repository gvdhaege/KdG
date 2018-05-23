package be.kdg.wielrennen.model;

import org.junit.Before;
import org.junit.Test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.*;

public class TestWielRenner {
    private WielRenner wielRenner1;
    private WielRenner wielRenner2;
    private WielRenner wielRenner3;

    @Before
    public void setUp() throws Exception {
        wielRenner1 = new WielRenner("Benoot", "Tiesj", "BELG",
                LocalDate.of(1994, 3, 11), 190, 72.0, "Lotto Soudal", Discipline.RACE);
        wielRenner2 = new WielRenner("Kulhavý", "Jaroslav", "TJSECHS",
                LocalDate.of(1985, 1, 8), 187, 76.0, "Specialized Factory Racing", Discipline.MTB);
        wielRenner3 = new WielRenner("Fumic", "Manuel", "DUITS",
                LocalDate.of(1982, 3, 30), 174, 65.0, "Cannondale Factory Racing", Discipline.MTB);
    }

    @Test
    public void testEquals() {
        assertEquals("De wielrenners moeten gelijk zijn.", wielRenner1, wielRenner1);
        assertEquals("De wielrenners moeten gelijk zijn.", wielRenner2, wielRenner2);
        assertNotEquals("De wielrenners horen niet gelijk te zijn.", wielRenner1, wielRenner2);
        assertEquals("Het gewicht van wielRenner1 hoort <72.0> te zijn.", wielRenner1.getGewicht(), 72.0, 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testOngeldig() {
        wielRenner1.setLengte(270);
        fail("De waarde van lengte hoort tussen 50cm en 250cm te liggen.");
    }

    @Test
    public void testGeldig() {
        try {
            wielRenner1.setLengte(240);
            wielRenner1.setGewicht(80);
        } catch (IllegalArgumentException e) {
            fail("Er mag geen Exception gegooid worden als er correcte waarden gezet worden.");
        }
    }

    @Test
    public void testCompareTo() {
        List<WielRenner> wielRenners = new ArrayList<>();
        wielRenners.add(wielRenner1);
        wielRenners.add(wielRenner2);
        wielRenners.add(wielRenner3);
        Collections.sort(wielRenners);

        assertEquals("wielRenner1 zou alfabetisch als eerste in de lijst moeten staan", wielRenners.get(0), wielRenner1);
        assertEquals("wielRenner2 zou alfabetisch als eerste in de lijst moeten staan", wielRenners.get(2), wielRenner2);
        assertEquals("wielRenner3 zou alfabetisch als eerste in de lijst moeten staan", wielRenners.get(1), wielRenner3);
    }
}