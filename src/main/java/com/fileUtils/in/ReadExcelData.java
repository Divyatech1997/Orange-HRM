package com.fileUtils.in;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class ReadExcelData {

	@DataProvider(name="login0",indices=0)
	public String[][] excelData() throws IOException {
	
	File file=new File(System.getProperty("user.dir")+"\\TestData\\TestData.xlsx");
	FileInputStream excelFile = new FileInputStream(file);
	XSSFWorkbook workbook = new XSSFWorkbook(excelFile);
	XSSFSheet sheet = workbook.getSheet("Sheet1");
	
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
	
	@DataProvider(name="login1",indices=1)
	public String[][] excelData1() throws IOException {
	
	File file=new File(System.getProperty("user.dir")+"\\TestData\\TestData.xlsx");
	FileInputStream excelFile = new FileInputStream(file);
	XSSFWorkbook workbook = new XSSFWorkbook(excelFile);
	XSSFSheet sheet = workbook.getSheet("Sheet1");
	
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

	@DataProvider(name="login2",indices=2)
	public String[][] excelData2() throws IOException {
	
	File file=new File(System.getProperty("user.dir")+"\\TestData\\TestData.xlsx");
	FileInputStream excelFile = new FileInputStream(file);
	XSSFWorkbook workbook = new XSSFWorkbook(excelFile);
	XSSFSheet sheet = workbook.getSheet("Sheet1");
	
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

	@DataProvider(name="login3",indices=3)
	public String[][] excelData3() throws IOException {
	
	File file=new File(System.getProperty("user.dir")+"\\TestData\\TestData.xlsx");
	FileInputStream excelFile = new FileInputStream(file);
	XSSFWorkbook workbook = new XSSFWorkbook(excelFile);
	XSSFSheet sheet = workbook.getSheet("Sheet1");
	
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
	
	
	@DataProvider(name="login4",indices=4)
	public String[][] excelData4() throws IOException {
	
	File file=new File(System.getProperty("user.dir")+"\\TestData\\TestData.xlsx");
	FileInputStream excelFile = new FileInputStream(file);
	XSSFWorkbook workbook = new XSSFWorkbook(excelFile);
	XSSFSheet sheet = workbook.getSheet("Sheet1");
	
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


	@DataProvider(name="login5",indices=5)
	public String[][] excelData5() throws IOException {
	
	File file=new File(System.getProperty("user.dir")+"\\TestData\\TestData.xlsx");
	FileInputStream excelFile = new FileInputStream(file);
	XSSFWorkbook workbook = new XSSFWorkbook(excelFile);
	XSSFSheet sheet = workbook.getSheet("Sheet1");
	
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

	
	@DataProvider(name="login6",indices=6)
	public String[][] excelData6() throws IOException {
	
	File file=new File(System.getProperty("user.dir")+"\\TestData\\TestData.xlsx");
	FileInputStream excelFile = new FileInputStream(file);
	XSSFWorkbook workbook = new XSSFWorkbook(excelFile);
	XSSFSheet sheet = workbook.getSheet("Sheet1");
	
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

	
	
	@DataProvider(name="login7",indices=7)
	public String[][] excelData7() throws IOException {
	
	File file=new File(System.getProperty("user.dir")+"\\TestData\\TestData.xlsx");
	FileInputStream excelFile = new FileInputStream(file);
	XSSFWorkbook workbook = new XSSFWorkbook(excelFile);
	XSSFSheet sheet = workbook.getSheet("Sheet1");
	
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

	
	@DataProvider(name="login8",indices=8)
	public String[][] excelData8() throws IOException {
	
	File file=new File(System.getProperty("user.dir")+"\\TestData\\TestData.xlsx");
	FileInputStream excelFile = new FileInputStream(file);
	XSSFWorkbook workbook = new XSSFWorkbook(excelFile);
	XSSFSheet sheet = workbook.getSheet("Sheet1");
	
	int RowCount = sheet.getPhysicalNumberOfRows();
	//System.out.println(RowCount);
	
	
	int ColumnCount = sheet.getRow(0).getLastCellNum();
	//System.out.println(ColumnCount);
	String data[][]=new String[RowCount-1][ColumnCount];
	
	for(int i=0;i<RowCount-1;i++) {
		for(int j=0;j<ColumnCount;j++) {
			DataFormatter df=new DataFormatter();
			data[i][j]=df.formatCellValue(sheet.getRow(i+1).getCell(j));
			//System.out.print(data[i][j]+" ");
		}//System.out.println();
	}
	workbook.close();
	excelFile.close();
	return data;
	}

	
	@DataProvider(name="login9",indices=9)
	public String[][] excelData9() throws IOException {
	
	File file=new File(System.getProperty("user.dir")+"\\TestData\\TestData.xlsx");
	FileInputStream excelFile = new FileInputStream(file);
	XSSFWorkbook workbook = new XSSFWorkbook(excelFile);
	XSSFSheet sheet = workbook.getSheet("Sheet1");
	
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
	
	
	@DataProvider(name="login10",indices=10)
	public String[][] excelData10() throws IOException {
	
	File file=new File(System.getProperty("user.dir")+"\\TestData\\TestData.xlsx");
	FileInputStream excelFile = new FileInputStream(file);
	XSSFWorkbook workbook = new XSSFWorkbook(excelFile);
	XSSFSheet sheet = workbook.getSheet("Sheet1");
	
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


	@DataProvider(name="login11",indices=11)
	public String[][] excelData11() throws IOException {
	
	File file=new File(System.getProperty("user.dir")+"\\TestData\\TestData.xlsx");
	FileInputStream excelFile = new FileInputStream(file);
	XSSFWorkbook workbook = new XSSFWorkbook(excelFile);
	XSSFSheet sheet = workbook.getSheet("Sheet1");
	
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
	
	
	
	@DataProvider(name="login12",indices=12)
	public String[][] excelData12() throws IOException {
	
	File file=new File(System.getProperty("user.dir")+"\\TestData\\TestData.xlsx");
	FileInputStream excelFile = new FileInputStream(file);
	XSSFWorkbook workbook = new XSSFWorkbook(excelFile);
	XSSFSheet sheet = workbook.getSheet("Sheet1");
	
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

	@DataProvider(name="login13",indices=13)
	public String[][] excelData13() throws IOException{
		File file = new File(".\\TestData\\TestData.xlsx");
		FileInputStream fis = new FileInputStream(file);
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		int rowCount = sheet.getPhysicalNumberOfRows();
		int columnCount = sheet.getRow(0).getLastCellNum();
		String data[][] = new String[rowCount-1][columnCount];
		for(int i=0;i<rowCount-1;i++) {
			for(int j=0;j<columnCount;j++) {
				DataFormatter df = new DataFormatter();
				data [i][j] = df.formatCellValue(sheet.getRow(i+1).getCell(j));
			}}
		workbook.close();
		fis.close();
		return data;
		}
	
	
	
	@DataProvider(name="login14",indices=14)
	public String[][] excelData14() throws IOException{
		File file = new File(".\\TestData\\TestData.xlsx");
		FileInputStream fis = new FileInputStream(file);
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		int rowCount = sheet.getPhysicalNumberOfRows();
		int columnCount = sheet.getRow(0).getLastCellNum();
		String[][] data = new String[rowCount-1][columnCount];
		for(int i=0;i<rowCount-1;i++) {
			for(int j=0;j<columnCount;j++) {
				DataFormatter df = new DataFormatter();
				data[i][j] = df.formatCellValue(sheet.getRow(i+1).getCell(j));
			}
				}
		workbook.close();
		fis.close();
		return data;
		
	}
			
			
	@DataProvider(name="login15",indices=15)
	public String[][] excelData15() throws IOException{
		File file = new File(".\\TestData\\TestData.xlsx");
		FileInputStream fis = new FileInputStream(file);
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		int rowCount = sheet.getPhysicalNumberOfRows();
		int columnCount = sheet.getRow(0).getLastCellNum();
		String[][] data = new String[rowCount-1][columnCount];
		for(int i=0;i<rowCount-1;i++) {
			for(int j=0;j<columnCount;j++) {
				DataFormatter df = new DataFormatter();
				data[i][j] = df.formatCellValue(sheet.getRow(i+1).getCell(j));
			}
				}
		workbook.close();
		fis.close();
		return data;
		
	}
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
}
