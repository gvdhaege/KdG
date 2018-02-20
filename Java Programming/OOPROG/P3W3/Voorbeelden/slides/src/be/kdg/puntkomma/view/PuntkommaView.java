package be.kdg.puntkomma.view;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.chart.PieChart;
import javafx.scene.layout.BorderPane;

public class PuntkommaView extends BorderPane {
    private PieChart pk;

    public PuntkommaView() {
        this.initialiseNodes();
        this.layoutNodes();
    }

    private void initialiseNodes() {
        ObservableList<PieChart.Data> pieChartData =
                FXCollections.observableArrayList(
                        new PieChart.Data("Om twee gerelateerde zinsdelen met elkaar te verbinden", 1),
                        new PieChart.Data("Tijdens het programmeren", 19),
                        new PieChart.Data(";)", 80));
        this.pk = new PieChart(pieChartData);
        this.pk.setTitle("Wanneer ik puntkomma's intyp");
    }

    private void layoutNodes() {
        this.setCenter(this.pk);
    }
}
