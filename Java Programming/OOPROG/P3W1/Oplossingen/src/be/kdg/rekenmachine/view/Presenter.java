package be.kdg.rekenmachine.view;

import be.kdg.rekenmachine.model.Calculator;
import be.kdg.rekenmachine.model.OperandCharacter;
import be.kdg.rekenmachine.model.Operator;

public class Presenter {
    private final Calculator model;
    private final CalculatorPane view;

    public Presenter(Calculator model, CalculatorPane view) {
        this.model = model;
        this.view = view;

        this.addEventHandlers();
    }

    private void addEventHandlers() {
        this.view.getZeroButton().setOnAction(event -> this.handleOperandCharacter(OperandCharacter.ZERO));
        this.view.getOneButton().setOnAction(event -> this.handleOperandCharacter(OperandCharacter.ONE));
        this.view.getTwoButton().setOnAction(event -> this.handleOperandCharacter(OperandCharacter.TWO));
        this.view.getThreeButton().setOnAction(event -> this.handleOperandCharacter(OperandCharacter.THREE));
        this.view.getFourButton().setOnAction(event -> this.handleOperandCharacter(OperandCharacter.FOUR));
        this.view.getFiveButton().setOnAction(event -> this.handleOperandCharacter(OperandCharacter.FIVE));
        this.view.getSixButton().setOnAction(event -> this.handleOperandCharacter(OperandCharacter.SIX));
        this.view.getSevenButton().setOnAction(event -> this.handleOperandCharacter(OperandCharacter.SEVEN));
        this.view.getEightButton().setOnAction(event -> this.handleOperandCharacter(OperandCharacter.EIGHT));
        this.view.getNineButton().setOnAction(event -> this.handleOperandCharacter(OperandCharacter.NINE));
        this.view.getCommaButton().setOnAction(event -> this.handleOperandCharacter(OperandCharacter.DECIMAL_SEPARATOR));

        this.view.getAddButton().setOnAction(event -> this.handleOperator(Operator.PLUS));
        this.view.getSubtractButton().setOnAction(event -> this.handleOperator(Operator.MINUS));
        this.view.getDivideButton().setOnAction(event -> this.handleOperator(Operator.DIVIDE));
        this.view.getMultiplyButton().setOnAction(event -> this.handleOperator(Operator.MULTIPLY));

        this.view.getClearButton().setOnAction(event -> {
            this.model.clear();
            this.updateView();
        });

        this.view.getEqualsButton().setOnAction(event -> {
            this.model.calculate();
            this.updateView();
        });
    }

    private void handleOperandCharacter(OperandCharacter oc) {
        this.model.handleInput(oc);
        this.updateView();
    }

    private void handleOperator(Operator op) {
        this.model.handleInput(op);
        this.updateView();
    }

    private void updateView() {
        this.view.getDisplay().setText(this.model.getDisplay());
    }
}
