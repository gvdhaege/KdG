public enum Dag {
    MAANDAG, DINSDAG, WOENSDAG, DONDERDAG, VRIJDAG, ZATERDAG, ZONDAG;

    private boolean isWeekdag;

    @Override
    public String toString() {
        String soortDag = "weekdag";
        if(name().equals("zaterdag") || name().equals("zondag")){
            soortDag = "weekdag";
        }
        return name().toLowerCase() + "(" + soortDag + ")";
    }
}
