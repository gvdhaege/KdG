package be.kdg;

import be.kdg.formule.Piloten;

public class TestPiloten {
    public static void main(String[] args) {
        Piloten piloten = new Piloten();
        piloten.toonPiloten();

        System.out.println("\nPiloot met snelste tijd:");
        System.out.println(piloten.pilootMetSnelsteTijd());

        System.out.println("\nPiloot met traagste tijd:");
        System.out.println(piloten.pilootMetTraagsteTijd());
    }
}

/*
Mark Webber          Red Bull             1:12.810
Sebastian Vettel     Red Bull             1:12.328
Fernando Alonso      Ferrari              1:12.845
Felippe Massa        Ferrari              1:13.516
Kimi Räikkönen       Lotuss               1:13.370
Lewis Hamilton       Mercedes             1:13.267

Piloot met snelste tijd:
Sebastian Vettel     Red Bull             1:12.328

Piloot met traagste tijd:
Felippe Massa        Ferrari              1:13.516
*/

