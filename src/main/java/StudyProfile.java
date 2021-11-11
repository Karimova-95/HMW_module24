public enum StudyProfile {
    MEDICINE("Медицина"),
    IT("Информационные технологии"),
    TEACHER("Преподаватель");

    String profileName;

    StudyProfile(String profileName) {
        this.profileName = profileName;
    }

    public String getProfileName() {
        return profileName;
    }
}
