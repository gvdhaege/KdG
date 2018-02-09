package view;

import javafx.scene.canvas.Canvas;
import javafx.scene.input.MouseEvent;
import model.TileModel;

public class Presenter {
    private TileModel model;
    private TileView view;

    private int columnIndex;
    private int rowIndex;

    public Presenter(TileModel model, TileView view) {
        this.model = model;
        this.view = view;
        this.columnIndex = -1;
        this.rowIndex = -1;
        handleEvents();
        updateView();
    }

    private void handleEvents() {
        Canvas canvas = view.getCanvas();
        canvas.setOnMouseMoved(event -> {
            getColumnAndRowIndex(event);
            updateView();
        });
        canvas.setOnMouseClicked(event -> {
            getColumnAndRowIndex(event);
            model.setSelectedTile(columnIndex, rowIndex);
            updateView();
        });
        canvas.setOnMouseExited(event -> {
            columnIndex = -1;
            rowIndex = -1;
            updateView();
        });
    }

    private void getColumnAndRowIndex(MouseEvent event) {
        columnIndex = ((int) event.getX() / TileModel.COLUMNS);
        rowIndex = ((int) event.getY()) / TileModel.ROWS;
    }

    private void updateView() {
        view.displayCurrentTiles(columnIndex, rowIndex, model.getSelectedTileColumn(), model.getSelectedTileRow());
    }
}
