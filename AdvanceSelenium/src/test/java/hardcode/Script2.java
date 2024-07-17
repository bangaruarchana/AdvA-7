package hardcode;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script2 {
public static void main(String[] args) throws IOException {
	FileInputStream fis = new FileInputStream("./src/test/resources/commonData.properties");
	Properties p = new Properties();
	p.load(fis);
    String Url = p.getProperty("url");
	String UserName_TxtBox = p.getProperty("username");
	String Pwd_TxtBox = p.getProperty("password");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get(Url);
	driver.findElement(By.name("user_name")).sendKeys("UserName_TxtBox");
	driver.findElement(By.name("user_password")).sendKeys("Pwd_TxtBox");
	driver.findElement(By.id("submitButton")).click();
	
	
	
	
	
	
}
}