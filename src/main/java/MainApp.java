import comparators.StudentAvgExamScoreComparator;
import comparators.StudentsComparator;
import comparators.UniversitiesComparator;
import enums.StudentComparatorsEnum;
import enums.UniversityComparatorsEnum;
import models.Student;
import enums.StudyProfile;
import models.University;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MainApp {

    public static void main(String[] args) throws IOException {

        System.out.println("=========================Homework module 24==============================");
        Student student = new Student
                .Builder()
                .fullName("Анатолий Степанов")
                .universityId("1236")
                .currentCourseNumber(3)
                .avgExamScore(4)
                .build();

        University university = new University
                .Builder()
                .id("7596")
                .fullName("Московский Государственный Университет")
                .shortName("МГУ")
                .yearOfFoundation(1755)
                .mainProfile(StudyProfile.IT)
                .build();

        System.out.printf("Студент: %s\nУниверситет: %s%n", student, university);

        System.out.println("=========================Homework module 25==============================");
        String fileDir = "C:\\Users\\Admin\\IdeaProjects\\HMW_module24\\src\\main\\resources\\universityInfo.xlsx";

        List<Student> students = ReadExcelFile.readStudents(fileDir);
        for (Student s : students) {
            System.out.println(s);
        }

        List<University> universities = ReadExcelFile.readUniversities(fileDir);
        for (University u : universities) {
            System.out.println(u);
        }

        System.out.println("=========================Homework module 26==============================");
        StudentsComparator comparator = ComparatorsUtil.getMyComparator(StudentComparatorsEnum.STUDENTAVGEXAMSCORECOMPARATOR);
        students.stream().sorted(comparator).forEach(System.out::println);

        UniversitiesComparator universitiesComparator = ComparatorsUtil.getMyComparator(UniversityComparatorsEnum.UNIVERSITYSHORTNAMECOMPARATOR);
        universities.stream().sorted(universitiesComparator).forEach(System.out::println);

    }

}
