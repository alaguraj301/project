package com.java.datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Write_Data {

	static String path="C:\\\\Users\\\\admin\\\\Desktop\\\\user.form.xlsx";
	
	
	public static void write_data() throws Throwable  {
		
		File f =new File(path);
		
		FileInputStream fis=new FileInputStream(f);
		
		Workbook wb=new XSSFWorkbook(fis);
		Sheet createSheet = wb.createSheet("doc.c");
		Row createRow = createSheet.createRow(0);
		Cell createCell = createRow.createCell(0);
		createCell.setCellValue("user details");
		Cell createCell1 = createRow.createCell(1);
		createCell1.setCellValue("pass word");
		
		System.out.println("done");
		
		
		
		FileOutputStream fos=new FileOutputStream(f);
		
		
		wb.write(fos);
		wb.close();
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	public static void main(String[] args) throws Throwable {

		
		write_data();
		
		
		
	}

}
