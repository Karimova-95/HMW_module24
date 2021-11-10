public class MainApp {

    public static void main(String[] args) {
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

        System.out.println(String.format("Студент: %s\nУниверситет: %s", student, university));
    }
}
