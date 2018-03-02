package be.kdg.contact.model;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Messenger {
    public void send(String naam, String voornaam, String email, String bericht) {
        final Message message = new Message(naam, voornaam, email, bericht);
        this.save(message);
    }

    private void save(Message message) {
        // Hier aanvullen...
    }
}
