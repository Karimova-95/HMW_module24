import comparators.StudentsComparator;
import comparators.UniversitiesComparator;
import enums.StudentComparatorsEnum;
import enums.UniversityComparatorsEnum;
import io.XlsReader;
import models.Student;
import models.University;
import util.ComparatorUtil;

import java.util.List;

public class MainAppModule26 {
    public static void main(String[] args) {
        String fileDir = "C:\\Users\\Admin\\IdeaProjects\\HMW_module24\\src\\main\\resources\\universityInfo.xlsx";
        List<Student> students = XlsReader.readStudents(fileDir);
        for (Student s : students) {
            System.out.println(s);
        }

        List<University> universities = XlsReader.readUniversities(fileDir);
        for (University u : universities) {
            System.out.println(u);
        }
        StudentsComparator comparator = ComparatorUtil.getMyComparator(StudentComparatorsEnum.STUDENTAVGEXAMSCORECOMPARATOR);
        students.stream().sorted(comparator).forEach(System.out::println);

        UniversitiesComparator universitiesComparator = ComparatorUtil.getMyComparator(UniversityComparatorsEnum.UNIVERSITYSHORTNAMECOMPARATOR);
        universities.stream().sorted(universitiesComparator).forEach(System.out::println);
    }
}
