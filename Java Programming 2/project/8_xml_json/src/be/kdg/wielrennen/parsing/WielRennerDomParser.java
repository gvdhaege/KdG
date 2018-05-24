package be.kdg.wielrennen.parsing;

import be.kdg.wielrennen.model.Discipline;
import be.kdg.wielrennen.model.WielRenner;
import be.kdg.wielrennen.model.WielRenners;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;
import java.time.LocalDate;

public class WielRennerDomParser {

    public static WielRenners jdomReadXML(String fileName) {
        WielRenners wielRenners = new WielRenners();
        try {
            Document document = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(new File(fileName));

            Element rootElement = document.getDocumentElement();
            NodeList wielrennerNodes = rootElement.getChildNodes();
            for (int i = 0; i < wielrennerNodes.getLength(); i++) {
                if (wielrennerNodes.item(i).getNodeType() != Node.ELEMENT_NODE) {
                    continue;
                }
                Element e = (Element) wielrennerNodes.item(i);
                wielRenners.voegToe(new WielRenner(
                        getChildText(e, "naam"),
                        getChildText(e, "voornaam"),
                        getChildText(e, "nationaliteit"),
                        LocalDate.parse(getChildText(e, "geboortedatum")),
                        Integer.parseInt(getChildText(e, "lengte")),
                        Double.parseDouble(getChildText(e, "gewicht")),
                        getChildText(e, "ploeg"),
                        Discipline.valueOf(e.getAttribute("discipline"))
                ));
            }
        } catch (IOException | ParserConfigurationException | SAXException e) {
            e.printStackTrace();
        }
        return wielRenners;
    }

    private static String getChildText(Element parent, String name) {
        return parent.getElementsByTagName(name).item(0).getTextContent();
    }
}