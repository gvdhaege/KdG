import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        AngryBirdsView angryBirdsView = new AngryBirdsView();
        Scene scene = new Scene(angryBirdsView);

        primaryStage.setScene(scene);
        primaryStage.getIcons().add(new Image("images/angrybird.png"));
        primaryStage.setTitle("opdracht Angry Birds");
        primaryStage.show();
    }
}
