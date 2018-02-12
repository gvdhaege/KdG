package be.kdg.tegels.view;

import be.kdg.tegels.model.TileModel;

public class Presenter {
    private final TileModel model;
    private final TileView view;

    private int currentHoverColumn;
    private int currentHoverRow;

    public Presenter(TileModel model, TileView view) {
        this.model = model;
        this.view = view;

        this.currentHoverColumn = -1;
        this.currentHoverRow = -1;

        this.addEventHandlers();
        this.updateView();
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

    private void addEventHandlers() {
        this.view.getCanvas().setOnMouseMoved(event -> {
            currentHoverColumn = translateXToColumn(event.getX());
            currentHoverRow = translateYToRow(event.getY());
            this.updateView();
        });

        this.view.getCanvas().setOnMouseClicked(event -> {
            this.model.setSelectedTile(translateXToColumn(event.getX()), translateYToRow(event.getY()));
            this.updateView();
        });

        this.view.getCanvas().setOnMouseExited(event -> {
            this.currentHoverColumn = -1;
            this.currentHoverRow = -1;
            this.updateView();
        });
    }

    private void updateView() {
        this.view.displayCurrentTiles(currentHoverColumn, currentHoverRow, this.model.getSelectedTileColumn(), this.model.getSelectedTileRow());
    }
}
