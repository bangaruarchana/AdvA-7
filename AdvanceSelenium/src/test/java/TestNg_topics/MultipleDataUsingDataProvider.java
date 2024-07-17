package TestNg_topics;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import genericlibrary.ExcelUtil;
import genericlibrary.WebdriverUtil;
import pomRepos.LoginPage;
import pomRepos.OrganisationPage;
public class MultipleDataUsingDataProvider {	
	public String[][] testData() throws EncryptedDocumentException, IOException{
		FileInputStream fis = new FileInputStream("./src/test/resources/ScriptData.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet("Sheet1");
		int rowNum = sheet.getPhysicalNumberOfRows();
		int colNum = sheet.getRow(0).getPhysicalNumberOfCells(); 
		String[][]data = new String[rowNum][colNum];
		for (int i = 0;i<rowNum;i++) {
			for(int j = 0;j<colNum;j++) {
				data[i][j]=sheet.getRow(i).getCell(j).toString();
			}
		}
		return data;
		
	}
	@Test(dataProvider="testdata")
	public void details(String[]testData) throws IOException {
		WebDriver driver= new ChromeDriver();
	    ExcelUtil um = new ExcelUtil();
	    LoginPage lp = new LoginPage(driver);
	    driver.get(um.getDatafromPropertyFile("url"));
	    lp.getUserTxtBox().sendKeys(um.getDatafromPropertyFile("username"));
	    lp.getPswd().sendKeys(um.getDatafromPropertyFile("password"));
	    lp.getLogin().click();
	    OrganisationPage op = new OrganisationPage(driver);
	    op.getOrganisationLink().click();
	    op.getCreateOrganisation().click();
	    op.getOrgName().sendKeys(um.getScriptDatafromExcelFile("Organisation", 0, 0));
	    op.getSaveButton().click();
	    driver.close();
	
	
	}
}
