import enums.StudyProfile;
import models.Statistics;
import models.Student;
import models.University;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ConverterToStatic {

    public static List<Statistics> convert(List<Student> students, List<University> universities) {
        List<Statistics> statistics = new ArrayList<>();
        for (StudyProfile profile : StudyProfile.values()) {
            Statistics statistic = new Statistics();
            statistic.setMainProfile(profile);
            BigDecimal avgScore = BigDecimal.valueOf(students.stream()
                    .filter(s -> universities.stream()
                            .filter(u -> profile.equals(u.getMainProfile()))
                            .map(University::getId)
                            .anyMatch(s.getUniversityId()::equals))
                    .mapToDouble(Student::getAvgExamScore).average().orElse(0.0));
            avgScore = avgScore.setScale(2, BigDecimal.ROUND_HALF_UP);
            statistic.setAvgExamScore(avgScore.doubleValue());
            statistic.setStudCount((int) students.stream()
                    .filter(s -> universities.stream()
                            .filter(u -> profile.equals(u.getMainProfile()))
                            .map(University::getId)
                            .anyMatch(s.getUniversityId()::equals))
                    .count());
            statistic.setUnivCount((int) universities.stream().filter(u -> profile.equals(u.getMainProfile())).count());
            statistic.setUnivNames(universities.stream().filter(u -> profile.equals(u.getMainProfile())).map(University::getShortName).collect(Collectors.toList()));
            statistics.add(statistic);
        }
        return statistics;
    }
}
