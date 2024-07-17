package hardcode;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import genericlibrary.ExcelUtil;
import genericlibrary.WebdriverUtil;
public class Script5 {
public static void main(String[] args) throws IOException {
	
	WebdriverUtil wb = new WebdriverUtil();
	ExcelUtil um = new ExcelUtil();
	WebDriver driver = new ChromeDriver();
	WebdriverUtil.MaximizeTheWindow(driver);
	wb.ImplicitlyWait(driver);
	driver.get(um.getDatafromPropertyFile("url"));
	driver.findElement(By.name("user_name")).sendKeys(um.getDatafromPropertyFile("username"));
	driver.findElement(By.name("user_password")).sendKeys(um.getDatafromPropertyFile("password"));
	driver.findElement(By.id("submitButton")).click();
	driver.findElement(By.xpath("img[src='themes/softed/images/user.PNG']"));
	driver.findElement(By.linkText("Sign Out")).click();
	driver.close();
	
	
	
}
}
