package DDT;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class InsertData_In_Excel {
public static void main(String[] args) throws EncryptedDocumentException, IOException {
	FileInputStream fis = new FileInputStream("./src/test/resources/Exceldata.xlsx");
	Workbook wb = WorkbookFactory.create(fis);
	wb.getSheet("Sheet1").createRow(8).createCell(9).setCellValue("Advance Automation");
	FileOutputStream fos = new FileOutputStream("./src/test/resources/Exceldata.xlsx");
	wb.write(fos);
	System.out.println("Value is added");
	wb.close();
	
	
	
	
	
	
	
	
}
}
