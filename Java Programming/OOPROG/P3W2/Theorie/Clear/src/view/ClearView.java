package view;

import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;

public class ClearView extends BorderPane {
    private TextArea textField;
    private Button button;

    public ClearView() {
        initNodes();
        layoutNodes();
    }

    private void initNodes() {
        textField = new TextArea();
        button = new Button("Clear");
    }

    private void layoutNodes() {
        this.setTop(textField);
        this.setCenter(button);
        BorderPane.setMargin(button, new Insets(10, 10, 10, 10));
    }

    public TextArea getTextField() {
        return textField;
    }

    Button getButton() {
        return button;
    }
}
