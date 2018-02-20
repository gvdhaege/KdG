package be.kdg.engels.view;

import be.kdg.engels.model.EngelsModel;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.chart.PieChart;

import java.util.Map;

public class Presenter {
    private final EngelsModel model;
    private final EngelsView view;

    public Presenter(EngelsModel model, EngelsView view) {
        this.model = model;
        this.view = view;

        this.addEventHandlers();
        this.updateView();
    }

    private void addEventHandlers() {
    }

    private void updateView() {
        ObservableList<PieChart.Data> pieChartData = FXCollections.observableArrayList();
        Map<String, Double> data = this.model.getData();
        for (String key : data.keySet()) {
            pieChartData.add(new PieChart.Data(key, data.get(key)));
        }
        this.view.getPieChart().setData(pieChartData);
        this.view.getPieChart().setTitle("Hoe je de Engelse taal leert");
    }
}
