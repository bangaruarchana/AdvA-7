package code;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import genericlibrary.ExcelUtil;
import genericlibrary.WebdriverUtil;
import pomRepos.LoginPage;

public class Script1UsingPomRepo {
 public static void main(String[] args) throws IOException {
	WebDriver driver = new ChromeDriver();
	ExcelUtil um = new ExcelUtil();
	WebdriverUtil wb = new WebdriverUtil();
	wb.MaximizeTheWindow(driver);
	wb.ImplicitlyWait(driver);
	driver.get(um.getDatafromPropertyFile("url"));
	LoginPage lp = new LoginPage(driver);
	lp.getUserTxtBox().sendKeys(um.getDatafromPropertyFile("username"));
	lp.getPswd().sendKeys(um.getDatafromPropertyFile("password"));
	lp.getLogin().click();
	System.out.println("text in login page" +lp.getText());
}
}
