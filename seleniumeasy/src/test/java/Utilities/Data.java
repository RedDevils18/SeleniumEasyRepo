package Utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Data {
	public static String FirstName=null;
	public static String SecondName=null;
	
	public static void acessFile () throws IOException {
	FileInputStream file = new FileInputStream("./src/test/resources/Data/datasheet.xlsx");
	XSSFWorkbook wb = new XSSFWorkbook(file);
	XSSFSheet sh = wb.getSheetAt(0);
	Row r = sh.getRow(1);
	Cell c = r.getCell(0);
	FirstName=sh.getRow(1).getCell(0).getStringCellValue();
	System.out.println(FirstName);
	SecondName=sh.getRow(1).getCell(1).getStringCellValue();
	System.out.println(SecondName);
	//System.out.println(c.getStringCellValue());
	/*
	int rowCount = sh.getLastRowNum();
	for(int i =0;i<=rowCount;i++) {
		
		for(int j=0;j<sh.getRow(i).getLastCellNum();j++)
		{
			System.out.println(sh.getRow(i).getCell(j).getStringCellValue());
		}
	}
	      */
}
}
