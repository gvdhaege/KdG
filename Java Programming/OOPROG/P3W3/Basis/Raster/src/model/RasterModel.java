package model;

public class RasterModel {
    private static final int DEFAULT_ROWS = 10;
    private static final int DEFAULT_COLLUMS = 10;

    private int rows;
    private int colums;

    public RasterModel() {
        this.rows = DEFAULT_ROWS;
        this.colums = DEFAULT_COLLUMS;
    }

    public RasterModel(int rows, int colums) {
        this.rows = rows;
        this.colums = colums;
    }

    public int getRows() {
        return rows;
    }

    public void setRows(int rows) {
        this.rows = rows;
    }

    public int getColums() {
        return colums;
    }

    public void setColums(int colums) {
        this.colums = colums;
    }
}
