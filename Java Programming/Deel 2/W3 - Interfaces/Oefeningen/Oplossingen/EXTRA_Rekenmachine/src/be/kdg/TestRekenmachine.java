package be.kdg;


import be.kdg.rekenmachine.*;

public class TestRekenmachine {
    public static void main(String[] args) {
        Rekenmachine calculator = new Rekenmachine();
        calculator.installeer(new Optelling());
        calculator.installeer(new Aftrekking());
        calculator.installeer(new Vermenigvuldiging());
        calculator.installeer(new Deling());
        calculator.installeer(new Power());
        calculator.installeer(new Minimum());
        calculator.installeer(new Maximum());

        calculator.toonPlugins();

        System.out.println("4 + 6 = " + calculator.bereken("+", 4, 6));
        System.out.println("4 - 6 = " + calculator.bereken("-", 4, 6));
        System.out.println("4 * 6 = " + calculator.bereken("*", 4, 6));
        System.out.println("4 / 6 = " + calculator.bereken("/", 4, 6));
        System.out.println("4 ^ 6 = " + calculator.bereken("pow", 4, 6));
        System.out.println("minimum (4,6) = " + calculator.bereken("min", 4, 6));
        System.out.println("maximum (4,6) = " + calculator.bereken("max", 4, 6));
    }
}

/*
Plugins: + - * / pow min max
4 + 6 = 10.0
4 - 6 = -2.0
4 * 6 = 24.0
4 / 6 = 0.6666666666666666
4 ^ 6 = 4096.0
minimum (4,6) = 4.0
maximum (4,6) = 6.0
 */
