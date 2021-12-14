import enums.StudyProfile;
import models.Student;
import models.University;

import java.util.ArrayList;
import java.util.List;

public class ObjectsList {

    public static List<University> getUniversities() {
        List<University> universities = new ArrayList<>();
        universities.add(new University.Builder()
                .id("1")
                .fullName("Башкирский Государственный Университет")
                .shortName("БашГУ")
                .mainProfile(StudyProfile.LINGUISTICS)
                .yearOfFoundation(1909)
                .build());
        universities.add(new University.Builder()
                .id("2")
                .fullName("Башкирский Государственный Медицинский Университет")
                .shortName("БГМУ")
                .mainProfile(StudyProfile.MEDICINE)
                .yearOfFoundation(1932)
                .build());
        universities.add(new University.Builder()
                .id("3")
                .fullName("Башкирский Государственный Аграрный Университет")
                .shortName("БГАУ")
                .mainProfile(StudyProfile.ECONOMY)
                .yearOfFoundation(1930)
                .build());
        universities.add(new University.Builder()
                .id("4")
                .fullName("Уфимский Государственный Авиационный Технический Университет")
                .shortName("УГАТУ")
                .mainProfile(StudyProfile.PROGRAMMING)
                .yearOfFoundation(1909)
                .build());
        universities.add(new University.Builder()
                .id("5")
                .fullName("Уфимский Государственный Нефтяной Технический Университет")
                .shortName("УГНТУ")
                .mainProfile(StudyProfile.PHYSICS)
                .yearOfFoundation(1909)
                .build());
        universities.add(new University.Builder()
                .id("6")
                .fullName("Башкирский Государственный Педагогический Университет")
                .shortName("БГПУ")
                .mainProfile(StudyProfile.HISTORY)
                .yearOfFoundation(1967)
                .build());
        universities.add(new University.Builder()
                .id("7")
                .fullName("Московский государственный университет")
                .shortName("МГУ")
                .mainProfile(StudyProfile.PHILOLOGY)
                .yearOfFoundation(1909)
                .build());
        universities.add(new University.Builder()
                .id("8")
                .fullName("Московский физико-технический институт")
                .shortName("МФТИ")
                .mainProfile(StudyProfile.PHYSICS)
                .yearOfFoundation(1946)
                .build());
        universities.add(new University.Builder()
                .id("9")
                .fullName("Национальный исследовательский ядерный университет")
                .shortName("МИТИ")
                .mainProfile(StudyProfile.MATHEMATICS)
                .yearOfFoundation(1942)
                .build());
        universities.add(new University.Builder()
                .id("10")
                .fullName("Национальный исследовательский университет «Высшая школа экономики»")
                .shortName("НИУ ВШЭ")
                .mainProfile(StudyProfile.ECONOMY)
                .yearOfFoundation(1942)
                .build());
        universities.add(new University.Builder()
                .id("11")
                .fullName("Московский государственный технический университет им. Н.Э. Баумана")
                .shortName("МГТУ")
                .mainProfile(StudyProfile.PROGRAMMING)
                .yearOfFoundation(1830)
                .build());
        universities.add(new University.Builder()
                .id("12")
                .fullName("Российская академия народного хозяйства и государственной службы при Президенте Российской Федерации")
                .shortName("РАНХиГС")
                .mainProfile(StudyProfile.ECONOMY)
                .yearOfFoundation(2010)
                .build());
        universities.add(new University.Builder()
                .id("13")
                .fullName("Российский экономический университет имени Г.В. Плеханова")
                .shortName("РЭУ")
                .mainProfile(StudyProfile.ECONOMY)
                .yearOfFoundation(1956)
                .build());
        universities.add(new University.Builder()
                .id("14")
                .fullName("Национальный исследовательский технологический университет")
                .shortName("НИТУ")
                .mainProfile(StudyProfile.PROGRAMMING)
                .yearOfFoundation(1918)
                .build());
        universities.add(new University.Builder()
                .id("15")
                .fullName("Российский государственный университет нефти и газа им. И.М. Губкина")
                .shortName("РГУ НИУ")
                .mainProfile(StudyProfile.PHYSICS)
                .yearOfFoundation(1930)
                .build());

        return universities;
    }

