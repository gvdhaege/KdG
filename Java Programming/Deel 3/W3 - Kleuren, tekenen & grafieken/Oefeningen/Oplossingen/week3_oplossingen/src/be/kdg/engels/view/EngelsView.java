package be.kdg.engels.view;

import javafx.scene.chart.PieChart;
import javafx.scene.layout.BorderPane;

public class EngelsView extends BorderPane {
    private PieChart english;

    public EngelsView() {
        this.initialiseNodes();
        this.layoutNodes();
    }

    private void initialiseNodes() {
        this.english = new PieChart();
    }

    private void layoutNodes() {
        this.setCenter(this.english);
    }

    PieChart getPieChart() {
        return this.english;
    }
}
