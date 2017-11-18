package be.kdg;

import be.kdg.contact.Contact;
import be.kdg.contact.Telefoon;

public class TestContact {
    public static void main(String[] args) {
        Telefoon vastFoutBegin = new Telefoon("vast", "123456789");
        Telefoon vastFoutAantal = new Telefoon("vast", "01234567");
        Telefoon gsmFoutBegin = new Telefoon("mobiel", "479123456");
        Telefoon gsmFoutAantal = new Telefoon("mobiel", "047912345");

        System.out.println(vastFoutBegin.isGeldigNummer() + " "
                + vastFoutAantal.isGeldigNummer() + " "
                + gsmFoutBegin.isGeldigNummer() + " "
                + gsmFoutAantal.isGeldigNummer() );

        Telefoon vast = new Telefoon("vast", "014840816");
        Telefoon gsm = new Telefoon("mobiel", "0497231592");

        System.out.println(vast.isGeldigNummer() + " " + gsm.isGeldigNummer());

        Contact jos = new Contact("Jos Gils", "jos.ergens@where.com", "014840816", "0497231592");
        Contact erik = new Contact("Erik Goossens", "erik.iemand@where.com", "032051800", "0438619041");

        System.out.println("\nMet toString:");
        System.out.println("Contact een");
        System.out.println(jos);
        System.out.println("\nContact twee");
        System.out.println(erik);

        System.out.println("\nMet toonInfo:");
        System.out.println("Contact een");
        jos.toonInfo();
        System.out.println("\nContact twee");
        erik.toonInfo();
    }
}

// Verwachte afdruk

/*
false false false false
true true

Met toString:
Contact een
Naam:Jos Gils
 E-mail: jos.ergens@where.com
 Tel: 014840816
 Gsm: 0497231592

Contact twee
Naam:Erik Goossens
 E-mail: erik.iemand@where.com
 Tel: 032051800
 Gsm: 0438619041

Met toonInfo:
Contact een
Naam: Jos Gils
E-mail: jos.ergens@where.com
Tel: 014840816
Gsm: 0497231592

Contact twee
Naam: Erik Goossens
E-mail: erik.iemand@where.com
Tel: 032051800
Gsm: 0438619041
*/
