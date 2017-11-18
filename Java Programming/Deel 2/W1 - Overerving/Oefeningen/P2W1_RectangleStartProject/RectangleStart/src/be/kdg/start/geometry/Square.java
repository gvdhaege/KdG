package be.kdg.start.geometry;

public class Square extends Rectangle {
    private int side;
    public String description = "Square";

    public Square(){
        this.setHeight(1);
        this.setWidth(1);
    }

    public Square(int side){
        this.setSize(side);
    }

    public Square(int side, int x, int y){
        super(x, y);
        this.side = side;

    }

    public void setSize(int side){
        super.setHeight(side);
        super.setWidth(side);
    }

    public void setHeight(int height){
        setSize(height);
    }

    public void setWidth(int width){
        setSize(width);
    }


}
