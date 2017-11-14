package be.kdg.start.geometry;

public class Square extends Rectangle {
    private int side;
    public String description = "Square";

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
