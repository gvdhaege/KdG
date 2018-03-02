package contact.model;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Messenger {

    public void send(String naam, String voornaam, String email, String bericht) {
        final Message message = new Message(naam, voornaam, email, bericht);
        this.save(message);
    }

    private void save(Message message) {
//        Path messageText = Paths.get("/Users/stevene/Desktop/Test/message.txt");
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("message.txt"))) {
            writer.write("Naam:     " + message.getNaam());
            writer.newLine();
            writer.write("Voornaam: " + message.getVoornaam());
            writer.newLine();
            writer.write("Email:    " + message.getEmail());
            writer.newLine();
            writer.write("Bericht:");
            writer.newLine();
            writer.write(message.getBericht());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
