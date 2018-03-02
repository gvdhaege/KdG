package model;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;
import java.util.stream.Collectors;

public class MailingList {
    private static final File BESTAND = new File("email_adressen.txt");

    private final Set<EmailAddress> addresses;

    public MailingList() {
        this.addresses = new TreeSet<>();
    }

    public void addEmailAddress(EmailAddress address) {
        this.addresses.add(address);
    }

    public List<String> getEmailAddresses() {
        final List<String> stringList = this.addresses.stream().map(EmailAddress::toString).collect(Collectors.toList());
        return Collections.unmodifiableList(stringList);
    }

    public void removeEmailAddress(String address) {
        for (Iterator<EmailAddress> i = this.addresses.iterator(); i.hasNext(); ) {
            EmailAddress emailAddress = i.next();
            if (emailAddress.toString().equals(address)) {
                i.remove();
                return;
            }
        }
    }

    public void loadFromDisk() throws IOException {
        try (Scanner scanner = new Scanner(BESTAND)) {
            while (scanner.hasNextLine()) {
                this.addresses.add(new EmailAddress(scanner.nextLine()));
            }
        }
    }

    public void saveToDisk() throws IOException {
        try (PrintWriter printWriter = new PrintWriter(BESTAND)) {
            for (EmailAddress address : addresses) {
                printWriter.format("%s%n", address.toString());
            }
        }
    }
}
