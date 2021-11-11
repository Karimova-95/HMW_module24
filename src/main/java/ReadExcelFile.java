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

public class ReadExcelFile {

    private ReadExcelFile() {
    }

    public static List<Student> readStudents() throws IOException {
        List<Student> students = new ArrayList<>();
        File file = new File("C:\\Users\\Admin\\IdeaProjects\\HMW_module24\\src\\main\\resources\\universityInfo.xlsx");
        FileInputStream fis = new FileInputStream(file);
        XSSFWorkbook wb = new XSSFWorkbook(fis);
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

    public List<University> readUniversities() {
        List<University> universities = new ArrayList<>();
        /*
        some logic
         */
        return universities;
    }
}
