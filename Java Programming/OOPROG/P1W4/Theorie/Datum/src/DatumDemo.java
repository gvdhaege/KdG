public class DatumDemo {
    public static void main(String[] args) {
        Datum eenDatum = new Datum("11/11/2013");
        System.out.println(eenDatum.toString());
        System.out.println(eenDatum.getDag() + " " + eenDatum.getMaand() + " " + eenDatum.getJaar());
        eenDatum.volgendeDag();
        System.out.println(eenDatum);

        Datum volgendeDatum = new Datum("12/11/2013");
        System.out.println((eenDatum.isGelijk(volgendeDatum) ? "gelijk" : "niet gelijk"));

        Datum schrikkel = new Datum("29/02/2012");
        System.out.println(schrikkel.isGeldigeDatum(29,2,2012));
        System.out.println(schrikkel.isGeldigeDatum(29,2,2013));

        eenDatum.setDatum(13, 3,1928);
        System.out.println(eenDatum);
        System.out.println(eenDatum.isVroeger(schrikkel));
    }
}
