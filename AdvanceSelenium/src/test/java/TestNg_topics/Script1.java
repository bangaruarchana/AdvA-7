package TestNg_topics;
import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;
import genericlibrary.ExcelUtil;
import genericlibrary.WebdriverUtil;
import pomRepos.LoginPage;
import pomRepos.LogoutPage;
import pomRepos.OrganisationPage;

public class Script1 {
	
	@Test
	public void launch() throws IOException, InterruptedException {
		Reporter.log("testng23",true);
		WebDriver driver = new ChromeDriver();
		WebdriverUtil wb = new WebdriverUtil();
		ExcelUtil um = new ExcelUtil();
		wb.MaximizeTheWindow(driver);
		wb.ImplicitlyWait(driver);
		driver.get(um.getDatafromPropertyFile("url"));
		LoginPage lp = new LoginPage(driver);
		lp.getUserTxtBox().sendKeys(um.getDatafromPropertyFile("username"));
		lp.getPswd().sendKeys(um.getDatafromPropertyFile("password"));
		lp.getLogin().click();
		Thread.sleep(2000);
		OrganisationPage op = new OrganisationPage(driver);
		op.getOrganisationLink().click();
		op.getCreateOrganisation().click();
		op.getOrgName().sendKeys(um.getScriptDatafromExcelFile("Organisation", 0, 0));
		op.getNotifyownerCheckBox().click();
		op.getSaveButton().click();
		LogoutPage lo = new LogoutPage(driver);
		lo.getAdministratorBox().click();
		lo.getLogoutButon().click();
		Thread.sleep(2000);
		driver.close();
		
		
	}

	

}
