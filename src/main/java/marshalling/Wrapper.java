package marshalling;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "root")
@XmlAccessorType(XmlAccessType.FIELD)
public class Wrapper {
    @XmlElementWrapper(name = "studentsInfo")
    @XmlElement(name = "studentEntry")
    public Students students = new Students();

    @XmlElementWrapper(name = "universitiesInfo")
    @XmlElement(name = "universityEntry")
    public Students studentsInfo = new Students();
}
