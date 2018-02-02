package be.kdg.dictee.view;

import be.kdg.dictee.model.Dictee;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class Presenter {
    private Dictee dictee;
    private DicteeView dicteeView;

    public Presenter(Dictee dictee, DicteeView dicteeView) {
        this.dictee = dictee;
        this.dicteeView = dicteeView;
        addEventHandlers();
        updateView();
    }

    private void updateView() {
    }

    private void addEventHandlers() {
        dicteeView.getBtnLeesVoor().setOnAction(
                new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        dictee.setTekst(dicteeView.getTextDictee().getText());
                        dictee.leesVoor();
                    }
                }
        );
    }
}
