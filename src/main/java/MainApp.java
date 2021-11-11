import java.io.IOException;

public class MainApp {

    public static void main(String[] args) throws IOException {

// =========================Homework module 24==============================
        Student student = new Student.Builder()
                .fullName("Анатолий Степанов")
                .universityId("1236")
                .currentCourseNumber(3)
                .avgExamScore(4)
                .build();

        University university = new University.Builder()
                .id("7596")
                .fullName("Московский Государственный Университет")
                .shortName("МГУ")
                .yearOfFoundation(1755)
                .mainProfile(StudyProfile.IT)
                .build();

        System.out.printf("Студент: %s\nУниверситет: %s%n", student, university);

// =========================Homework module 25==============================
        System.out.println(ReadExcelFile.readStudents("C:\\Users\\Admin\\IdeaProjects\\HMW_module24\\src\\main\\resources\\universityInfo.xlsx"));
        System.out.println(ReadExcelFile.readUniversities("C:\\Users\\Admin\\IdeaProjects\\HMW_module24\\src\\main\\resources\\universityInfo.xlsx"));
    }
}
