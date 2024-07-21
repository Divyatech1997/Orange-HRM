package com.fileUtils.in;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class ReadExcelData {

	@DataProvider(name="login")
	public String[][] excelData() throws IOException {
	
	File file=new File(System.getProperty("user.dir")+"\\TestData\\TestData.xlsx");
	FileInputStream excelFile = new FileInputStream(file);
	XSSFWorkbook workbook = new XSSFWorkbook(excelFile);
	XSSFSheet sheet = workbook.getSheet("Sheet2");
	
	int RowCount = sheet.getPhysicalNumberOfRows();
	System.out.println(RowCount);
	
	
	int ColumnCount = sheet.getRow(0).getLastCellNum();
	System.out.println(ColumnCount);
	String data[][]=new String[RowCount-1][ColumnCount];
	
	for(int i=0;i<RowCount-1;i++) {
		for(int j=0;j<ColumnCount;j++) {
			DataFormatter df=new DataFormatter();
			data[i][j]=df.formatCellValue(sheet.getRow(i+1).getCell(j));
			System.out.print(data[i][j]+" ");
		}System.out.println();
	}
	workbook.close();
	excelFile.close();
	return data;
	}

}
