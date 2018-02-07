package be.kdg.rekenmachine.view;

import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.geometry.VPos;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Priority;
import be.kdg.rekenmachine.model.OperandCharacter;
import be.kdg.rekenmachine.model.Operator;

public class CalculatorPane extends GridPane {
    private static final double BUTTON_SIZE = 35.0;
    private static final double GAP_SIZE = 5.0;

    private TextField display;

    private Button zeroButton;
    private Button oneButton;
    private Button twoButton;
    private Button threeButton;
    private Button fourButton;
    private Button fiveButton;
    private Button sixButton;
    private Button sevenButton;
    private Button eightButton;
    private Button nineButton;

    private Button commaButton;

    private Button divideButton;
    private Button multiplyButton;
    private Button subtractButton;
    private Button addButton;

    private Button clearButton;
    private Button equalsButton;

    public CalculatorPane() {
        this.initialiseNodes();
        this.layoutNodes();
    }

    private void initialiseNodes() {
        this.display = new TextField();

        this.zeroButton = new Button(String.valueOf(OperandCharacter.ZERO.getChar()));
        this.oneButton = new Button(String.valueOf(OperandCharacter.ONE.getChar()));
        this.twoButton = new Button(String.valueOf(OperandCharacter.TWO.getChar()));
        this.threeButton = new Button(String.valueOf(OperandCharacter.THREE.getChar()));
        this.fourButton = new Button(String.valueOf(OperandCharacter.FOUR.getChar()));
        this.fiveButton = new Button(String.valueOf(OperandCharacter.FIVE.getChar()));
        this.sixButton = new Button(String.valueOf(OperandCharacter.SIX.getChar()));
        this.sevenButton = new Button(String.valueOf(OperandCharacter.SEVEN.getChar()));
        this.eightButton = new Button(String.valueOf(OperandCharacter.EIGHT.getChar()));
        this.nineButton = new Button(String.valueOf(OperandCharacter.NINE.getChar()));

        this.commaButton = new Button(String.valueOf(OperandCharacter.DECIMAL_SEPARATOR.getChar()));

        this.divideButton = new Button(String.valueOf(Operator.DIVIDE.getChar()));
        this.multiplyButton = new Button(String.valueOf(Operator.MULTIPLY.getChar()));
        this.subtractButton = new Button(String.valueOf(Operator.MINUS.getChar()));
        this.addButton = new Button(String.valueOf(Operator.PLUS.getChar()));

        this.clearButton = new Button("C");
        this.equalsButton = new Button("=");
    }

    private void layoutNodes() {
        this.setPadding(new Insets(GAP_SIZE, GAP_SIZE, GAP_SIZE, GAP_SIZE));
        this.setHgap(GAP_SIZE);
        this.setVgap(GAP_SIZE);

        display.setEditable(false);
        display.setAlignment(Pos.CENTER_RIGHT);

        this.display.setMinSize(BUTTON_SIZE, BUTTON_SIZE);
        this.zeroButton.setMinSize(BUTTON_SIZE, BUTTON_SIZE);
        this.oneButton.setMinSize(BUTTON_SIZE, BUTTON_SIZE);
        this.twoButton.setMinSize(BUTTON_SIZE, BUTTON_SIZE);
        this.threeButton.setMinSize(BUTTON_SIZE, BUTTON_SIZE);
        this.fourButton.setMinSize(BUTTON_SIZE, BUTTON_SIZE);
        this.fiveButton.setMinSize(BUTTON_SIZE, BUTTON_SIZE);
        this.sixButton.setMinSize(BUTTON_SIZE, BUTTON_SIZE);
        this.sevenButton.setMinSize(BUTTON_SIZE, BUTTON_SIZE);
        this.eightButton.setMinSize(BUTTON_SIZE, BUTTON_SIZE);
        this.nineButton.setMinSize(BUTTON_SIZE, BUTTON_SIZE);
        this.commaButton.setMinSize(BUTTON_SIZE, BUTTON_SIZE);
        this.divideButton.setMinSize(BUTTON_SIZE, BUTTON_SIZE);
        this.multiplyButton.setMinSize(BUTTON_SIZE, BUTTON_SIZE);
        this.subtractButton.setMinSize(BUTTON_SIZE, BUTTON_SIZE);
        this.addButton.setMinSize(BUTTON_SIZE, BUTTON_SIZE);
        this.clearButton.setMinSize(BUTTON_SIZE, BUTTON_SIZE);
        this.equalsButton.setMinSize(BUTTON_SIZE, BUTTON_SIZE);

        this.display.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
        this.zeroButton.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
        this.oneButton.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
        this.twoButton.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
        this.threeButton.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
        this.fourButton.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
        this.fiveButton.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
        this.sixButton.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
        this.sevenButton.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
        this.eightButton.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
        this.nineButton.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
        this.commaButton.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
        this.divideButton.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
        this.multiplyButton.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
        this.subtractButton.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
        this.addButton.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
        this.clearButton.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
        this.equalsButton.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);

