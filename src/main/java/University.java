import lombok.Data;

public class University {
    private String id;
    private String fullName;
    private String shortName;
    private int yearOfFoundation;
    private StudyProfile mainProfile;

    public static class Builder {
        private String id;
        private String fullName;
        private String shortName;
        private int yearOfFoundation;
        private StudyProfile mainProfile;

        public Builder(String id, String fullName, String shortName, int yearOfFoundation, StudyProfile mainProfile) {
            this.id = id;
            this.fullName = fullName;
            this.shortName = shortName;
            this.yearOfFoundation = yearOfFoundation;
            this.mainProfile = mainProfile;
        }

        public Builder() {
        }

        public Builder id(String val) {
            id = val;
            return this;
        }

        public Builder fullName(String val) {
            fullName = val;
            return this;
        }

        public Builder shortName(String val) {
            shortName = val;
            return this;
        }
        public Builder yearOfFoundation(int val) {
            yearOfFoundation = val;
            return this;
        }
        public Builder mainProfile(StudyProfile val) {
            mainProfile = val;
            return this;
        }

        public University build() {
            return new University(this);
        }
    }

    private University(Builder builder) {
        id = builder.id;
        fullName = builder.fullName;
        shortName = builder.shortName;
        yearOfFoundation = builder.yearOfFoundation;
        mainProfile = builder.mainProfile;
    }

    public University() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public int getYearOfFoundation() {
        return yearOfFoundation;
    }

    public void setYearOfFoundation(int yearOfFoundation) {
        this.yearOfFoundation = yearOfFoundation;
    }

    public StudyProfile getMainProfile() {
        return mainProfile;
    }

    public void setMainProfile(StudyProfile mainProfile) {
        this.mainProfile = mainProfile;
    }

    @Override
    public String toString() {
        return "University{" +
                "id='" + id + '\'' +
                ", fullName='" + fullName + '\'' +
                ", shortName='" + shortName + '\'' +
                ", yearOfFoundation=" + yearOfFoundation +
                ", mainProfile=" + mainProfile +
                '}';
    }
}
