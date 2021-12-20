package marshalling;

import models.University;
import util.ObjectsList;

import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;

@XmlType(name = "universityEntry")
public class Universities extends ArrayList<University> {

    private List<University> students;

    public Universities() {
        for (int i = 0; i < ObjectsList.getStudents().size(); i++) {
            this.add(ObjectsList.getUniversities().get(i));
        }
    }
}
