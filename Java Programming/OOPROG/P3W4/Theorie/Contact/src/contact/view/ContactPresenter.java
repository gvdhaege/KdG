package contact.view;

import contact.model.Messenger;

public class ContactPresenter {
    private final Messenger model;
    private final ContactView view;

    public ContactPresenter(Messenger model, ContactView view) {
        this.model = model;
        this.view = view;

        this.addEventHandlers();
    }

    private void addEventHandlers() {
        this.view.getVerzendButton().setOnAction(event -> {
            final String naam = this.view.getNaamInput().getText();
            final String voornaam = this.view.getVoornaamInput().getText();
            final String email = this.view.getEmailInput().getText();
            final String bericht = this.view.getBerichtInput().getText();
            this.model.send(naam, voornaam, email, bericht);
            this.view.getNaamInput().clear();
            this.view.getVoornaamInput().clear();
            this.view.getBerichtInput().clear();
            this.view.getEmailInput().clear();
        });
    }

    private void updateView() {

    }
}
