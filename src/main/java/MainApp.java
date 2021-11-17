import comparators.StudentsComparator;
import comparators.UniversitiesComparator;
import enums.StudentComparatorsEnum;
import enums.StudyProfile;
import enums.UniversityComparatorsEnum;
import models.Student;
import models.University;

import java.io.IOException;
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

        System.out.println("\n\n=========================Homework module 25==============================");
        String fileDir = "C:\\Users\\Admin\\IdeaProjects\\HMW_module24\\src\\main\\resources\\universityInfo.xlsx";

        List<Student> students = ReadExcelFile.readStudents(fileDir);
        for (Student s : students) {
            System.out.println(s);
        }

        List<University> universities = ReadExcelFile.readUniversities(fileDir);
        for (University u : universities) {
            System.out.println(u);
        }

        System.out.println("\n\n=========================Homework module 26==============================");
        StudentsComparator comparator = ComparatorsUtil.getMyComparator(StudentComparatorsEnum.STUDENTAVGEXAMSCORECOMPARATOR);
        students.stream().sorted(comparator).forEach(System.out::println);

        UniversitiesComparator universitiesComparator = ComparatorsUtil.getMyComparator(UniversityComparatorsEnum.UNIVERSITYSHORTNAMECOMPARATOR);
        universities.stream().sorted(universitiesComparator).forEach(System.out::println);

        System.out.println("\n\n=========================PRACTICE==============================");
        System.out.println("=========================Task 4==============================");
        String studentListJSON = JsonUtil.studentListToJSON(students);
        String universityListLSON = JsonUtil.universityListToJSON(universities);
        System.out.println("Student list:\n" + studentListJSON + "\n");
        System.out.println("University list:\n" + universityListLSON + "\n");

        System.out.println("\n=========================Task 5==============================");
        List<Student> studentList = JsonUtil.JSONToStudentList(studentListJSON);
        List<University> universityList = JsonUtil.JSONToUniversityList(universityListLSON);
        System.out.println(studentList);
        System.out.println("\n" + universityList);

        System.out.println("\n=========================Task 6==============================");
        System.out.println("Students lists sizes are equal: " + (students.size() == studentList.size()));
        System.out.println("Universities lists sizes are equal: " + (universities.size() == universityList.size()));

        System.out.println("\n=========================Task 7-10==============================");
        System.out.println("Students with course number more then 2:");
        students
                .stream()
                .filter(s -> s.getCurrentCourseNumber() > 2)
                .map(s -> JsonUtil.studentToJSON(s).toString())
                .peek(System.out::println)
                .forEach(s -> System.out.println(JsonUtil.JSONToStudent(s)));

        System.out.println("Moscow universities:");
        universities
                .stream()
                .filter(u -> u.getFullName().contains("Московский"))
                .map(u -> JsonUtil.universityToJSON(u).toString())
                .peek(System.out::println)
                .forEach(s -> System.out.println(JsonUtil.JSONToUniversity(s)));
    }
}
