import marshalling.Wrapper;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.File;

public class MainAppModule29 {

    public static void main(String[] args) throws JAXBException {
        JAXBContext ctx = JAXBContext.newInstance(Wrapper.class);
        Marshaller msh = ctx.createMarshaller();
        File file = new File("xmlReqs/req.xml");
        msh.marshal(new Wrapper(), file);
    }
}
