package be.kdg.studenten.view;

import be.kdg.studenten.model.Student;
import be.kdg.studenten.model.StudentAdministratie;

public class Presenter {
    private final StudentAdministratie model;
    private final StudentView view;

    private int currentStudent;

    public Presenter(StudentAdministratie model, StudentView view) {
        this.model = model;
        this.view = view;
        this.currentStudent = 0;

        this.addEventHandlers();
        this.updateView();
    }

    private void addEventHandlers() {
        this.view.getBtnVorige().setOnAction(event -> {
            currentStudent--;
            this.updateView();
        });

        this.view.getBtnVolgende().setOnAction(event -> {
            currentStudent++;
            this.updateView();
        });
    }

    private void updateView() {
        if (this.currentStudent == 0) {
            this.view.getBtnVorige().setDisable(true);
        }
        else {
            this.view.getBtnVorige().setDisable(false);
        }

        if (this.currentStudent == this.model.getStudenten().size() - 1) {
            this.view.getBtnVolgende().setDisable(true);
        }
        else {
            this.view.getBtnVolgende().setDisable(false);
        }

        final Student student = this.model.getStudenten().get(this.currentStudent);
        this.view.getTfNaam().setText(student.getNaam());
        this.view.getTfVoornaam().setText(student.getVoornaam());
        this.view.getTfNummer().setText(String.valueOf(student.getNummer()));
        this.view.getTfKlas().setText(student.getKlas());
    }
}
