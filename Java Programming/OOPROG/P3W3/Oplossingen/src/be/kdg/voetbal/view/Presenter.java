package be.kdg.voetbal.view;

import be.kdg.voetbal.model.VoetbalModel;
import javafx.scene.chart.XYChart;

public class Presenter {
    private final VoetbalModel model;
    private final VoetbalView view;

    public Presenter(VoetbalModel model, VoetbalView view) {
        this.model = model;
        this.view = view;

        this.addEventHandlers();
        this.updateView();
    }

    private void addEventHandlers() {
    }

    private void updateView() {
        this.view.getBarChart().getXAxis().setLabel("Geboortekwartaal");

        XYChart.Series<String,Number> series1 = new XYChart.Series<>();
        series1.setName("Bevolking België");
        for (int i = 0; i < VoetbalModel.KWARTALEN.length; i++) {
            series1.getData().add(new XYChart.Data<>(VoetbalModel.KWARTALEN[i], VoetbalModel.GEBOORTES_BELGIE[i]));
        }

        XYChart.Series<String,Number> series2 = new XYChart.Series<>();
        series2.setName("Spelers in eerste klasse");
        for (int i = 0; i < VoetbalModel.KWARTALEN.length; i++) {
            series2.getData().add(new XYChart.Data<>(VoetbalModel.KWARTALEN[i], VoetbalModel.SPELERS_EERSTE_KLASSE[i]));
        }

        XYChart.Series<String,Number> series3 = new XYChart.Series<>();
        series3.setName("Spelers in nationale selectie");
        for (int i = 0; i < VoetbalModel.KWARTALEN.length; i++) {
            series3.getData().add(new XYChart.Data<>(VoetbalModel.KWARTALEN[i], VoetbalModel.SPELERS_NAT_SELECTIE[i]));
        }

        this.view.getBarChart().getData().add(series1);
        this.view.getBarChart().getData().add(series2);
        this.view.getBarChart().getData().add(series3);
    }
}
