package io;

import models.Student;
import enums.StudyProfile;
import models.University;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Logger;

public class XlsReader {
    private static final Logger LOGGER = Logger.getLogger(XlsReader.class.getName());

    public static List<Student> readStudents(String path) {
        List<Student> students = new ArrayList<>();
        File file = new File("C:\\Users\\Admin\\IdeaProjects\\HMW_module24\\src\\main\\resources\\universityInfo.xlsx");
        XSSFWorkbook wb = null;
        try {
            FileInputStream fis = new FileInputStream(file);
            wb = new XSSFWorkbook(fis);
        } catch (IOException ex) {
            LOGGER.warning("Возникла ошибка при чтении файла");
        }
        XSSFSheet sheet = wb.getSheetAt(0);
        Iterator<Row> itr = sheet.iterator();
        itr.next();
        while (itr.hasNext()) {
            Row row = itr.next();
            Iterator<Cell> cellIterator = row.cellIterator();   //iterating over each column
            Student student = new Student();
            Cell cell = null;
            while (cellIterator.hasNext()) {
                cell = cellIterator.next();
                if (cell.getCellType() == CellType.STRING) {
                    if (cell.getColumnIndex() == 0) {
                        student.setUniversityId(cell.getStringCellValue());
                    } else if (cell.getColumnIndex() == 1) {
                        student.setFullName(cell.getStringCellValue());
                    }
                } else if (cell.getCellType() == CellType.NUMERIC) {
                    if (cell.getColumnIndex() == 2) {
                        student.setCurrentCourseNumber((int) cell.getNumericCellValue());
                    } else if (cell.getColumnIndex() == 3) {
                        student.setAvgExamScore((float) cell.getNumericCellValue());
                    }
                }
            }
            students.add(cell.getRowIndex() - 1, student);
        }
        return students;
    }

    public static List<University> readUniversities(String path) {
        List<University> universities = new ArrayList<>();
        File file = new File(path);
        XSSFWorkbook wb = null;
        try {
            FileInputStream fis = new FileInputStream(file);
            wb = new XSSFWorkbook(fis);
        } catch (IOException ex) {
            LOGGER.warning("Возникла ошибка при чтении файла");
        }
        XSSFSheet sheet = wb.getSheetAt(1);
        Iterator<Row> itr = sheet.iterator();
        itr.next();
        while (itr.hasNext()) {
            Row row = itr.next();
            Iterator<Cell> cellIterator = row.cellIterator();
            University university = new University();
            Cell cell = null;
            while (cellIterator.hasNext()) {
                cell = cellIterator.next();
                if (cell.getCellType() == CellType.STRING) {
                    if (cell.getColumnIndex() == 0) {
                        university.setId(cell.getStringCellValue());
                    } else if (cell.getColumnIndex() == 1) {
                        university.setFullName(cell.getStringCellValue());
                    } else if (cell.getColumnIndex() == 2) {
                        university.setShortName(cell.getStringCellValue());
                    }
                } else if (cell.getCellType() == CellType.NUMERIC && cell.getColumnIndex() == 3) {
                    university.setYearOfFoundation((int) cell.getNumericCellValue());
                } else if (cell.getColumnIndex() == 4) {
                    university.setMainProfile(StudyProfile.valueOf(cell.getStringCellValue()));
                }
            }
            universities.add(cell.getRowIndex() - 1, university);
        }
        return universities;
    }
}
