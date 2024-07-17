package DDT;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class FetchData_From_ExcelSheet {
public static void main(String[] args) throws EncryptedDocumentException, IOException {
	FileInputStream fis = new FileInputStream("./src/test/resources/Exceldata.xlsx");
	Workbook wb = WorkbookFactory.create(fis);
	//System.out.println(wb.getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue());
	//System.out.println(wb.getSheet("Sheet1").getRow(2).getCell(1).getNumericCellValue());
	//System.out.println(wb.getSheet("Sheet1").getRow(3).getCell(1).getBooleanCellValue());
	
	Cell Cell1 = wb.getSheet("Sheet1").getRow(1).getCell(0);
	Cell Cell2 =wb.getSheet("Sheet1").getRow(2).getCell(1);
	Cell Cell3 =wb.getSheet("Sheet1").getRow(3).getCell(1);
	DataFormatter data = new DataFormatter();	
	System.out.println(data.formatCellValue(Cell1));
	System.out.println(data.formatCellValue(Cell2));
	System.out.println(data.formatCellValue(Cell3));
	//4,5
	wb.getSheet("Sheet1").getRow(10).getCell(4).getStringCellValue();
	wb.getSheet("Sheet1").getRow(11).getCell(4).getNumericCellValue();
	wb.getSheet("Sheet1").getRow(12).getCell(4).getBooleanCellValue();
	//WebDriver driver = new ChromeDriver();
	//driver.manage().window().maximize();
	//driver.findElement(By.)
	
	
	
}
}
