package be.kdg.wielrennen.parsing;

import be.kdg.wielrennen.model.WielRenner;
import be.kdg.wielrennen.model.WielRenners;
import com.sun.xml.internal.txw2.output.IndentingXMLStreamWriter;

import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WielRennersStaxParser {
    private WielRenners wielRenners;
    private XMLStreamWriter xmlStreamWriter;

    public WielRennersStaxParser(WielRenners wielRenners, String path) {
        this.wielRenners = wielRenners;
        setupXML(path);
    }

    private void setupXML(String path) {
        try {
            XMLOutputFactory xmlOutputFactory = XMLOutputFactory.newInstance();
            xmlStreamWriter = new IndentingXMLStreamWriter(xmlOutputFactory.createXMLStreamWriter
                    (new FileWriter(path)));
        } catch (IOException | XMLStreamException e) {
            e.printStackTrace();
        }
    }

    public void writeXML() {
        try {
            xmlStreamWriter.writeStartDocument();
            xmlStreamWriter.writeStartElement("wielrenners");

            for (WielRenner wielRenner : wielRenners.getWielRenners()) {
                writeXMLElement(wielRenner);
            }
            xmlStreamWriter.writeEndElement();
            xmlStreamWriter.writeEndDocument();
            xmlStreamWriter.close();

        } catch (XMLStreamException e) {
            e.printStackTrace();
        }
    }

    private void writeXMLElement(WielRenner wielRenner) throws XMLStreamException {
        xmlStreamWriter.writeStartElement("wielrenner");
        xmlStreamWriter.writeAttribute("discipline", wielRenner.getDiscipline().name());

        writeXMLChildElement("naam", wielRenner.getNaam());
        writeXMLChildElement("voornaam", wielRenner.getVoornaam());
        writeXMLChildElement("nationaliteit", wielRenner.getNationaliteit());
        writeXMLChildElement("geboortedatum", wielRenner.getGeboorteDatum().toString());
        writeXMLChildElement("lengte", String.valueOf(wielRenner.getLengte()));
        writeXMLChildElement("gewicht", String.valueOf(wielRenner.getGewicht()));
        writeXMLChildElement("ploeg", wielRenner.getPloeg());

        xmlStreamWriter.writeEndElement();
    }

    private void writeXMLChildElement(String naam, String waarde) throws XMLStreamException {
        xmlStreamWriter.writeStartElement(naam);
        xmlStreamWriter.writeCharacters(waarde);
        xmlStreamWriter.writeEndElement();
    }
}
