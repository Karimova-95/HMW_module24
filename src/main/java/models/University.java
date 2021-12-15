package models;

import com.google.gson.annotations.SerializedName;
import enums.StudyProfile;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class University {
    private String id;
    @SerializedName(value = "name")
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
}
