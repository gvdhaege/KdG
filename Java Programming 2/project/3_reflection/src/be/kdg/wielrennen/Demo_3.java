package be.kdg.wielrennen;

import be.kdg.wielrennen.model.WielRenner;
import be.kdg.wielrennen.model.WielRenners;
import be.kdg.wielrennen.reflection.ReflectionTools;

public class Demo_3 {
    public static void main(String[] args) {
        //opdracht 2.4 & 2.5
        ReflectionTools.classAnalysis(WielRenner.class);
        ReflectionTools.classAnalysis(WielRenners.class);

        //opdracht 3.5
        System.out.printf("\nAangemaakt object door runAnnotated: \n%s", ReflectionTools.runAnnotated(WielRenner.class));
    }
}
