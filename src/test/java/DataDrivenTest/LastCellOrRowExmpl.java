package DataDrivenTest;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class LastCellOrRowExmpl {

	public static void main(String[] args) throws IOException {

		String path = "C:\\DataDrivenFileTest1\\session-data (34).xlsx";

		FileInputStream file = new FileInputStream(path);

		XSSFWorkbook excel = new XSSFWorkbook(file);

		XSSFSheet sheet = excel.getSheet("sheet1");

		// Last cell number in row 6
		int val1 = sheet.getRow(6).getLastCellNum();

		// Last row number in sheet
		int val2 = sheet.getLastRowNum();

//int - Because these methods are designed to return the position/count of rows and cells, not the actual cell data.
		
		System.out.println("Last Cell Number: " + val1);
		System.out.println("Last Row Number: " + val2);

		excel.close();
		file.close();
	}
}