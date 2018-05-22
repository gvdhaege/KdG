import annotations.Demo;

public class RunDemo {
    public static void main(String args[]) {
        Demo demo = new Demo();
        demo.demoMethode();
    }
}

/*
  Verwachte afdruk:

Alle annotaties voor klasse MijnKlasse
@annotations.Wat(omschrijving=Een annotatie testklasse)
@annotations.MijnAnnotatie(string=Demo, waarde=99)
Alle parameters voor annotatie Wat
	Een annotatie testklasse
Alle parameters voor annotatie MijnAnnotatie
	Demo
	99
Alle annotaties voor methode demoMethode
@annotations.Wat(omschrijving=Een annotation testmethode)
@annotations.MijnAnnotatie(string=Test, waarde=100)
Alle parameters voor annotatie Wat
	Een annotation testmethode
Alle parameters voor annotatie MijnAnnotatie
	Test
	100
 */

