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
        try (BufferedWriter os = new BufferedWriter(new FileWriter("message.txt"))) {
            os.write("Naam:     " + message.getNaam());
            os.newLine();
            os.write("Voornaam: " + message.getVoornaam());
            os.newLine();
            os.write("Email:    " + message.getEmail());
            os.newLine();
            os.write("Bericht:");
            os.newLine();
            os.write(message.getBericht());
        }
        catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
