package testdata;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import pomPackage.PomSearch;

import org.apache.poi.ss.usermodel.Workbook;

public class ExcelSheet extends PomSearch {
	public static Workbook book;
	public static Sheet Sheet;

	public static  Object[][] readdata(String Sheet1) throws InterruptedException{
		FileInputStream file=null;
		
		try {
			file=new FileInputStream("C:\\Users\\16477\\eclipse-workspace\\Amazonjas\\src\\test\\java\\testdata\\Details.xlsx");
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
		
		{
			
	try {
		 book =WorkbookFactory.create(file);
	}
	catch(IOException a)
	{
		a.printStackTrace();
		
	}Sheet sheet=book.getSheet(Sheet1);
	  
	 Object[][] data=new Object[Sheet.getLastRowNum()][Sheet.getRow(0).getLastCellNum()];
	 
	 for(int i=0;i<Sheet.getLastRowNum();i++) {
		 for(int k=0;k<Sheet.getLastRowNum();k++) {
		 data[i][k]=Sheet.getRow(i+1).getCell(k).toString();
		 Thread.sleep(3000);


	}}
		return data;
		
	}
}
}

	
