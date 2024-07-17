package DDT;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class FectchdataFromJson {
public static void main(String[] args) throws IOException, InterruptedException {
	File file = new File("./src/test/resources/jsonFile.json");
	
	ObjectMapper jsonData = new ObjectMapper();
	
    JsonNode data = jsonData.readTree(file);
    
    System.out.println(data.get("url").asText());
    System.out.println(data.get("username").asText());
    System.out.println(data.get("password").asText());
    
    WebDriver driver = new ChromeDriver();
    String Url = data.get("url").asText();
    driver.get(Url);
    driver.findElement(By.linkText("Log in")).click();
    driver.findElement(By.id("Email")).sendKeys("Archana");
    driver.findElement(By.id("Password")).sendKeys("ravinderlakshmi");
    driver.findElement(By.linkText("Log in")).click();
    Thread.sleep(2000);
    driver.close();
    
    
}
}
