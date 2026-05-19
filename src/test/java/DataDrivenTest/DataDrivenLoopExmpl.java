package DataDrivenTest;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataDrivenLoopExmpl {

	public static void main(String[] args) throws IOException {

		String path = "C:\\DataDrivenFileTest1\\session-data (34).xlsx";

		FileInputStream file = new FileInputStream(path);

		XSSFWorkbook excel = new XSSFWorkbook(file);

		XSSFSheet sheet = excel.getSheet("sheet1");

		// Get last row number
		int rowCount = sheet.getLastRowNum();

		System.out.println("Last Row Number: " + rowCount);

		// Loop through all rows
		for (int i = 0; i <= rowCount; i++) {

			// Check if row is not empty
			if (sheet.getRow(i) != null) {

				int count = sheet.getRow(i).getLastCellNum();

				System.out.println("Row Index " + i + " contains " + count + " columns");
			}
		}

		excel.close();
		file.close();
	}
}