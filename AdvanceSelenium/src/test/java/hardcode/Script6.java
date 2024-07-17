package hardcode;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import genericlibrary.ExcelUtil;
import genericlibrary.WebdriverUtil;

public class Script6 {
public static void main(String[] args) throws IOException {
	WebDriver driver = new ChromeDriver();
	WebdriverUtil wb = new WebdriverUtil();
	ExcelUtil um = new ExcelUtil();
	wb.MaximizeTheWindow(driver);
	driver.get(um.getDatafromPropertyFile("url"));
	driver.findElement(By.name("user_name")).sendKeys(um.getDatafromPropertyFile("username"));
	driver.findElement(By.name("user_password")).sendKeys(um.getDatafromPropertyFile("password"));
	driver.findElement(By.id("submitButton")).click();
    WebElement searchBox = driver.findElement(By.name("query_string"));
    searchBox.sendKeys("contacts");
    wb.RefreshThePage(driver);
    searchBox.sendKeys("contacts");
	driver.close();
	
}
}
