package genericlibrary;
/**
 * @author Archana N
 */

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
/**
 * the below method is used to fetch the data from the property file
 */
public class ExcelUtil {
	public String getDatafromPropertyFile(String key) throws IOException {
	FileInputStream fis =  new FileInputStream("./src/test/resources/prop.properties");
	Properties p = new Properties();
	p.load(fis);
	return p.getProperty(key);
	
	}
	/**
	 * the below method is used to fetch the data from the excel file
	 */
	//public String getDatafromExcelFile(String sheetname,int rowNum,int colNum) throws EncryptedDocumentException, IOException {
		//FileInputStream fis= new FileInputStream("./src/test/resources/Exceldata.xlsx");
		//Workbook wb = WorkbookFactory.create(fis);
		//Sheet sheet = wb.getSheet(sheetname);
		//return sheet.getRow(rowNum).getCell(colNum).toString();
		
		//}
	/*
	 * the below method is used to fetch the Testdata from the excel file
	 */
	public String getScriptDatafromExcelFile(String sheetname,int rowNum,int colNum) throws EncryptedDocumentException, IOException {
		FileInputStream fis= new FileInputStream("C:\\Users\\Administrator\\eclipse-workspace\\AdvanceSelenium\\src\\test\\resources\\ ScriptData.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet(sheetname);
		return sheet.getRow(rowNum).getCell(colNum).toString();
	}
	/**
	 * the below method is used to fetch the data from excel file using data formatter
	 */
	public String getDatafromExcelFileIDF(String sheetname,int rowNum,int colNum) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream("./src/test/resources/Exceldata.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Cell data = wb.getSheet(sheetname).getRow(rowNum).getCell(colNum);
		DataFormatter result = new DataFormatter();
		return result.formatCellValue(data);	
	}
	}
