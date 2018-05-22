package annotations;

@DoeDeGroeten("Hello, class!")
public class Hallo {
    @DoeDeGroeten("Hello, field!")
    public String groetToestand;

    @DoeDeGroeten("Hello, constructor!")
    public Hallo() {
    }

    @DoeDeGroeten("Hello, method!")
    public void groet() {
    }
}

