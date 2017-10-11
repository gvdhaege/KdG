public class VatDemo {
    public static void main(String[] args) {
        Vat biervat = new Vat(50);
        int pintjes = 0;
        int wijngevuld = 0;

        Vat wijnvat = new Vat(100);

        System.out.println(biervat.getCapaciteit());
        System.out.println(biervat.getInhoud());
        biervat.vulVolledig();
        biervat.verwijder(2);
        System.out.println(biervat.getInhoud());
        System.out.println(biervat.getPercentageGevuld());

        while(biervat.getInhoud() > 0){
            biervat.verwijder(1);
            pintjes += 4;
        }
        System.out.println("Pintjes getapt: " + pintjes +"\n");

        wijnvat.vul(110);
        System.out.println(wijnvat.getCapaciteit());
        System.out.println(wijnvat.getInhoud());
        System.out.println((wijnvat.isVol()) ? "Het vat is vol" : "vat is leeg");
        wijnvat.maakLeeg();

        do{
            wijnvat.vul(3);
            wijngevuld++;
        } while(!wijnvat.isVol());
        System.out.println(wijngevuld);
        System.out.println(wijnvat.getInhoud());
    }
}
