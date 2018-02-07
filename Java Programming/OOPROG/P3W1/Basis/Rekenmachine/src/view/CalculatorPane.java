package view;

import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.geometry.VPos;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Priority;
import model.OperandCharacter;
import model.Operator;


public class CalculatorPane extends GridPane {
    private static final int BUTTON_SIZE = 35;
    private static final int GAP_SIZE = 5;

    private TextField display;

    private Button buttonNumber1;
    private Button buttonNumber2;
    private Button buttonNumber3;
    private Button buttonNumber4;
    private Button buttonNumber5;
    private Button buttonNumber6;
    private Button buttonNumber7;
    private Button buttonNumber8;
    private Button buttonNumber9;
    private Button buttonNumber0;

    private Button buttonOperatorMinus;
    private Button buttonOperatorPlus;
    private Button buttonOperatorMultiply;
    private Button buttonOperatorDivide;

    private Button buttonDecimal;
    private Button buttonC;
    private Button buttonEquals;

    public CalculatorPane() {
        initialisatieNodes();
        layoutNodes();
    }

    private void initialisatieNodes() {
        this.display = new TextField();

        this.buttonNumber0 = new Button(String.valueOf(OperandCharacter.ZERO.getChar()));
        this.buttonNumber1 = new Button(String.valueOf(OperandCharacter.ONE.getChar()));
        this.buttonNumber2 = new Button(String.valueOf(OperandCharacter.TWO.getChar()));
        this.buttonNumber3 = new Button(String.valueOf(OperandCharacter.THREE.getChar()));
        this.buttonNumber4 = new Button(String.valueOf(OperandCharacter.FOUR.getChar()));
        this.buttonNumber5 = new Button(String.valueOf(OperandCharacter.FIVE.getChar()));
        this.buttonNumber6 = new Button(String.valueOf(OperandCharacter.SIX.getChar()));
        this.buttonNumber7 = new Button(String.valueOf(OperandCharacter.SEVEN.getChar()));
        this.buttonNumber8 = new Button(String.valueOf(OperandCharacter.EIGHT.getChar()));
        this.buttonNumber9 = new Button(String.valueOf(OperandCharacter.NINE.getChar()));

        this.buttonOperatorDivide = new Button(String.valueOf(Operator.DIVIDE.getChar()));
        this.buttonOperatorMinus = new Button(String.valueOf(Operator.MINUS.getChar()));
        this.buttonOperatorPlus = new Button(String.valueOf(Operator.PLUS.getChar()));
        this.buttonOperatorMultiply = new Button(String.valueOf(Operator.MULTIPLY.getChar()));

        this.buttonDecimal = new Button(String.valueOf(OperandCharacter.DECIMAL_SEPARATOR.getChar()));
        this.buttonC = new Button("C");
        this.buttonEquals = new Button("=");
    }

    private void layoutNodes() {
        this.setPadding(new Insets(GAP_SIZE, GAP_SIZE, GAP_SIZE, GAP_SIZE));
        this.setHgap(GAP_SIZE);
        this.setVgap(GAP_SIZE);

        this.display.setEditable(false);
        this.display.setAlignment(Pos.CENTER_RIGHT);

        this.display.setMinSize(BUTTON_SIZE, BUTTON_SIZE);
        this.buttonNumber0.setMinSize(BUTTON_SIZE, BUTTON_SIZE);
        this.buttonNumber1.setMinSize(BUTTON_SIZE, BUTTON_SIZE);
        this.buttonNumber2.setMinSize(BUTTON_SIZE, BUTTON_SIZE);
        this.buttonNumber3.setMinSize(BUTTON_SIZE, BUTTON_SIZE);
        this.buttonNumber4.setMinSize(BUTTON_SIZE, BUTTON_SIZE);
        this.buttonNumber5.setMinSize(BUTTON_SIZE, BUTTON_SIZE);
        this.buttonNumber6.setMinSize(BUTTON_SIZE, BUTTON_SIZE);
        this.buttonNumber7.setMinSize(BUTTON_SIZE, BUTTON_SIZE);
        this.buttonNumber8.setMinSize(BUTTON_SIZE, BUTTON_SIZE);
        this.buttonNumber9.setMinSize(BUTTON_SIZE, BUTTON_SIZE);
        this.buttonOperatorDivide.setMinSize(BUTTON_SIZE, BUTTON_SIZE);
        this.buttonOperatorMinus.setMinSize(BUTTON_SIZE, BUTTON_SIZE);
        this.buttonOperatorPlus.setMinSize(BUTTON_SIZE, BUTTON_SIZE);
        this.buttonOperatorMultiply.setMinSize(BUTTON_SIZE, BUTTON_SIZE);
        this.buttonDecimal.setMinSize(BUTTON_SIZE, BUTTON_SIZE);
        this.buttonC.setMinSize(BUTTON_SIZE, BUTTON_SIZE);
        this.buttonEquals.setMinSize(BUTTON_SIZE, BUTTON_SIZE);

        this.display.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
        this.buttonNumber0.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
        this.buttonNumber1.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
        this.buttonNumber2.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
        this.buttonNumber3.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
        this.buttonNumber4.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
        this.buttonNumber5.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
        this.buttonNumber6.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
        this.buttonNumber7.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
        this.buttonNumber8.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
        this.buttonNumber9.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
        this.buttonOperatorDivide.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
        this.buttonOperatorMinus.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
        this.buttonOperatorPlus.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
        this.buttonOperatorMultiply.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
        this.buttonDecimal.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
        this.buttonC.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
        this.buttonEquals.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);

