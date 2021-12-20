import io.XlsReader;
import models.Student;
import models.University;
import util.JsonUtil;

import java.util.List;

public class MainAppPRACTICE {
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

        String studentListJSON = JsonUtil.studentListToJSON(students);
        String universityListLSON = JsonUtil.universityListToJSON(universities);
        System.out.println("Student list:\n" + studentListJSON + "\n");
        System.out.println("University list:\n" + universityListLSON + "\n");

        List<Student> studentList = JsonUtil.JSONToStudentList(studentListJSON);
        List<University> universityList = JsonUtil.JSONToUniversityList(universityListLSON);
        System.out.println(studentList);
        System.out.println("\n" + universityList);

        System.out.println("Students lists sizes are equal: " + (students.size() == studentList.size()));
        System.out.println("Universities lists sizes are equal: " + (universities.size() == universityList.size()));

        System.out.println("Students with course number more then 2:");
        students
                .stream()
                .filter(s -> s.getCurrentCourseNumber() > 2)
                .map(s -> JsonUtil.studentToJSON(s))
                .peek(System.out::println)
                .forEach(s -> System.out.println(JsonUtil.JSONToStudent(s)));

        System.out.println("Moscow universities:");
        universities
                .stream()
                .filter(u -> u.getFullName().contains("Московский"))
                .map(u -> JsonUtil.universityToJSON(u))
                .peek(System.out::println)
                .forEach(s -> System.out.println(JsonUtil.JSONToUniversity(s)));
    }
}
