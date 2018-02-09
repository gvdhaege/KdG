package view;

import javafx.scene.input.MouseButton;

public class Presenter {
    private ClearView view;
    private String letters = "qwertyuiopasdfghjklzxcvbnm";

    public Presenter(ClearView view) {
        this.view = view;

        handleEvents();
    }

    private void handleEvents() {
        view.getButton().setOnAction(event -> view.getTextField().setText(""));
        view.getTextField().setOnKeyTyped(event -> {
            if (letters.contains(event.getCharacter())) {
                event.consume();
            }
        });
        view.getButton().setOnMouseClicked(event -> {
            if (event.getButton().equals(MouseButton.SECONDARY)){
                String tekst = view.getTextField().getText();
                view.getTextField().setText(tekst + tekst);
            }
        });
    }

    public ClearView getView() {
        return view;
    }
}
