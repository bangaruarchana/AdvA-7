package helper_Attributes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

import genericlibrary.WebdriverUtil;

public class Learning_invocationCount {
@Test(invocationCount =3,priority = 0)
public void launch() throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demowebshop.tricentis.com/");
	Thread.sleep(2000);
	driver.quit();
}
@Test(invocationCount = 2,priority = -1)
public void meesho() {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.meesho.com/");
	Reporter.log("testng",true);
	driver.quit();
}
@Test(invocationCount=2,priority = 1)
public void qtalk() {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://chat.qspiders.com/auth/login");
    driver.quit();
}
}