    public static List<Student> getStudents() {
        List<Student> students = new ArrayList<>();
        students.add(new Student.Builder()
                .fullName("Мельникова Ксения Витальевна")
                .universityId("1")
                .currentCourseNumber(3)
                .avgExamScore(4.5f)
                .build());
        students.add(new Student.Builder()
                .fullName("Иванова София Ивановна")
                .universityId("1")
                .currentCourseNumber(2)
                .avgExamScore(4.9f)
                .build());
        students.add(new Student.Builder()
                .fullName("Буракшаева Юлия Сергеевна")
                .universityId("1")
                .currentCourseNumber(4)
                .avgExamScore(3.8f)
                .build());
        students.add(new Student.Builder()
                .fullName("Фурсова Елизавета Владимировна")
                .universityId("2")
                .currentCourseNumber(3)
                .avgExamScore(4.3f)
                .build());
        students.add(new Student.Builder()
                .fullName("Сапсай Иван Алексеевич")
                .universityId("2")
                .currentCourseNumber(1)
                .avgExamScore(3.5f)
                .build());
        students.add(new Student.Builder()
                .fullName("Богословский Артем Михайлович")
                .universityId("3")
                .currentCourseNumber(4)
                .avgExamScore(4.9f)
                .build());
        students.add(new Student.Builder()
                .fullName("Самбикина Юлия Владимировна")
                .universityId("4")
                .currentCourseNumber(2)
                .avgExamScore(3.7f)
                .build());
        students.add(new Student.Builder()
                .fullName("Шпак Ангелина Эдуардовна")
                .universityId("5")
                .currentCourseNumber(3)
                .avgExamScore(2.7f)
                .build());
        students.add(new Student.Builder()
                .fullName("Пименов Максим Евгеньевич")
                .universityId("5")
                .currentCourseNumber(4)
                .avgExamScore(4.7f)
                .build());
        students.add(new Student.Builder()
                .fullName("Сигида Валерия Романовна")
                .universityId("6")
                .currentCourseNumber(1)
                .avgExamScore(5.0f)
                .build());
        students.add(new Student.Builder()
                .fullName("Миронова Елизавета Валерьевна")
                .universityId("6")
                .currentCourseNumber(3)
                .avgExamScore(4.5f)
                .build());
        students.add(new Student.Builder()
                .fullName("Безуглова Анастасия Александровна")
                .universityId("7")
                .currentCourseNumber(4)
                .avgExamScore(3.9f)
                .build());
        students.add(new Student.Builder()
                .fullName("Сергеева Мария Вячеславовна")
                .universityId("8")
                .currentCourseNumber(2)
                .avgExamScore(3.9f)
                .build());
        students.add(new Student.Builder()
                .fullName("Перфильева Милена Егоровна")
                .universityId("9")
                .currentCourseNumber(1)
                .avgExamScore(4.8f)
                .build());
        students.add(new Student.Builder()
                .fullName("Химич Елена Сергеевна")
                .universityId("10")
                .currentCourseNumber(4)
                .avgExamScore(4.6f)
                .build());
        students.add(new Student.Builder()
                .fullName("Бондина Анастасия Борисовна")
                .universityId("10")
                .currentCourseNumber(3)
                .avgExamScore(4.3f)
                .build());
        students.add(new Student.Builder()
                .fullName("Лебедева Екатерина Сергеевна")
                .universityId("11")
                .currentCourseNumber(1)
                .avgExamScore(4.1f)
                .build());
        students.add(new Student.Builder()
                .fullName("Мощева Алина Георгиевна")
                .universityId("12")
                .currentCourseNumber(2)
                .avgExamScore(3.3f)
                .build());
        students.add(new Student.Builder()
                .fullName("Химич Елена Сергеевна")
                .universityId("13")
                .currentCourseNumber(4)
                .avgExamScore(4.6f)
                .build());
        students.add(new Student.Builder()
                .fullName("Моругина Ирина Николаевна")
                .universityId("14")
                .currentCourseNumber(3)
                .avgExamScore(4.2f)
                .build());
        students.add(new Student.Builder()
                .fullName("Прокопенко Алина Дмитривена")
                .universityId("14")
                .currentCourseNumber(2)
                .avgExamScore(4.4f)
                .build());
        students.add(new Student.Builder()
                .fullName("Белюга Татьяна Сергеевна")
                .universityId("15")
                .currentCourseNumber(1)
                .avgExamScore(4.8f)
                .build());
        students.add(new Student.Builder()
                .fullName("Седенкова Анастасия Максимовна")
                .universityId("15")
                .currentCourseNumber(1)
                .avgExamScore(4.3f)
                .build());
        return students;
    }
}
