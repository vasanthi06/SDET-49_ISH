package iSH_sms_generic_Utilities;



	

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
/**
 * used to perfrom Workbook releated operations like read , write , getcount etc
 
 * @param <Workbook>
 *
 */
public class ExcelUtlity {
	
	/**
	 * read the data from excel based row & column index
	 * @param filePath
	 * @param sheetName
	 * @param rowNum
	 * @param celNum
	 * @param WorkbookFactory 
	 * @return
	 * @throws Throwable
	 * @throws IOException
	 */
	public String getDataFromExcel(String filepath,String sheetName, int rowNum , int celNum ) throws Throwable, IOException {
		FileInputStream fis1 = new FileInputStream(filepath);
		Workbook wb =  WorkbookFactory.create(fis1);
	    Sheet sheet = wb.getSheet(sheetName);
	    Row row =  sheet.getRow(rowNum);
	    String data = row.getCell(celNum).toString();
	    wb.close();
		return data;
	}
	/**
	 * read the date based on testId and Required Column name 
	 * @param filePath
	 * @param sheetName
	 * @param testId
	 * @param columnHeader
	 * @return
	 * @throws Throwable
	 * @throws IOException
	 */
	public String getDataFromExcelBasedTestId( String filepath,String sheetName , String testId, String columnHeader ) throws Throwable, IOException {
		FileInputStream fis1 = new FileInputStream(filepath);
		Workbook wb =  WorkbookFactory.create(fis1);
		Sheet sheet = wb.getSheet(sheetName);
		int rowCount = sheet.getLastRowNum();
		int testRowNum = 0;
		String actTestID="";
		String actColHeaderName="";
		String data="";
		
		for(int i=0; i<=rowCount; i++) {
			try { actTestID = sheet.getRow(i).getCell(0).toString();} catch (Exception e) {}

			if(actTestID.equalsIgnoreCase(testId)) {
				break;				
			}
			testRowNum++;
		}
		int testColNum =0;
		int celCountforTest = sheet.getRow(testRowNum-1).getLastCellNum();
		for(int j=0; j<celCountforTest; j++) {
			try {actColHeaderName =  sheet.getRow(testRowNum-1).getCell(j).toString(); } catch (Exception e) {}
			if(actColHeaderName.equalsIgnoreCase(columnHeader)) {
				break;
			}
			testColNum++;
		}
		try {data =  sheet.getRow(testRowNum).getCell(testColNum).toString();}catch (Exception e) {}
		return data;
	}
	/**
	 * used to get the maximum used row count in required Sheet 
	 * @param filePath
	 * @param sheetName
	 * @param WorkbookFactory 
	 * @return
	 * @throws Throwable
	 */
	public int  getRowCount(String filepath, String sheetName) throws Throwable {
		FileInputStream fis1 = new FileInputStream(filepath);
		Workbook wb =  WorkbookFactory.create(fis1);
		Sheet sheet = wb.getSheet(sheetName);
		int rowCount = sheet.getLastRowNum();
		return rowCount;
	}
	/**
	 * 
	 * @param filePath
	 * @param sheetName
	 * @param testId
	 * @param columnHeade
	 * @param data
	 */
	public void setDataExcel( String filepath, String sheetName , int rowNum, int celNum ,String data) throws Throwable {
		FileInputStream fis  = new FileInputStream(filepath);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet(sheetName);
		Row row = sh.getRow(rowNum);
		Cell cel = row.createCell(celNum);
		cel.setCellValue(data);
		FileOutputStream fos = new FileOutputStream(filepath);
		wb.write(fos);
		wb.close();
		
	}
	
	public String getDatafromExcel(String sheetName,int rowNO,int cellNo) throws EncryptedDocumentException, FileNotFoundException, IOException
	{
		Workbook wb = WorkbookFactory.create(new FileInputStream("./testdata/testscriptdata.xlsx"));
		String value = wb.getSheet("tt").getRow(rowNO).getCell(cellNo).toString();
		return value;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
