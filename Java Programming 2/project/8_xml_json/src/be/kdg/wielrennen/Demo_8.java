package be.kdg.wielrennen;

import be.kdg.wielrennen.data.Data;
import be.kdg.wielrennen.model.WielRenner;
import be.kdg.wielrennen.model.WielRenners;
import be.kdg.wielrennen.parsing.WielRennerDomParser;
import be.kdg.wielrennen.parsing.WielRennersGsonParser;
import be.kdg.wielrennen.parsing.WielRennersJaxbParser;
import be.kdg.wielrennen.parsing.WielRennersStaxParser;

import java.util.List;

public class Demo_8 {
    private static final String XML_PATH_STAX = "../8_xml_json/files/wielrennersstax.xml";
    private static final String XML_PATH_JAXB = "../8_xml_json/files/wielrennersjaxb.xml";
    private static final String JSON_PATH_GSON = "../8_xml_json/files/wielrennersjson.json";

    public static void main(String[] args) {
        //opdracht 2.4
        List<WielRenner> data = Data.getData();
        WielRenners wielRenners = new WielRenners();

        System.out.println("Wielrenners data:");
        data.forEach(wielRenners::voegToe);
        data.forEach(System.out::println);

        WielRennersStaxParser wielRennersStaxParser = new WielRennersStaxParser(wielRenners, XML_PATH_STAX);
        wielRennersStaxParser.writeXML();

        //opdracht 2.7
        System.out.println("\nNa wegschrijven via STAX & inlezen via DOM: ");
        WielRenners wielRennersStax = WielRennerDomParser.jdomReadXML(XML_PATH_STAX);
        wielRennersStax.getWielRenners().forEach(System.out::println);

        //opdracht 2.9 & 2.10
        System.out.println("\nNa wegschrijven/inlezen via JAXB: ");
        WielRennersJaxbParser.JaxbWriteXML(JSON_PATH_GSON, wielRenners);
        WielRenners wielrennersJaxb = WielRennersJaxbParser.JaxbReadXML(JSON_PATH_GSON, WielRenners.class);
        if (wielrennersJaxb != null) {
            wielrennersJaxb.getWielRenners().forEach(System.out::println);
        }

        //opdracht 3.3
        WielRennersGsonParser.writeJson(wielRenners, JSON_PATH_GSON);

        WielRenners wielrennersJson = WielRennersGsonParser.readJson(JSON_PATH_GSON);
        System.out.println("\nNa wegschrijven/inlezen via GSON: ");
        if (wielrennersJson != null) {
            wielrennersJson.getWielRenners().forEach(System.out::println);
        }
    }
}
