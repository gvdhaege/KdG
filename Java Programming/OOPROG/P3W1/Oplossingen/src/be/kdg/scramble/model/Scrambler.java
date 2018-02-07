package be.kdg.scramble.model;

import java.util.*;

/**
 * Created by vochtenh on 25/01/2016.
 */
public class Scrambler {
    private String tekst = "test";

    public void setTekst(String tekst) {
        this.tekst = tekst;
    }

    public String getTekst() {
        return tekst;
    }

    public void scramble(){
        List<String> letters = Arrays.asList(tekst.split(""));
        Collections.shuffle(letters);
        this.tekst = "";
        for (String letter: letters) {
            tekst += letter;
        }
    }

}
