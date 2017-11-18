public class Motor {
    private final int MAX_TOERENTAL = 5800;
    private int toerental;

    public void verhoogToerental(int toename) {
        if ((toerental + toename) < MAX_TOERENTAL) {
            toerental += toename;
        } else {
            toerental = MAX_TOERENTAL;
        }
    }

    public int getToerental() {
        return toerental;
    }

    public void setToerental(int toerental) {
        if (toerental < MAX_TOERENTAL){
            this.toerental = toerental;
        } else {
            this.toerental = MAX_TOERENTAL;
        }
    }
}
