package rekenen;

import rekenen.plugins.Plugin;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Mark Goovaerts
 * Datum: 25-11-13
 * Johan Ven
 * Datum: 16-11-14 (review AC1415 - Toevoegen van Wrappers, LocalDateTime en InnerClass (help)
 */
public class Rekenmachine {
    private final int MAX_AANTAL_PLUGINS = 10;
    private Plugin[] ingeladenPlugins;
    private int aantalPlugins;
    private StringBuilder log;

    public Rekenmachine() {
        this.ingeladenPlugins = new Plugin[MAX_AANTAL_PLUGINS];
        this.log = new StringBuilder();
        aantalPlugins = 0;
    }

    public class Help{
        public String voorOntwikkelaars(){
            return "Gebruik de methode 'instaleer' om functionaliteiten toe te voegen."
                    + " Gebruik daarvoor een instantie van een klasse die de interface Plugin implementeert";
        }

        public String voorGebruikers(){
            return "Lees aandachtig de uitleg opgegeven in dit programma. Dan moet het wel lukken.";
        }
    }

    public void installeer(Plugin teInstallerenPlugin) {
        if (aantalPlugins < MAX_AANTAL_PLUGINS) {
            for (Plugin reedsGeinstalleerdePlugin : ingeladenPlugins) {
                if (reedsGeinstalleerdePlugin != null
                        && teInstallerenPlugin.getCommand().equals(reedsGeinstalleerdePlugin.getCommand()))
                    return;
            }

            ingeladenPlugins[aantalPlugins] = teInstallerenPlugin;
            aantalPlugins++;
        }
    }

    public double bereken(String command, double x, double y) {
        for (int i = 0; i < aantalPlugins; i++) {
            if (ingeladenPlugins[i].getCommand().equals(command)) {
                double result = ingeladenPlugins[i].bereken(x, y);
                log.append(String.format("[%s] %f %s %f = %f (by %s)\n"
                        , LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd MMMM yyyy HH:mm:ss.ms"))
                        , x
                        , command
                        , y
                        , result
                        , ingeladenPlugins[i].getAuteur()));
                return result;
            }
        }
        return Double.POSITIVE_INFINITY;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append("Geïnstalleerde Plugins: ");
        for (int i = 0; i < aantalPlugins; i++) {
            result.append(ingeladenPlugins[i].getCommand() + " ");
        }

        return result.toString();
    }

    public String getLog(){
        String result = log.toString();
        log = new StringBuilder();
        return result;
    }
}
