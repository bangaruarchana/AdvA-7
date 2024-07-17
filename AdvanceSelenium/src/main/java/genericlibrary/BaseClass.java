package genericlibrary;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import pomRepos.LoginPage;
import pomRepos.LogoutPage;

public class BaseClass {
	public static WebDriver driver = new ChromeDriver();
	public static WebdriverUtil wb = new WebdriverUtil();
	public static ExcelUtil um = new ExcelUtil();
	public static LoginPage lp = new LoginPage(driver);
	public static LogoutPage lo = new LogoutPage(driver); 
	public static JavaUtil ja = new JavaUtil();
	@BeforeSuite(alwaysRun = true)
	public void beforeSuite() {
		Reporter.log("Report Generation",true);
	}
	@BeforeClass(alwaysRun = true)
	public void beforeClass() throws IOException {
		driver = new ChromeDriver();
		wb.MaximizeTheWindow(driver);
		wb.ImplicitlyWait(driver);
		driver.get(um.getDatafromPropertyFile("url"));	
	}
	@BeforeMethod(alwaysRun = true)
	public void beforeMethod() throws IOException {
		lp=new LoginPage(driver);
		lp.getUserTxtBox().sendKeys(um.getDatafromPropertyFile("username"));
		lp.getPswd().sendKeys(um.getDatafromPropertyFile("password"));
		lp.getLogin().click();
	}
	@AfterMethod(alwaysRun = true)
	public void afterMethod() {
		lo= new LogoutPage(driver);
		lo.getAdministratorBox().click();
		lo.getLogoutButon().click();
	}
	@AfterClass(alwaysRun = true)
	public void afterclass() {
		wb.closeBrowser(driver);
	}
	@AfterSuite(alwaysRun = true)
	public void afterSuite() {
		Reporter.log("Report",true);
	
	}
}
