package pomRepos;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class QuickCreatePage {
public void QuickCreate(WebDriver driver)
{
	PageFactory.initElements(driver,this);
}
public WebElement getQuickCreateButton() {
	return QuickCreateButton;
}

public WebElement getLeadsButton() {
	return LeadsButton;
}
@FindBy(id="qccombo")
private WebElement QuickCreateButton;

@FindBy(linkText ="Leads")
private WebElement LeadsButton;

}
