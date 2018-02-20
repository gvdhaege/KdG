package view;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.chart.PieChart;
import model.EngelsModel;

import java.util.Map;

public class Presenter {
    private EngelsModel model;
    private EngelsView view;

    public Presenter(EngelsModel model, EngelsView view) {
        this.model = model;
        this.view = view;

        this.updateView();
    }

    void updateView() {
        Map<String, Double> data = this.model.getData();
        ObservableList<PieChart.Data> pieChartData = FXCollections.observableArrayList();

        for (String key : data.keySet()) {
            pieChartData.add(new PieChart.Data(key, data.get(key)));
        }

        this.view.getPieChart().setData(pieChartData);
        this.view.getPieChart().setTitle("Hoe je de Engelse taal leert");

    }
}
