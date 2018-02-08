package View;

import Model.Student;
import Model.StudentAdministratie;

public class Presenter {
    private StudentAdministratie model;
    private StudentView view;

    private int current = 0;

    public Presenter(StudentAdministratie model, StudentView view) {
        this.model = model;
        this.view = view;
        updateView();
        handleEvents();
    }

    private void handleEvents() {
        view.getBtnVolgende().setOnAction(event -> {
            current = Math.min(current + 1, model.getStudenten().size() - 1);
            updateView();
        });
        view.getBtnVorige().setOnAction(event -> {
            current = Math.max(current - 1, 0);
            updateView();
        });
    }

    private void updateView() {
        Student currentStudent = model.getStudenten().get(current);
        view.getTfNaam().setText(currentStudent.getNaam());
        view.getTfVoornaam().setText(currentStudent.getVoornaam());
        view.getTfNummer().setText(Integer.toString(currentStudent.getNummer()));
        view.getTfKlas().setText(currentStudent.getKlas());
    }
}

