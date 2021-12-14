import models.Statistics;
import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFFont;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.BorderStyle;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.HorizontalAlignment;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.Row;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.List;
import java.util.stream.Collectors;

public class XlsWriter {
    private static int sheetNumber = 1;
    private static final HSSFWorkbook workbook = new HSSFWorkbook();

    public static void generateAndFillTable(List<Statistics> list, String path) throws IOException {

        OutputStream fileOut = new FileOutputStream(path + "/Statistics.xls");
        HSSFSheet worksheet = workbook.createSheet("Workbook" + sheetNumber++);
        System.out.println(worksheet.getSheetName() + " создан");
        Row row = worksheet.createRow(0);
        row.createCell(0).setCellValue("Профиль обучения");
        row.createCell(1).setCellValue("Средний балл за экзамен");
        row.createCell(2).setCellValue("Количество студентов по профилю");
        row.createCell(3).setCellValue("Количество университетов по профилю");
        row.createCell(4).setCellValue("Названия университетов");

        for (int i = 0; i < list.size(); i++) {
            Row dataRow = worksheet.createRow(i + 1);
            dataRow.createCell(0).setCellValue(list.get(i).getMainProfile().getProfileName());
            dataRow.createCell(1).setCellValue(list.get(i).getAvgExamScore());
            dataRow.createCell(2).setCellValue(list.get(i).getStudCount());
            dataRow.createCell(3).setCellValue(list.get(i).getUnivCount());
            dataRow.createCell(4).setCellValue(list.get(i).getUnivNames().stream().collect(Collectors.joining(", ")));
        }
        System.out.println(worksheet.getSheetName() + " заполнен");

        HSSFFont font = workbook.createFont();
        font.setFontHeightInPoints((short) 12);
        font.setFontName("Times New Roman");
        font.setBold(true);
        font.setItalic(false);

        HSSFCellStyle style = workbook.createCellStyle();
        for (int j = 0; j <= 4; j++) {
            row.getCell(j).setCellStyle(style);
        }
        style.setBorderTop(BorderStyle.THIN); // double lines border
        style.setBorderRight(BorderStyle.THIN);
        style.setBorderBottom(BorderStyle.THIN); // single line border
        style.setFillPattern(FillPatternType.SOLID_FOREGROUND);
        style.setFillForegroundColor(IndexedColors.GREY_25_PERCENT.getIndex());
        style.setAlignment(HorizontalAlignment.CENTER);
        style.setFont(font);
        for (int i = 0; i < 5; i++) {
            worksheet.autoSizeColumn(i);
            worksheet.setColumnWidth(i, worksheet.getColumnWidth(i) * 11 / 10);
        }

        workbook.write(fileOut);
        fileOut.close();
    }

}
