package be.kdg.studenten.view;

import be.kdg.studenten.model.Student;
import be.kdg.studenten.model.StudentAdministratie;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

/**
 * Created by vochtenh on 25/01/2016.
 */
public class Presenter {
    private StudentAdministratie model;
    private StudentView view;

    private int current = 0;//presenter houdt bij welke we aan het bekijken zijn...

    public Presenter(StudentAdministratie model, StudentView view) {
        this.model = model;
        this.view = view;
        updateView();
        handleEvent();
    }

    private void updateView() {
        Student currentStudent = model.getStudenten().get(current);
        view.getTfNaam().setText(currentStudent.getNaam());
        view.getTfVoornaam().setText(currentStudent.getVoornaam());
        view.getTfNummer().setText(Integer.toString(currentStudent.getNummer()));
        view.getTfKlas().setText(currentStudent.getKlas());
    }

    private void handleEvent() {
        view.getBtnVolgende().setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                current = Math.min(current + 1, model.getStudenten().size()-1);
                updateView();
            }
        });
        view.getBtnVorige().setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                current = Math.max(current - 1, 0);
                updateView();
            }
        });
    }
}
