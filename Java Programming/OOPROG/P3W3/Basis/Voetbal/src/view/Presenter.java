package view;

import javafx.scene.chart.XYChart;
import model.VoetbalModel;

public class Presenter {
    private final VoetbalView view;

    public Presenter(VoetbalView view) {
        this.view = view;

        this.updateView();
    }

    private void updateView() {
        this.view.getVoetbal().setTitle("Geboortekwartaal");

        XYChart.Series<String, Number> serie1 = new XYChart.Series<>();
        XYChart.Series<String, Number> serie2 = new XYChart.Series<>();
        XYChart.Series<String, Number> serie3 = new XYChart.Series<>();

        createXYSerie(serie1, "Bevolking België", VoetbalModel.GEBOORTES_BELGIE);
        createXYSerie(serie2, "Spelers in eerste klassse", VoetbalModel.SPELERS_EERSTE_KLASSE);
        createXYSerie(serie3, "Spelers in nationale selectie", VoetbalModel.SPELERS_NAT_SELECTIE);

        this.view.getVoetbal().getData().add(serie1);
        this.view.getVoetbal().getData().add(serie2);
        this.view.getVoetbal().getData().add(serie3);
    }

    private void createXYSerie(XYChart.Series<String, Number> serie, String title, Double[] data) {
        serie.setName(title);
        for (int i = 0; i < VoetbalModel.KWARTALEN.length; i++) {
            serie.getData().add(new XYChart.Data<>(VoetbalModel.KWARTALEN[i], data[i]));
        }
    }
}
