package be.kdg;

import be.kdg.gemiddelde.Gemiddelde;

// http://javaboutique.internet.com/tutorials/Chained_Exceptions/index.html

// Gebruik deze klasse om de klasse Gemiddelde te testen.
public class TestGemiddelde {
    public static void main(String[] args) {

        double[] tabel = new double[] { 1.2, 2.1, 3.2, 4.3 };
        double[] tabelLeeg = {};

        berekenGemiddelde(tabel);
        berekenGemiddelde(tabelLeeg);
    }

    private static void berekenGemiddelde(double[] tabel) {
        Gemiddelde gemiddelde = new Gemiddelde();
        System.out.println("Het gemiddelde is: " + gemiddelde.getGemiddelde(tabel));
    }
}

/*
Het gemiddelde is: 2.7
Exception in thread "main" java.lang.RuntimeException: De lijst is leeg
	at be.kdg.gemiddelde.Gemiddelde.getGemiddelde(Gemiddelde.java:20)
	at be.kdg.TestGemiddelde.berekenGemiddelde(TestGemiddelde.java:23)
	at be.kdg.TestGemiddelde.main(TestGemiddelde.java:18)
	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:57)
	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.lang.reflect.Method.invoke(Method.java:606)
	at com.intellij.rt.execution.application.AppMain.main(AppMain.java:120)
Caused by: java.lang.RuntimeException: Deling door nul
	at be.kdg.gemiddelde.Gemiddelde.deel(Gemiddelde.java:34)
	at be.kdg.gemiddelde.Gemiddelde.getGemiddelde(Gemiddelde.java:17)
	... 7 more
*/