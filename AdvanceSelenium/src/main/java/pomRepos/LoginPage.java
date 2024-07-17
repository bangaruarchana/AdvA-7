package pomRepos;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class LoginPage {
public  LoginPage(WebDriver driver) {
	
	PageFactory.initElements(driver, this);
}
   @FindBy(name = "user_name")
   private WebElement userTxtBox;
   
   public WebElement getUserTxtBox() {
	return userTxtBox;
}

public WebElement getPswd() {
	return pswd;
}

public WebElement getLogin() {
	return login;
}
@FindBy(name = "user_password")
   private WebElement pswd;
   
   @FindBy(id = "submitButton")
   private WebElement login;
   
   @FindBy(linkText = "Read License")
   private WebElement text;
   
   @FindBy(xpath ="[src='include/images//Twitter.png']")
   private WebElement twiter;

public WebElement getText() {
	return text;
}

public WebElement getTwiter() {
	return twiter;
}
   
   
   
   
}
