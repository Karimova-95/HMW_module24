import models.Student;
import models.University;

import java.util.List;

public class MainAppModule25 {
    public static void main(String[] args) {
        String fileDir = "C:\\Users\\Admin\\IdeaProjects\\HMW_module24\\src\\main\\resources\\universityInfo.xlsx";

        List<Student> students = ReadExcelFile.readStudents(fileDir);
        for (Student s : students) {
            System.out.println(s);
        }

        List<University> universities = ReadExcelFile.readUniversities(fileDir);
        for (University u : universities) {
            System.out.println(u);
        }
    }
}
