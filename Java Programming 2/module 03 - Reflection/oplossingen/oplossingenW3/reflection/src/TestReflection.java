import reflection.Boek;
import reflection.ReflectionRunner;

public class TestReflection {
    public static void main(String[] args) {
        ReflectionRunner.reflect(Boek.class);
    }
}

/**
 * VERWACHTE AFDRUK:
 *
 Voor reflection: Titel: "Onbekend" (Anoniem) €0,00
 equals toString hashCode getAuteur setAuteur getTitel getPrijs
 Na reflection: Titel: "Onbekend" (Jan de Rijke) €0,00
 */
