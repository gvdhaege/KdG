import deelbaar.*;

public class DemoDeelbaar {
    public static void main(String[] args) {

        int[] tab = {1, 2, 3, 4, 5, 6, 7};
        Deelbaar[] db_tab = {
                new GeheelGetal(100),
                new Woord("Javapolis"),
                new Reeks(tab),
                new Vat(500, 500)
        };

        for (Deelbaar db : db_tab) {
            System.out.println("\noorspronkelijk: " + db.toString());
            System.out.println("helft: " + db.getHelft());
        }

        for (Deelbaar db : db_tab) {
            System.out.println("\noorspronkelijk: " + db.toString());
            db.halveer();
            System.out.println("na halveren: " + db);
        }

    }
}

/*
VERWACHTE AFDRUK:
oorspronkelijk: 100
helft: 50

oorspronkelijk: Javapolis
helft: Java

oorspronkelijk: [1, 2, 3, 4, 5, 6, 7]
helft: [1, 2, 3]

oorspronkelijk: capaciteit: 500l inhoud: 500l
helft: capaciteit: 500l inhoud: 250l

oorspronkelijk: 100
na halveren: 50

oorspronkelijk: Javapolis
na halveren: Java

oorspronkelijk: [1, 2, 3, 4, 5, 6, 7]
na halveren: [1, 2, 3]

oorspronkelijk: capaciteit: 500l inhoud: 500l
na halveren: capaciteit: 500l inhoud: 250l
 */