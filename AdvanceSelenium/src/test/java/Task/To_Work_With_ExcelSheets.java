package Task;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class To_Work_With_ExcelSheets {
public static void main(String[] args) throws EncryptedDocumentException, IOException {
	FileInputStream fis = new FileInputStream("./src/test/resources/prop.properties");
    Workbook wb = WorkbookFactory.create(fis);
   System.out.println(wb.getSheet("Sheet1").getRow(4).getCell(4).getStringCellValue());
   System.out.println(wb.getSheet("Sheet1").getRow(6).getCell(4).getStringCellValue());
   System.out.println(wb.getSheet("Sheet1").getRow(7).getCell(4).getStringCellValue());
   WebDriver driver = new ChromeDriver();
   

}
}
