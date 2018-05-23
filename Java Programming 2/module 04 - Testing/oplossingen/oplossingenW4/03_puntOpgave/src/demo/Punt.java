package demo;

public class Punt implements Comparable<Punt> {
    int x;
    int y;

    public Punt(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public double distance(Punt p) {
        double dX = x - p.x;
        double dY = y - p.y;
        return Math.sqrt(dX * dX + dY * dY);
    }

     public double distanceToCenter() {
        //return Math.sqrt(x * x + y * y);
         return distance(new Punt(0, 0));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Punt punt = (Punt) o;

        if (x != punt.x) return false;
        if (y != punt.y) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = x;
        result = 31 * result + y;
        return result;
    }

    public int compareTo(Punt other) {
        return Double.compare(this.distanceToCenter(), other.distanceToCenter());
        /*double diff = this.distanceToCenter() - other.distanceToCenter();
        if(diff == 0) return 0;
        if(diff > 0) return 1;
        return -1;*/
    }
}
