import javafx.application.Application;
import javafx.scene.Cursor;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Paint;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        Label labelHello = new Label("Hello World!");
        BorderPane root = new BorderPane(labelHello);
        Scene scene = new Scene(root);
        scene.setCursor(Cursor.CROSSHAIR);
        Scene scene2 = new Scene(new Group());
        scene2.setFill(Paint.valueOf("yellow"));


        Stage stage = new Stage();
        stage.setMinHeight(600);
        stage.setMinWidth(500);
        stage.setMaxWidth(600);
        stage.setTitle("Stage");
        stage.setResizable(false);

        stage.setScene(scene);
        stage.setScene(scene2);
        stage.show();

    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}
