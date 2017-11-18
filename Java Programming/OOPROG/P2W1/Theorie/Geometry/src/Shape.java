import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public abstract class Shape {
    private int x;
    private int y;

    public Shape(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public abstract void getPerimeter();
    public abstract void getArea();


    public void setPosition(int x, int y){
        throw new NotImplementedException();
    }
}
