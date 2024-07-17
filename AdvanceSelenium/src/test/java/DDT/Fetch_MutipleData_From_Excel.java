package DDT;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

public class Fetch_MutipleData_From_Excel {
public static void main(String[] args) throws EncryptedDocumentException, IOException {
	FileInputStream fis = new FileInputStream("./src/test/resources/Exceldata.xlsx");
	Workbook wb = WorkbookFactory.create(fis);
	Sheet sheet = wb.getSheet("Sheet2");
	int rowNum = sheet.getPhysicalNumberOfRows();
	int colNum = sheet.getRow(0).getPhysicalNumberOfCells();
	for(int i=0;i<rowNum;i++) {
		for(int j=0;j<colNum;j++) {
			 Cell data = sheet.getRow(i).getCell(j);	
			 DataFormatter datas = new DataFormatter();
			 System.out.println(datas.formatCellValue(data));

		
		}
	}
	
	
	
	
}
}
