package be.kdg.dictee;

import be.kdg.dictee.model.Dictee;
import be.kdg.dictee.view.DicteeView;
import be.kdg.dictee.view.Presenter;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        Dictee model = new Dictee();
        DicteeView dicteeView = new DicteeView();
        Presenter presenter = new Presenter(model, dicteeView);
        Scene scene = new Scene(dicteeView);

        primaryStage.setWidth(250);
        primaryStage.setHeight(400);
        primaryStage.setTitle("Dictee");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

}