        GridPane.setConstraints(display, 0, 0, 5, 1, HPos.CENTER, VPos.CENTER, Priority.ALWAYS, Priority.ALWAYS);
        this.add(display, 0, 0);
        GridPane.setConstraints(sevenButton, 0, 1, 1, 1, HPos.CENTER, VPos.CENTER, Priority.ALWAYS, Priority.ALWAYS);
        this.add(sevenButton, 0, 1);
        GridPane.setConstraints(eightButton, 1, 1, 1, 1, HPos.CENTER, VPos.CENTER, Priority.ALWAYS, Priority.ALWAYS);
        this.add(eightButton, 1, 1);
        GridPane.setConstraints(nineButton, 2, 1, 1, 1, HPos.CENTER, VPos.CENTER, Priority.ALWAYS, Priority.ALWAYS);
        this.add(nineButton, 2, 1);
        GridPane.setConstraints(divideButton, 3, 1, 1, 1, HPos.CENTER, VPos.CENTER, Priority.ALWAYS, Priority.ALWAYS);
        this.add(divideButton, 3, 1);
        GridPane.setConstraints(clearButton, 4, 1, 1, 1, HPos.CENTER, VPos.CENTER, Priority.ALWAYS, Priority.ALWAYS);
        this.add(clearButton, 4, 1);

        GridPane.setConstraints(fourButton, 0, 2, 1, 1, HPos.CENTER, VPos.CENTER, Priority.ALWAYS, Priority.ALWAYS);
        this.add(fourButton, 0, 2);
        GridPane.setConstraints(fiveButton, 1, 2, 1, 1, HPos.CENTER, VPos.CENTER, Priority.ALWAYS, Priority.ALWAYS);
        this.add(fiveButton, 1, 2);
        GridPane.setConstraints(sixButton, 2, 2, 1, 1, HPos.CENTER, VPos.CENTER, Priority.ALWAYS, Priority.ALWAYS);
        this.add(sixButton, 2, 2);
        GridPane.setConstraints(multiplyButton, 3, 2, 1, 1, HPos.CENTER, VPos.CENTER, Priority.ALWAYS, Priority.ALWAYS);
        this.add(multiplyButton, 3, 2);
        GridPane.setConstraints(equalsButton, 4, 2, 1, 3, HPos.CENTER, VPos.CENTER, Priority.ALWAYS, Priority.ALWAYS);
        this.add(equalsButton, 4, 2);
        equalsButton.setMaxHeight(Double.MAX_VALUE);

        GridPane.setConstraints(oneButton, 0, 3, 1, 1, HPos.CENTER, VPos.CENTER, Priority.ALWAYS, Priority.ALWAYS);
        this.add(oneButton, 0, 3);
        GridPane.setConstraints(twoButton, 1, 3, 1, 1, HPos.CENTER, VPos.CENTER, Priority.ALWAYS, Priority.ALWAYS);
        this.add(twoButton, 1, 3);
        GridPane.setConstraints(threeButton, 2, 3, 1, 1, HPos.CENTER, VPos.CENTER, Priority.ALWAYS, Priority.ALWAYS);
        this.add(threeButton, 2, 3);
        GridPane.setConstraints(subtractButton, 3, 3, 1, 1, HPos.CENTER, VPos.CENTER, Priority.ALWAYS, Priority.ALWAYS);
        this.add(subtractButton, 3, 3);

        GridPane.setConstraints(zeroButton, 0, 4, 1, 1, HPos.CENTER, VPos.CENTER, Priority.ALWAYS, Priority.ALWAYS);
        this.add(zeroButton, 0, 4);
        GridPane.setConstraints(commaButton, 1, 4, 2, 1, HPos.CENTER, VPos.CENTER, Priority.ALWAYS, Priority.ALWAYS);
        this.add(commaButton, 1, 4);
        GridPane.setConstraints(addButton, 3, 4, 1, 1, HPos.CENTER, VPos.CENTER, Priority.ALWAYS, Priority.ALWAYS);
        this.add(addButton, 3, 4);
    }

    TextField getDisplay() {
        return display;
    }

    Button getZeroButton() {
        return zeroButton;
    }

    Button getOneButton() {
        return oneButton;
    }

    Button getTwoButton() {
        return twoButton;
    }

    Button getThreeButton() {
        return threeButton;
    }

    Button getFourButton() {
        return fourButton;
    }

    Button getFiveButton() {
        return fiveButton;
    }

    Button getSixButton() {
        return sixButton;
    }

    Button getSevenButton() {
        return sevenButton;
    }

    Button getEightButton() {
        return eightButton;
    }

    Button getNineButton() {
        return nineButton;
    }

    Button getCommaButton() {
        return commaButton;
    }

    Button getDivideButton() {
        return divideButton;
    }

    Button getMultiplyButton() {
        return multiplyButton;
    }

    Button getSubtractButton() {
        return subtractButton;
    }

    Button getAddButton() {
        return addButton;
    }

    Button getClearButton() {
        return clearButton;
    }

    Button getEqualsButton() {
        return equalsButton;
    }
}
