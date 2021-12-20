package util;

import comparators.StudentAvgExamScoreComparator;
import comparators.StudentCurrentCourseNumberComparator;
import comparators.StudentFullNameComparator;
import comparators.StudentUniversityIdComparator;
import comparators.StudentsComparator;
import comparators.UniversitiesComparator;
import comparators.UniversityFullNameComparator;
import comparators.UniversityIdComparator;
import comparators.UniversityShortNameComparator;
import comparators.UniversityStudyProfileComparator;
import comparators.UniversityYearOfFoundationComparator;
import enums.StudentComparatorsEnum;
import enums.UniversityComparatorsEnum;

public class ComparatorUtil {

    private ComparatorUtil() {
    }

    public static StudentsComparator getMyComparator(StudentComparatorsEnum studentComparatorsEnum) {
        switch (studentComparatorsEnum.name()) {
            case "STUDENTFULLNAMECOMPARATOR" :
                return new StudentFullNameComparator();
            case "STUDENTUNIVERSITYIDCOMPARATOR" :
                return new StudentUniversityIdComparator();
            case "STUDENTCURRENTCOURSENUMBERCOMPARATOR" :
                return new StudentCurrentCourseNumberComparator();
            default:
                return new StudentAvgExamScoreComparator();
        }
    }

    public static UniversitiesComparator getMyComparator(UniversityComparatorsEnum universityComparatorsEnum) {
        switch (universityComparatorsEnum.name()) {
            case "UNIVERSITYIDCOMPARATOR" :
                return new UniversityIdComparator();
            case "UNIVERSITYFULLNAMECOMPARATOR" :
                return new UniversityFullNameComparator();
            case "UNIVERSITYSHORTNAMECOMPARATOR" :
                return new UniversityShortNameComparator();
            case "UNIVERSITYYEAROFFOUNDATIONCOMPARATOR" :
                return new UniversityYearOfFoundationComparator();
            default:
                return new UniversityStudyProfileComparator();
        }
    }
}