        this.add(display, 0, 0);
        this.add(buttonNumber0, 0, 4);
        this.add(buttonNumber1, 0, 3);
        this.add(buttonNumber2, 1, 3);
        this.add(buttonNumber3, 2, 3);
        this.add(buttonNumber4, 0, 2);
        this.add(buttonNumber5, 1, 2);
        this.add(buttonNumber6, 2, 2);
        this.add(buttonNumber7, 0, 1);
        this.add(buttonNumber8, 1, 1);
        this.add(buttonNumber9, 2, 1);
        this.add(buttonOperatorDivide, 3, 1);
        this.add(buttonOperatorMinus, 3, 3);
        this.add(buttonOperatorPlus, 3, 4);
        this.add(buttonOperatorMultiply, 3, 2);
        this.add(buttonDecimal, 1, 4);
        this.add(buttonC, 4, 1);
        this.add(buttonEquals, 4, 2);

        GridPane.setConstraints(display, 0, 0, 5, 1, HPos.CENTER, VPos.CENTER, Priority.ALWAYS, Priority.ALWAYS);
        GridPane.setConstraints(buttonNumber0, 0, 4, 1, 1, HPos.CENTER, VPos.CENTER, Priority.ALWAYS, Priority.ALWAYS);
        GridPane.setConstraints(buttonNumber1, 0, 3, 1, 1, HPos.CENTER, VPos.CENTER, Priority.ALWAYS, Priority.ALWAYS);
        GridPane.setConstraints(buttonNumber2, 1, 3, 1, 1, HPos.CENTER, VPos.CENTER, Priority.ALWAYS, Priority.ALWAYS);
        GridPane.setConstraints(buttonNumber3, 2, 3, 1, 1, HPos.CENTER, VPos.CENTER, Priority.ALWAYS, Priority.ALWAYS);
        GridPane.setConstraints(buttonNumber4, 0, 2, 1, 1, HPos.CENTER, VPos.CENTER, Priority.ALWAYS, Priority.ALWAYS);
        GridPane.setConstraints(buttonNumber5, 1, 2, 1, 1, HPos.CENTER, VPos.CENTER, Priority.ALWAYS, Priority.ALWAYS);
        GridPane.setConstraints(buttonNumber6, 2, 2, 1, 1, HPos.CENTER, VPos.CENTER, Priority.ALWAYS, Priority.ALWAYS);
        GridPane.setConstraints(buttonNumber7, 0, 1, 1, 1, HPos.CENTER, VPos.CENTER, Priority.ALWAYS, Priority.ALWAYS);
        GridPane.setConstraints(buttonNumber8, 1, 1, 1, 1, HPos.CENTER, VPos.CENTER, Priority.ALWAYS, Priority.ALWAYS);
        GridPane.setConstraints(buttonNumber9, 2, 1, 1, 1, HPos.CENTER, VPos.CENTER, Priority.ALWAYS, Priority.ALWAYS);
        GridPane.setConstraints(buttonOperatorDivide, 3, 1, 1, 1, HPos.CENTER, VPos.CENTER, Priority.ALWAYS, Priority.ALWAYS);
        GridPane.setConstraints(buttonOperatorMinus, 3, 3, 1, 1, HPos.CENTER, VPos.CENTER, Priority.ALWAYS, Priority.ALWAYS);
        GridPane.setConstraints(buttonOperatorPlus, 3, 4, 1, 1, HPos.CENTER, VPos.CENTER, Priority.ALWAYS, Priority.ALWAYS);
        GridPane.setConstraints(buttonOperatorMultiply, 3, 2, 1, 1, HPos.CENTER, VPos.CENTER, Priority.ALWAYS, Priority.ALWAYS);
        GridPane.setConstraints(buttonDecimal, 1, 4, 2, 1, HPos.CENTER, VPos.CENTER, Priority.ALWAYS, Priority.ALWAYS);
        GridPane.setConstraints(buttonC, 4, 1, 1, 1, HPos.CENTER, VPos.CENTER, Priority.ALWAYS, Priority.ALWAYS);
        GridPane.setConstraints(buttonEquals, 4, 2, 1, 3, HPos.CENTER, VPos.CENTER, Priority.ALWAYS, Priority.ALWAYS);

    }

    TextField getDisplay() {
        return display;
    }

    Button getButtonNumber1() {
        return buttonNumber1;
    }

    Button getButtonNumber2() {
        return buttonNumber2;
    }

    Button getButtonNumber3() {
        return buttonNumber3;
    }

    Button getButtonNumber4() {
        return buttonNumber4;
    }

    Button getButtonNumber5() {
        return buttonNumber5;
    }

    Button getButtonNumber6() {
        return buttonNumber6;
    }

    Button getButtonNumber7() {
        return buttonNumber7;
    }

    Button getButtonNumber8() {
        return buttonNumber8;
    }

    Button getButtonNumber9() {
        return buttonNumber9;
    }

    Button getButtonNumber0() {
        return buttonNumber0;
    }

    Button getButtonOperatorMinus() {
        return buttonOperatorMinus;
    }

    Button getButtonOperatorPlus() {
        return buttonOperatorPlus;
    }

    Button getButtonOperatorMultiply() {
        return buttonOperatorMultiply;
    }

    Button getButtonOperatorDivide() {
        return buttonOperatorDivide;
    }

    Button getButtonDecimal() {
        return buttonDecimal;
    }

    Button getButtonC() {
        return buttonC;
    }

    Button getButtonEquals() {
        return buttonEquals;
    }
}
