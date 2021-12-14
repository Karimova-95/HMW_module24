package models;

import enums.StudyProfile;

import java.util.List;

public class Statistics {
    private StudyProfile mainProfile;
    private double avgExamScore;
    private int studCount;
    private int univCount;
    private List<String> univNames;

    public Statistics() {
    }

    public Statistics(StudyProfile mainProfile, double avgExamScore, int studCount, int univCount, List<String> univNames) {
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

    public double getAvgExamScore() {
        return avgExamScore;
    }

    public void setAvgExamScore(double avgExamScore) {
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
