package view;

import javafx.scene.chart.PieChart;
import javafx.scene.layout.BorderPane;

public class EngelsView extends BorderPane {
    private PieChart pieChart;

    public EngelsView() {
        this.initializeNodes();
        this.layoutNodes();
    }

    private void initializeNodes() {
        pieChart = new PieChart();
    }


    private void layoutNodes() {
        this.setCenter(this.pieChart);
    }

    PieChart getPieChart() {
        return pieChart;
    }
}
