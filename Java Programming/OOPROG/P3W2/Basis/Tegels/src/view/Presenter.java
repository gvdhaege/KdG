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
            columnIndex = translateXToColumn(event.getX());
            rowIndex = translateYToRow(event.getY());
            updateView();
        });
        canvas.setOnMouseClicked(event -> {
            model.setSelectedTile(translateXToColumn(event.getX()), translateYToRow(event.getY()));
            updateView();
        });
        canvas.setOnMouseExited(event -> {
            columnIndex = -1;
            rowIndex = -1;
            updateView();
        });
    }

    private int translateXToColumn(final double x) {
        final double width = this.view.getCanvas().getWidth();
        final int columnResult = (int)(x / width * TileModel.COLUMNS);
        if (columnResult >= 0 && columnResult < TileModel.COLUMNS) {
            return columnResult;
        }
        else {
            return -1;
        }
    }

    private int translateYToRow(final double y) {
        final double height = this.view.getCanvas().getHeight();
        final int rowResult = (int)(y / height * TileModel.ROWS);
        if (rowResult >= 0 && rowResult < TileModel.ROWS) {
            return rowResult;
        }
        else {
            return -1;
        }
    }

    private void updateView() {
        view.displayCurrentTiles(columnIndex, rowIndex, model.getSelectedTileColumn(), model.getSelectedTileRow());
    }
}
