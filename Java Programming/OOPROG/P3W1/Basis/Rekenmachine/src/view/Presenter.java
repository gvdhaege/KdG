package view;

import model.Calculator;
import model.Operand;
import model.OperandCharacter;
import model.Operator;

public class Presenter {
    private Calculator model;
    private CalculatorPane view;

    public Presenter(Calculator model, CalculatorPane view) {
        this.model = model;
        this.view = view;

        addEventHandlers();
    }

    private void addEventHandlers() {
        view.getButtonNumber0().setOnAction(event -> this.handleOperandHandler(OperandCharacter.ZERO));
        view.getButtonNumber1().setOnAction(event -> this.handleOperandHandler(OperandCharacter.ONE));
        view.getButtonNumber2().setOnAction(event -> this.handleOperandHandler(OperandCharacter.TWO));
        view.getButtonNumber3().setOnAction(event -> this.handleOperandHandler(OperandCharacter.THREE));
        view.getButtonNumber4().setOnAction(event -> this.handleOperandHandler(OperandCharacter.FOUR));
        view.getButtonNumber5().setOnAction(event -> this.handleOperandHandler(OperandCharacter.FIVE));
        view.getButtonNumber6().setOnAction(event -> this.handleOperandHandler(OperandCharacter.SIX));
        view.getButtonNumber7().setOnAction(event -> this.handleOperandHandler(OperandCharacter.SEVEN));
        view.getButtonNumber8().setOnAction(event -> this.handleOperandHandler(OperandCharacter.EIGHT));
        view.getButtonNumber9().setOnAction(event -> this.handleOperandHandler(OperandCharacter.NINE));
        view.getButtonOperatorDivide().setOnAction(event -> this.handleOperatorHandler(Operator.DIVIDE));
        view.getButtonOperatorMinus().setOnAction(event -> this.handleOperatorHandler(Operator.MINUS));
        view.getButtonOperatorMultiply().setOnAction(event -> this.handleOperatorHandler(Operator.MULTIPLY));
        view.getButtonOperatorPlus().setOnAction(event -> this.handleOperatorHandler(Operator.PLUS));
        view.getButtonDecimal().setOnAction(event -> this.handleOperandHandler(OperandCharacter.DECIMAL_SEPARATOR));
        view.getButtonC().setOnAction(event -> {
            model.clear();
            updateView();
        });
        view.getButtonEquals().setOnAction(event -> {
            model.calculate();
            updateView();
        });
    }

    private void handleOperandHandler(OperandCharacter operand) {
        model.handleInput(operand);
        updateView();
    }

    private void handleOperatorHandler(Operator operator) {
        model.handleInput(operator);
        updateView();
    }

    private void updateView() {
        view.getDisplay().setText(model.getDisplay());
    }
}
