package models;

import enums.StudyProfile;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Statistics {
    private StudyProfile mainProfile;
    private double avgExamScore;
    private int studCount;
    private int univCount;
    private List<String> univNames;
}
