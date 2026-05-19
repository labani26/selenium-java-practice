package DataDrivenTest;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class CreateRowOrGetRowExmpl {

	public static void main(String[] args) throws IOException {

		String path = "C:\\DataDrivenFileTest1\\session-data (34).xlsx";

		FileInputStream file = new FileInputStream(path);

		XSSFWorkbook excel = new XSSFWorkbook(file);

		XSSFSheet sheet = excel.getSheet("sheet1");

		// Create row and cell
		sheet.createRow(2).createCell(10).setCellValue("selenium test");
		
//		setCellValue() =
//		returns void, not String.
//		So you cannot store it in a variable.

		// Get existing row and create cell
		sheet.getRow(10).createCell(12).setCellValue("Selenium test test");

		// Write data into excel file
		FileOutputStream output = new FileOutputStream(path);

		excel.write(output);

		System.out.println("Data inserted successfully");

		excel.close();
		file.close();
		output.close();
	}
}