package TestNg_topics;

import java.io.IOException;

import org.junit.runners.Parameterized.Parameters;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Optional;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

import genericlibrary.ExcelUtil;
import genericlibrary.WebdriverUtil;

public class LearningCrossBrowserTesting {
	WebDriver driver = new ChromeDriver();
	WebdriverUtil wb = new WebdriverUtil();
	ExcelUtil um = new ExcelUtil();
	//@Parameters("browser")
	@Test
  public void launch(@Optional("edge")String bname) throws IOException {
	  if(bname.contains("chrome")) {
		  driver = new ChromeDriver();
		  wb.MaximizeTheWindow(driver);
		  driver.get(um.getDatafromPropertyFile("url")); 
	  }
	  else if(bname.contains("edge")) {
		  driver = new EdgeDriver();
		  wb.MaximizeTheWindow(driver);
		  driver.get(um.getDatafromPropertyFile("url"));
	  }
  }
}
