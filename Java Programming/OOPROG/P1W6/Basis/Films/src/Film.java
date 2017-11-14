public class Film {
    private String titel;
    private int jaar;

    public Film(String titel, int jaar){
        this.titel = titel;
        this.jaar = jaar;
    }

    public String getTitel(){
        return titel;
    }

    public int getJaar(){
        return jaar;
    }

    public void setTitel(String titel) {
        this.titel = titel;
    }
}
