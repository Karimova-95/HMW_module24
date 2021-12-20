package marshalling;

import models.Student;
import util.ObjectsList;

import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;

@XmlType
public class Students extends ArrayList<Student> {

    private List<Student> studentsList;

    public Students() {
        this.addAll(ObjectsList.getStudents());
    }
}
