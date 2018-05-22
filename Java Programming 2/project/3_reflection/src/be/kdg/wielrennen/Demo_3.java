package be.kdg.wielrennen;

import be.kdg.wielrennen.model.WielRenner;
import be.kdg.wielrennen.model.WielRenners;
import be.kdg.wielrennen.reflection.ReflectionTools;

public class Demo_3 {
    public static void main(String[] args) {
        ReflectionTools.classAnalysis(WielRenner.class);
        ReflectionTools.classAnalysis(WielRenners.class);
        System.out.printf("Aangemaakt object door runAnnotated: \n%s", ReflectionTools.runAnnotated(WielRenner.class));
    }
}
