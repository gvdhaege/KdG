package annotations;

@Wat(omschrijving = "Een annotatie testklasse")
@MijnAnnotatie(string = "Demo", waarde = 99)
public class MijnKlasse {
    @Wat(omschrijving = "Een annotation testmethode")
    @MijnAnnotatie(string = "Test", waarde = 100)
    public void demoMethode() {
    }
}