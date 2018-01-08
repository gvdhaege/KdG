package be.kdg;

import be.kdg.dubbels.Data;
import be.kdg.dubbels.Dubbels;

/*
Gebruik deze klasse om je programma te testen.
 */
public class TestDubbels {
    public static void main(String[] args) {
        Data data = new Data();
        Dubbels dubbels = new Dubbels(data.getData());

        System.out.println("Origineel:\n" + dubbels);
        dubbels.verwijderDubbels();
        System.out.println("\nNa verwijderen dubbels:\n" + dubbels);
    }
}

/*
Origineel:

BMW          Audi         VW           Ford
Opel         Renault      Peugeot      Citroen
Mercedes     Fiat         Ford         BMW
Alfa Romeo   Volvo        Chevrolet    Nissan
Mitsubishi   Subaru       Daihatsu     Kia
Honda        Citroen      Ford         Opel
Dacia        Hyundai      Jaguar       Lancia
Mazda        BMW          Porsche      Ferrari
Maserati     Corvette     Seat         Rolls Royce
Toyota       Suzuki       Hummer       Bentley
Land Rover   Mini         BMW

Na verwijderen dubbels:

Alfa Romeo   Audi         BMW          Bentley
Chevrolet    Citroen      Corvette     Dacia
Daihatsu     Ferrari      Fiat         Ford
Honda        Hummer       Hyundai      Jaguar
Kia          Lancia       Land Rover   Maserati
Mazda        Mercedes     Mini         Mitsubishi
Nissan       Opel         Peugeot      Porsche
Renault      Rolls Royce  Seat         Subaru
Suzuki       Toyota       VW           Volvo
*/