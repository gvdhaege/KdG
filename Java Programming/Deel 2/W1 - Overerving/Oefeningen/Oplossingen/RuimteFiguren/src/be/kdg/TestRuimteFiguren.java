package be.kdg;

import be.kdg.figuren.RuimteFiguren;

/**
 * @author Kristiaan Behiels
 * @version 1.0 25-okt-2013
 */

/*
Gebruik deze klasse om je programma te testeh.
 */
public class TestRuimteFiguren {
    private static RuimteFiguren figuren = new RuimteFiguren();

    public TestRuimteFiguren() {
        figuren = new RuimteFiguren();
    }

    public static void toonFiguren() {
        figuren.toonFiguren();
    }

    public static void main(String[] args) {
        toonFiguren();
    }
}

// Verwachte afdruk:
/*
kleur: zwart   oppervlakte: 12,566   inhoud: 4,189
kleur: zwart   oppervlakte: 24,000   inhoud: 8,000
kleur: groen   oppervlakte: 37,699   inhoud: 15,708
kleur: geel    oppervlakte: 54,000   inhoud: 27,000
kleur: rood    oppervlakte: 50,265   inhoud: 33,510
 */

