public class Auto extends Voertuig {
    private String merk;
    private String model;

    public Auto(String merk, String model) {
        super(4);
        this.merk = merk;
        this.model = model;
    }

    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
