package models;

import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

@Data
@NoArgsConstructor
@AllArgsConstructor
@XmlType
@XmlAccessorType(XmlAccessType.FIELD)
public class Student {
    @SerializedName(value = "name")
    @XmlElement(name = "studentName")
    private String fullName;
    private String universityId;
    @XmlTransient
    private int currentCourseNumber;
    @XmlElement(name = "avgScore")
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
