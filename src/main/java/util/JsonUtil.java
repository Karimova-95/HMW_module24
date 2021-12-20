package util;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import models.Student;
import models.University;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class JsonUtil {
    private static final Gson gson = new GsonBuilder().setPrettyPrinting().create();

    public static String studentToJSON(Student student) {
        return gson.toJson(student);
    }

    public static String universityToJSON(University university) {
        return gson.toJson(university);
    }

    public static String studentListToJSON(List<Student> student) {
        return gson.toJson(student);
    }

    public static String universityListToJSON(List<University> university) {
        return gson.toJson(university);
    }

    public static Student JSONToStudent(String stringJSON) {
        return gson.fromJson(stringJSON, Student.class);
    }

    public static University JSONToUniversity(String stringJSON) {
        return gson.fromJson(stringJSON, University.class);
    }

    public static List<Student> JSONToStudentList(String stringJSON) {
        Type listOfStudents = new TypeToken<ArrayList<Student>>() {}.getType();
        return gson.fromJson(stringJSON, listOfStudents);
    }

    public static List<University> JSONToUniversityList(String stringJSON) {
        Type listOfUniversities = new TypeToken<ArrayList<University>>() {}.getType();
        return gson.fromJson(stringJSON, listOfUniversities);
    }
}
