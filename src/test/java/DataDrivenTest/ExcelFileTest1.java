package DataDrivenTest;

import java.io.FileInputStream;
//FileInputStream is used to read files from the computer.

import java.io.IOException;
//Handles file-related exceptions/errors.

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
//XSSFWorkbook → Represents the entire Excel workbook (.xlsx file).
//XSSFSheet → Represents a sheet inside the workbook.

public class ExcelFileTest1 {

	public static void main(String[] args) throws IOException {
//throws IOException means: if any file-reading error occurs, Java will handle it automatically.

		// Path of the Excel file
		String path = "C:\\DataDrivenFileTest1\\session-data (34).xlsx";

		// Used to read the file from the given location
		FileInputStream file = new FileInputStream(path);

		// Opens the Excel workbook
		XSSFWorkbook wb = new XSSFWorkbook(file);

		// Accessing the sheet named "Sheet1"
		XSSFSheet sheet = wb.getSheet("Sheet1");

		// Reading data from row 5, column 0
		// Row index starts from 0
		// Column index also starts from 0
		String val1 = sheet.getRow(5).getCell(0).getStringCellValue();

		// Reading data from row 0, column 2
		String val2 = sheet.getRow(0).getCell(2).getStringCellValue();

		// Printing values in console
		System.out.println("First Value: " + val1);
		System.out.println("Second Value: " + val2);

		// Closing workbook
		wb.close();

		// Closing file
		file.close();
	}
}