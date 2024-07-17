package DDT;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class FetchingData_From_PropertyFile {
public static void main(String[] args) throws IOException {
	//step 1
	//create fileinputstream object
  FileInputStream fis = new FileInputStream("./src/test/resources/prop.properties");
  
  //step 2
  //create a property file object
	Properties p = new Properties();
	
	//step 3
	//load file
	p.load(fis);
	
	//step 4
	//fetching the data
	System.out.println(p.getProperty("url"));
	System.out.println(p.getProperty("username"));
	System.out.println(p.getProperty("password"));
	
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	//String Url = p.getProperty("url");
	//driver.get("Url");
	driver.get(p.getProperty("url"));
	driver.close();
}
}
