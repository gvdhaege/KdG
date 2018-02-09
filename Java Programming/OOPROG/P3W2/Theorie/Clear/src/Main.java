import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.stage.Stage;
import view.ClearView;
import view.Presenter;

import java.util.Optional;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        ClearView clearView = new ClearView();
        Presenter presenter = new Presenter(clearView);
        Scene scene = new Scene(clearView);

        primaryStage.setOnCloseRequest(event -> {
            if (!clearView.getTextField().getText().isEmpty()) {
                final Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("foutje !");
                alert.setContentText("denkt is na he mene man");
                Optional<ButtonType> keuze = alert.showAndWait();
                if (keuze.get().getText().equalsIgnoreCase("ok")) {
                    event.consume();
                }
            }
        });
        primaryStage.setScene(scene);
        primaryStage.setTitle("Opdracht clear");
        primaryStage.show();
    }
}
