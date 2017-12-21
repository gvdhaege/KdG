package Drank;

public class TestKlasse {
    public static void main(String[] args) {
        Kaart menuKaart = new Kaart();
        menuKaart.dranken.add(new Drank("Duvel", 3.50,true));
        menuKaart.dranken.add(new Drank("Coca-Cola", 2.20,false));
        menuKaart.dranken.add(new Drank("Coca-Cola Zero", 2.20,false));
        menuKaart.dranken.add(new Drank("Coca-Cola Light", 2.20,false));
        menuKaart.dranken.add(new Drank("Coca-Cola Light Lemon", 2.20,false));
        menuKaart.dranken.add(new Drank("Fanta Orange", 2.20,false));
        menuKaart.dranken.add(new Drank("Fanta Citroen", 2.20,false));
        menuKaart.dranken.add(new Drank("Fanta Orange Light", 2.20,false));
        menuKaart.dranken.add(new Drank("Stella Artois", 2.50,true));
        menuKaart.dranken.add(new Drank("Stella Artois 33cl", 3.10,true));
        menuKaart.dranken.add(new Drank("Stella Artois Zero", 3,false));

        menuKaart.sorteer();
        System.out.println(menuKaart);
        System.out.println(menuKaart.getDuurste());
        System.out.println(menuKaart.getAlcoholischeDranken());
        menuKaart.verwijderDuurderDan(2.80);
        System.out.println(menuKaart.dranken);
    }
}
