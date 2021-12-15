package models;

import com.google.gson.annotations.SerializedName;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Student {
    @SerializedName(value = "name")
    private String fullName;
    private String universityId;
    private int currentCourseNumber;
    private float avgExamScore;

    public static class Builder {
        private String fullName;
        private String universityId;
        private int currentCourseNumber;
        private float avgExamScore;

        public Builder() {
        }

        public Builder fullName(String val) {
            fullName = val;
            return this;
        }

        public Builder universityId(String val) {
            universityId = val;
            return this;
        }

        public Builder currentCourseNumber(int val) {
            currentCourseNumber = val;
            return this;
        }

        public Builder avgExamScore(float val) {
            avgExamScore = val;
            return this;
        }

        public Student build() {
            return new Student(this);
        }
    }

    private Student(Builder builder) {
        fullName = builder.fullName;
        universityId = builder.universityId;
        currentCourseNumber = builder.currentCourseNumber;
        avgExamScore = builder.avgExamScore;
    }
}
