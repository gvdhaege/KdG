package be.kdg.AngryBirds.Model;

public class AngryBirdsModel {
    //Onze model bevat in dit geval enkel het path waar de eigenlijke png staat.
    //Je zou ook eventueel de ingeladen Image kunnen bijhouden in je model.
    private String imagePath;

    public AngryBirdsModel() {
        //Daar de png zich situeert binnen dit IntelliJ project, kunnen we werken
        // met een relatief path.
        imagePath = "be/kdg/AngryBirds/angrybird.png";
}

    public String getImagePath() {
        return imagePath;
    }
}
