package be.kdg.temperatuur.view;

import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.layout.BorderPane;

public class TemperatuurView extends BorderPane {
    private static final String[] MAANDEN = {"Jan", "Feb", "Maa", "Apr", "Mei", "Jun", "Jul", "Aug", "Sep", "Okt", "Nov", "Dec"};
    private static final Double[] MINIMA = {0.7, 0.7, 3.1, 5.3, 9.2, 11.9, 14.0, 13.6, 10.9, 7.8, 4.1, 1.6};
    private static final Double[] MAXIMA = {5.7, 6.6, 10.4, 14.2, 18.1, 20.6, 23.0, 22.6, 19.0, 14.7, 9.5, 6.1};

    private LineChart<String, Number> lineChart;

    public TemperatuurView() {
        this.initialiseNodes();
        this.layoutNodes();
    }

    private void initialiseNodes() {
        final CategoryAxis xAxis = new CategoryAxis();
        final NumberAxis yAxis = new NumberAxis();
        this.lineChart = new LineChart<>(xAxis, yAxis);

        lineChart.setTitle("Gemiddelde temperatuur Ukkel, 1981-2010");

        XYChart.Series<String, Number> series1 = new XYChart.Series<>();
        series1.setName("Gemiddeld minimum");
        for (int i = 0; i < MAANDEN.length; i++) {
            series1.getData().add(new XYChart.Data<>(MAANDEN[i], MINIMA[i]));
        }

        XYChart.Series<String, Number> series2 = new XYChart.Series<>();
        series2.setName("Gemiddeld maximum");
        for (int i = 0; i < MAANDEN.length; i++) {
            series2.getData().add(new XYChart.Data<>(MAANDEN[i], MAXIMA[i]));
        }

        lineChart.getData().add(series1);
        lineChart.getData().add(series2);
    }

    private void layoutNodes() {
        this.setCenter(this.lineChart);
    }
}
