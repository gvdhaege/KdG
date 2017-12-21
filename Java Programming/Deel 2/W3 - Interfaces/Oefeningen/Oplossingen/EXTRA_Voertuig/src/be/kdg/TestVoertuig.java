package be.kdg;

import be.kdg.voertuig.AutoImpl;
import be.kdg.voertuig.Garage;
import be.kdg.voertuig.MotorImpl;

/**
 * Deze klasse dient uitsluitend om de goede werking van de overige klassen te testen.
 * Je mag er niets aan veranderen. Zie verder voor de verwachte afdruk.
 */
public class TestVoertuig {
    public static void main(String[] args) {
        Garage garage = new Garage();

        garage.voegToe(new AutoImpl("Porsche", "Boxter S", new MotorImpl(6, 3387, 217), 1355));
        garage.voegToe(new AutoImpl("Porsche", "Cayman", new MotorImpl(6, 2687, 155), 1305));
        garage.voegToe(new AutoImpl("Porsche", "GT3", new MotorImpl(6, 3600, 305), 1395));
        garage.voegToe(new AutoImpl("Porsche", "Carrera S", new MotorImpl(6, 3824, 261), 1420));

        garage.sorteer();
        System.out.println(garage);
    }
}

/*
Merk en type: Porsche Cayman
Motor: 6 cilinders 2687cc 155kW
Gewicht: 1305kg
Vermogen per liter; 57,69
kg per kW: 8,42

Merk en type: Porsche Boxter S
Motor: 6 cilinders 3387cc 217kW
Gewicht: 1355kg
Vermogen per liter; 64,07
kg per kW: 6,24

Merk en type: Porsche Carrera S
Motor: 6 cilinders 3824cc 261kW
Gewicht: 1420kg
Vermogen per liter; 68,25
kg per kW: 5,44

Merk en type: Porsche GT3
Motor: 6 cilinders 3600cc 305kW
Gewicht: 1395kg
Vermogen per liter; 84,72
kg per kW: 4,57
*/
