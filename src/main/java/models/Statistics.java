package models;

import enums.StudyProfile;

import java.util.List;

public class Statistics {
    private StudyProfile mainProfile;
    private float avgExamScore;
    private int studCount;
    private int univCount;
    private List<String> univNames;

    public Statistics() {
    }

    public Statistics(StudyProfile mainProfile, float avgExamScore, int studCount, int univCount, List<String> univNames) {
        this.mainProfile = mainProfile;
        this.avgExamScore = avgExamScore;
        this.studCount = studCount;
        this.univCount = univCount;
        this.univNames = univNames;
    }

    public StudyProfile getMainProfile() {
        return mainProfile;
    }

    public void setMainProfile(StudyProfile mainProfile) {
        this.mainProfile = mainProfile;
    }

    public float getAvgExamScore() {
        return avgExamScore;
    }

    public void setAvgExamScore(float avgExamScore) {
        this.avgExamScore = avgExamScore;
    }

    public int getStudCount() {
        return studCount;
    }

    public void setStudCount(int studCount) {
        this.studCount = studCount;
    }

    public int getUnivCount() {
        return univCount;
    }

    public void setUnivCount(int univCount) {
        this.univCount = univCount;
    }

    public List<String> getUnivNames() {
        return univNames;
    }

    public void setUnivNames(List<String> univNames) {
        this.univNames = univNames;
    }
}
