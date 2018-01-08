package be.kdg.woordenboek2;

/**
 * Met deze klasse maak je een woordenboek en vul je wat woorden in.
 */
public class WoordenboekCreator {
    private Woordenboek woordenboek;

    public WoordenboekCreator() {
        woordenboek = new Woordenboek();
        maakWoordenboek();
    }

    public Woordenboek getWoordenboek() {
        return woordenboek;
    }

    private void maakWoordenboek() {
        woordenboek.voegWoordToe("een", "yksi");
        woordenboek.voegWoordToe("twee", "kaksi");
        woordenboek.voegWoordToe("drie", "kolme");
        woordenboek.voegWoordToe("vier", "neljä");
        woordenboek.voegWoordToe("vijf", "viisi");
        woordenboek.voegWoordToe("zes", "kuusi");
        woordenboek.voegWoordToe("zeven", "seitsemän");
        woordenboek.voegWoordToe("acht", "kahdeksan");
        woordenboek.voegWoordToe("negen", "yhdeksän");
        woordenboek.voegWoordToe("tien", "kymmenen");
    }
}

/*
Aantal woorden: 10
een - yksi
twee - kaksi
drie - kolme
vier - neljä
vijf - viisi
zes - kuusi
zeven - seitsemän
acht - kahdeksan
negen - yhdeksän
tien - kymmenen
twaalf - Vertaling niet gevonden
*/
