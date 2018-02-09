package be.kdg.demo;

import be.kdg.demo.view.BorderPaneView;
import be.kdg.demo.view.GridPaneView5;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Demo extends Application {
    @Override
    public void start(Stage primaryStage) {
        //CheckBoxView be.kdg.demo.view = new CheckBoxView();
        //MenuBarView be.kdg.demo.view = new MenuBarView();
        //ComboBoxView be.kdg.demo.view = new ComboBoxView();
        //TextFieldView be.kdg.demo.view = new TextFieldView();
        //ButtonView be.kdg.demo.view = new ButtonView();
        //LabelView1 be.kdg.demo.view = new LabelView1();
        //LabelView2 be.kdg.demo.view = new LabelView2();
        //ImageViewView be.kdg.demo.view = new ImageViewView();
        BorderPaneView view = new BorderPaneView();
        //VBoxView1 be.kdg.demo.view = new VBoxView1();
        //VBoxView2 be.kdg.demo.view = new VBoxView2();
        //VBoxView3 be.kdg.demo.view = new VBoxView3();
        //HBoxView be.kdg.demo.view = new HBoxView();
        //GridPaneView1 be.kdg.demo.view = new GridPaneView1();
        //GridPaneView2 be.kdg.demo.view = new GridPaneView2();
        //GridPaneView3 be.kdg.demo.view = new GridPaneView3();
        //GridPaneView4 be.kdg.demo.view = new GridPaneView4();
//        GridPaneView5 view = new GridPaneView5();

        primaryStage.setScene(new Scene(view));
        primaryStage.show();
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}
