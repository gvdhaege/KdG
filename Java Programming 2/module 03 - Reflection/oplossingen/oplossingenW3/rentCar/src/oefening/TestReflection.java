package oefening;

import oefening.reflection.RentCar;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class TestReflection {
    public static void main(String[] args) {
        Class<RentCar> rental = RentCar.class;

        try {
            // Druk de packagenaam van de klasse af
            System.out.print("Package naam: " + rental.getPackage());

            // Druk de constructor met als parameter het type int af
            System.out.println("\nConstructor: " + rental.getConstructor(Integer.TYPE));

            // Druk de namen van alle methoden (ook die van de superklasse) af
            System.out.print("Methoden: ");
            for (Method method : rental.getMethods()) {
                System.out.print(method.getName() + " ");
            }
            System.out.println();

            // Druk de namen van de private attributes af
            System.out.print("Attributen: ");
            for (Field field : RentCar.class.getDeclaredFields()) {
                System.out.print(field.getName() + " ");
            }
            System.out.println("\n");

            // Maak een Constructor object (zonder parameter) en maaak een nieuw object met de naam Car.
            Constructor<RentCar> constructor = rental.getConstructor();
            RentCar car = constructor.newInstance();

            // Haal de methode computeRentalCost op en voer ze uit met als parameterwaarde 4.
            Method method = rental.getMethod("computeRentalCost", Integer.TYPE);
            method.invoke(car, 4);

            // Haal het attribuut type op en maak het toegangkelijk voor reflection
            Field privateField = RentCar.class.getDeclaredField("type");
            privateField.setAccessible(true);

            // Wijzig nu de waarde van type in het Car object naar "extra large" en druk de nieuwe waarde af ter controle
            privateField.set(car, "extra large");
         //   System.out.println("Waarde van type: " + privateField.get(car));
            System.out.println("Waarde van type: " + car.getType());

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}

/*
    Package naam: package oefening.reflection
    Constructor: public oefening.reflection.RentCar(int)
    Methoden: getType setRate setType getRate computeRentalCost wait wait wait equals toString hashCode getClass notify notifyAll
    Attributen: rate type price

    The cost of your rental car is €180
    Waarde van type: extra large
*/
