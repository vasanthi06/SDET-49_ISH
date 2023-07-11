package ish_practice;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class DataProvider_fromexcel {
    

public Object[][] readMultipleData(String Sheetname) throws Throwable
{
	FileInputStream fis = new FileInputStream("./testdata/testscriptdata.xlsx");
	Workbook wb = WorkbookFactory.create(fis);
	Sheet sh = wb.getSheet("grd");
	int lastRow = sh.getLastRowNum();
	int lastCel = sh.getRow(0).getLastCellNum();
	
	
	Object[][]data =new Object[lastRow][lastCel];
	
	
	for(int i=0;i<lastRow;i++)
	{
		for(int j=0 ; j<lastCel; j++)
		{
			data[i][j]=sh.getRow(i+1).getCell(j).getStringCellValue();
		}
	}
	
	return data;
	
	
}

	
	
	
}
