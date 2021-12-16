import enums.StudyProfile;
import models.Statistics;
import models.Student;
import models.University;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;

public class MainAppModule27 {

    private static final Logger LOGGER;
    static {
        System.setProperty("java.util.logging.config.file",
                "C:\\Users\\Admin\\IdeaProjects\\HMW_module24\\src\\main\\resources\\logging.properties");
        LOGGER = Logger.getLogger(ReadExcelFile.class.getName());
    }

    public static void main(String[] args) throws IOException {

        List<String> univNames1 = Arrays.asList("МГТУ", "МГУ", "МФТИ", "РГАУ");
        List<String> univNames2 = Arrays.asList("БашГУ", "УГАТУ", "УГНТУ", "БГАУ");

        List<Statistics> list = new ArrayList<>();
        list.add(new Statistics(StudyProfile.PROGRAMMING, 4.5f, 46, 3, univNames1));
        list.add(new Statistics(StudyProfile.MEDICINE, 4.9f, 75, 4, univNames2));
        list.add(new Statistics(StudyProfile.PHILOLOGY, 4.4f, 39, 2, univNames1));
        XlsWriter.generateAndFillTable(list, "C:\\Users\\Admin\\IdeaProjects\\HMW_module24");

        List<Student> studentsList = ObjectsList.getStudents();
        List<University> universitiesList = ObjectsList.getUniversities();
        List<Statistics> convert = ConverterToStatistic.convert(studentsList, universitiesList);
        XlsWriter.generateAndFillTable(convert, "C:\\Users\\Admin\\IdeaProjects\\HMW_module24");
    }
}
