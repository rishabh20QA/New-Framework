package datadriven;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
public class Data_Excel {
	public static void main(String[] args) throws IOException {
//		declared filename and sheetname
		String filepath= "C:\\Users\\ADMIN\\Desktop\\Codes\\MyCSV.xlsx";
		String sheetname= "MySheet";
//		loading of file
		FileInputStream file=new FileInputStream(new File(filepath));
		
		Workbook workbook= new XSSFWorkbook(file);
		// load the sheet
		Sheet sheet= workbook.getSheet(sheetname);
		//loading the row 0
		Row row = sheet.getRow(1);
		
		String username= row.getCell(0).getStringCellValue();
		String password= row.getCell(1).getStringCellValue();
		System.out.println(username);
		System.out.println(password);
		
		
		
	}
	

}
