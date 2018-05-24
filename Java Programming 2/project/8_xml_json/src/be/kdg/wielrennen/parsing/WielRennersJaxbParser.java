package be.kdg.wielrennen.parsing;

import be.kdg.wielrennen.model.WielRenners;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.File;

public class WielRennersJaxbParser {

    public static void JaxbWriteXML(String file, Object root) {
        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(WielRenners.class);
            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            jaxbMarshaller.marshal(root, new File(file));
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }

    public static <T> T JaxbReadXML(String file, Class<T> typeParameterClass) {
        try {
            JAXBContext context = JAXBContext.newInstance(typeParameterClass);
            Unmarshaller unmarshaller = context.createUnmarshaller();
            return (T) unmarshaller.unmarshal(new File(file));
        } catch (JAXBException e) {
            e.printStackTrace();
        }
        return null;
    }
}
