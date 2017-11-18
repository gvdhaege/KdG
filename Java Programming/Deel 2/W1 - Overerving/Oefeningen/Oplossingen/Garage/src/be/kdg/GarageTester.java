package be.kdg;

import be.kdg.garage.Auto;
import be.kdg.garage.Garage;

/*
In deze klasse mag je niets wijzigen. Bestudeer ze gronding en gebruik ze om je code te testen.
*/
public class GarageTester {
    public static void main(String[] args) {
        Auto auto = new Auto("Ford S-MAX");
        Garage garage = new Garage("Neyt");
        auto.setGarage(garage);

        System.out.println(auto);  // impliciete oproep toString

        auto = new Auto("Ford Focus", garage);

        System.out.println(auto);  // impliete oproep toString

        auto = new Auto("Mercedes C", new Garage("Van Winkel"));

        System.out.println(auto);  // impliciete oproep toString

        Auto kopie = new Auto(auto);

        System.out.println(kopie);  // impliciete oproep toString
    }
}

/*
Auto: Ford S-MAX Garage: Neyt
Auto: Ford Focus Garage: Neyt
Auto: Mercedes C Garage: Van Winkel
Auto: Mercedes C Garage: Van Winkel
*/