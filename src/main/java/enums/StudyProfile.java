package enums;

public enum StudyProfile {
    MEDICINE("Медицина"),
    PROGRAMMING("Программирование"),
    PHILOLOGY("Филология"),
    HISTORY("История"),
    ART("Искусство"),
    ECONOMY("Экономика"),
    MARKETING("Маркетинг"),
    PHYSICS("Физика"),
    LINGUISTICS("Лингвистка"),
    MATHEMATICS("Математика");

    final String profileName;

    StudyProfile(String profileName) {
        this.profileName = profileName;
    }

    public String getProfileName() {
        return profileName;
    }
}
