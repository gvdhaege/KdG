package view;

import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.layout.BorderPane;

public class VoetbalView extends BorderPane {
    private BarChart<String, Number> voetbal;

    public VoetbalView() {
        this.initialiseNodes();
        this.layoutNodes();
    }

    private void initialiseNodes() {
        final CategoryAxis xAxis = new CategoryAxis();
        final NumberAxis yAxis = new NumberAxis();
        this.voetbal = new BarChart<>(xAxis, yAxis);
    }

    private void layoutNodes() {
        this.setCenter(this.voetbal);
    }

    BarChart<String, Number> getVoetbal() {
        return voetbal;
    }
}
