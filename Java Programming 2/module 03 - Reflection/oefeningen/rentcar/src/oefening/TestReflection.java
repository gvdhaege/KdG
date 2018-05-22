package oefening;

import oefening.reflection.RentCar;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class TestReflection {
    public static void main(String[] args) {
        Class<RentCar> rental = RentCar.class;
        try {
            System.out.println("Package naam: " + rental.getPackage());
            System.out.println("Constructor: " + rental.getConstructor(int.class));
            System.out.print("Methoden: ");
            for (Method method : rental.getMethods()) {
                System.out.print(method.getName() + " ");
            }
            System.out.print("\nAttributen: ");
            for (Field field : rental.getDeclaredFields()) {
                System.out.print(field.getName() + " ");
            }
            System.out.println("\n");
            Constructor<RentCar> constructor = rental.getConstructor();
            RentCar car = constructor.newInstance();

            Method method = rental.getMethod("computeRentalCost", int.class);
            method.invoke(car, 4);

            Field field = RentCar.class.getDeclaredField("type");
            field.setAccessible(true);
            field.set(car, "extra large");
            System.out.println("Waarde van type: " + ((RentCar) car).getType());
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
