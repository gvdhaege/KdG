public class Piloten {
    private Piloot[] piloten = {
            new Piloot("Mark Webber", "Red Bull"),
            new Piloot("Sebastian Vettel", "Red Bull"),
            new Piloot("Fernando Alonso", "Ferrari"),
            new Piloot("Felippe Massa", "Ferrari"),
            new Piloot("Kimi Räikkönen", "Lotus"),
            new Piloot("Lewis Hamilton", "Mercedes")
    };

    private Tijd[] tijden = {
            new Tijd(1, 12, 810), new Tijd(1, 12, 328), new Tijd(1, 12, 845),
            new Tijd(1, 13, 516), new Tijd(1, 13, 370), new Tijd(1, 13, 267)
    };

    public Piloten() {
        for (int i = 0; i < piloten.length; i++) {
            piloten[i].setTijd(tijden[i]);
        }
    }

    public void toonPiloten() {
        for (Piloot piloot : piloten) {
            System.out.println(piloot);
        }
    }

    public Piloot pilootMetDeSnelsteTijd() {
        Piloot snelstePiloot = piloten[0];
        int snelsteTijd = snelstePiloot.getTijd().naarInt();

        for (int i = 0; i < piloten.length; i++) {
            if (piloten[i].getTijd().naarInt() < snelsteTijd) {
                snelsteTijd = piloten[i].getTijd().naarInt();
                snelstePiloot = piloten[i];
            }
        }
        return snelstePiloot;
    }

    public Piloot pilootMetDeTraagsteTijd() {
        Piloot traagstePiloot = piloten[0];
        int traagsteTijd = traagstePiloot.getTijd().naarInt();

        for (int i = 0; i < piloten.length; i++) {
            if (piloten[i].getTijd().naarInt() > traagsteTijd) {
                traagsteTijd = piloten[i].getTijd().naarInt();
                traagstePiloot = piloten[i];
            }
        }
        return traagstePiloot;
    }
}