package be.kdg.wielrennen.model;

import org.junit.Before;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.*;

public class TestWielRenners {
    private WielRenner wielRenner1;
    private WielRenner wielRenner2;
    private WielRenner wielRenner3;
    private WielRenners wielRenners;

    @Before
    public void setUp() throws Exception {
        wielRenners = new WielRenners();
        wielRenner1 = new WielRenner("Benoot", "Tiesj", "BELG",
                LocalDate.of(1994, 3, 11), 190, 72.0, "Lotto Soudal", Discipline.RACE);
        wielRenner2 = new WielRenner("Kulhavý", "Jaroslav", "TJSECHS",
                LocalDate.of(1985, 1, 8), 187, 76.0, "Specialized Factory Racing", Discipline.MTB);
        wielRenner3 = new WielRenner("Fumic", "Manuel", "DUITS",
                LocalDate.of(1982, 3, 30), 174, 65.0, "Cannondale Factory Racing", Discipline.MTB);

        wielRenners.voegToe(wielRenner1);
        wielRenners.voegToe(wielRenner2);
        wielRenners.voegToe(wielRenner3);
    }

    @Test
    public void testToevoegen() {
        assertEquals("Er zouden <3> wielrenners toegevoegd moeten zijn.", wielRenners.getAantal(), 3);
        assertNotNull(wielRenners.zoek("Benoot", "Tiesj"));
        assertNotNull(wielRenners.zoek("Kulhavý", "Jaroslav"));
        assertNotNull(wielRenners.zoek("Fumic", "Manuel"));
    }

    @Test
    public void testVerwijderen() {
        wielRenners.verwijder("Fumic", "Manuel");

        assertEquals("Na het verwijderen zouden er nog <2> wielrenners in de lijst moeten zitten.", wielRenners.getAantal(), 2);
        assertNotNull(wielRenners.zoek("Benoot", "Tiesj"));
        assertNotNull(wielRenners.zoek("Kulhavý", "Jaroslav"));
        assertNull(wielRenners.zoek("Fumic", "Manuel"));
    }
}