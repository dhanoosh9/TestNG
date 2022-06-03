package testng.tasks;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteToExcel {
	
	public static void main(String[] args) throws IOException {
		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet sheet = workbook.createSheet("Sheet1");
		
		Row r0 = sheet.createRow(0);
		Cell c0 = r0.createCell(0);
		Cell c1 = r0.createCell(1);
		Cell c2 = r0.createCell(2);
		Cell c3 = r0.createCell(3);
		Cell c4 = r0.createCell(4);
		c0.setCellValue("Name");
		c1.setCellValue("Email");
		c2.setCellValue("Phone");
		c3.setCellValue("PAN");
		c4.setCellValue("Aadhar");
		
		
		
		File file = new File("C:\\Users\\dhano\\Desktop\\eclipse-workspace\\SeleniumOperations\\Data\\ExampleData.xlsx");
		FileOutputStream fos = new FileOutputStream(file);
		workbook.write(fos);
		fos.close();
		workbook.close();
		
		System.out.println("File is written successfully");
	}
	
}
