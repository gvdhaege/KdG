package be.kdg.vorm;

/**
 * @author Kristiaan Behiels
 * @version 1.0 19/10/13
 */
public class TestVorm {
    public static void main(String[] args) {
        Bol bol = new Bol("rood", 10);
        Bol knikker = new Bol("blauw", 1);
        Piramide piramide = new Piramide("groen", 10, 12);
        Piramide artifact = new Piramide("geel", 1, 1);

        System.out.println("bol = " + bol);
        System.out.println("knikker = " + knikker);
        System.out.println("piramide = " + piramide);
        System.out.println("artifact = " + artifact);

        artifact.setKleur("orange");
        artifact.setZijde(2);
        artifact.setHooogte(2);

        System.out.println("Na wijzigen kleur.");
        System.out.println("artifact = " + artifact);
    }
}

/*
bol = Kleur: rood, straal: 10  oppervlakte: 1256,637  volume: 4188,790
knikker = Kleur: blauw, straal: 1  oppervlakte: 12,566  volume: 4,189
piramide = Kleur: groen, zijde: 10, hoogte: 12  oppervlakte: 360,000  volume: 400,000
artifact = Kleur: geel, zijde: 1, hoogte: 1  oppervlakte: 3,236  volume: 0,333
Na wijzigen kleur.
artifact = Kleur: orange, zijde: 2, hoogte: 2  oppervlakte: 12,944  volume: 2,667
*/

