package comparators;

import models.University;
import org.apache.commons.lang3.StringUtils;

public class UniversityStudyProfileComparator implements UniversitiesComparator {
    @Override
    public int compare(University o1, University o2) {
        return StringUtils.compare(o1.getMainProfile().name(), o2.getMainProfile().name());
    }
}
