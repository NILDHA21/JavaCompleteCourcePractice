package com.utilities;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
//import org.testng.annotations.Test;

public class ReadExcel {
//	@Test
	public static String[][] readExcel() throws IOException {
		DataFormatter formatter = new DataFormatter();		
		String path = System.getProperty("user.dir") + "/src/main/resources/Student Data for Eclipse.xlsx";
//		FileInputStream file = new FileInputStream("C:\\Users\\Admin\\eclipse-workspace\\Project_Hybrid_Framework\\src\\main\\resources\\Student Data for Eclipse.xlsx");
		FileInputStream file = new FileInputStream(path);
		
		XSSFWorkbook workbook = new XSSFWorkbook(file); // read excel
		XSSFSheet sheet = workbook.getSheet("Sheet1"); // read sheet
//		XSSFRow row = sheet.getRow(2); // read row
//		XSSFCell cell = row.getCell(0); // read column
//		System.out.println(cell.getStringCellValue());
		
		int noOfRows = sheet.getLastRowNum();
		System.out.println(noOfRows);
		
		int noOfColumns = sheet.getRow(0).getLastCellNum();
		System.out.println(noOfColumns);
		
		String data[][] = new String[noOfRows][noOfColumns]; //declare to send 2d data to data provider

		for(int i = 0; i< noOfRows; i++) 
//		for(int i = 0; i<= noOfRows; i++) //when added equal the takes total rows if not then one row less
		{
		XSSFRow row = sheet.getRow(i+1);
			for(int j = 0; j < noOfColumns; j++) {
				XSSFCell cell = row.getCell(j);
				data[i][j] = formatter.formatCellValue(cell);
//				System.out.print(data + " ");
			}
//			System.out.println();
		}
		return data;
	}
}
