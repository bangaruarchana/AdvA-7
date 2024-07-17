package pomRepos;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogoutPage {
	public WebElement getAdministratorBox() {
		return AdministratorBox;
	}


	public WebElement getLogoutButon() {
		return LogoutButon;
	}


	public  LogoutPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//img[@src='themes/softed/images/user.PNG']")
    private WebElement AdministratorBox;
	
	
	@FindBy(linkText = "Sign Out")
	private WebElement LogoutButon;
	
	
}
