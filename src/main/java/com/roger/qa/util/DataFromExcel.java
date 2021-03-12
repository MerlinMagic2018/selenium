package com.roger.qa.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

import com.roger.qa.base.Base;

public class DataFromExcel extends Base {
	
	static XSSFWorkbook book;
	static XSSFSheet sheet;
	
	public static Object[][] readDataFromExcel(String sheetname) {
		
		try {
			file =  new FileInputStream("D:\\UserData.xlsx");
			book = new XSSFWorkbook(file);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		sheet =  book.getSheet(sheetname);
		int rowLength = sheet.getLastRowNum();
		int cellLength = sheet.getRow(0).getLastCellNum();
		System.out.println("Row Length : "+rowLength+ " Cell Length : "+cellLength);
		Object[][] data =  new Object[rowLength][cellLength];
		for(int i =0;i<rowLength;i++) {
			for(int j=0; j <cellLength; j++) {
		
				data[i][j] = sheet.getRow(i+1).getCell(j).toString();
				System.out.println(data[i][j]);
			}
		}
		
		return data;
		
	}
	
}
