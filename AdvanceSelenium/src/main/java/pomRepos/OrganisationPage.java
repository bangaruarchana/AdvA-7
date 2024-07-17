package pomRepos;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class OrganisationPage {
 public OrganisationPage(WebDriver driver) {
	 PageFactory.initElements(driver, this);
 }
 @FindBy(linkText = "Organizations")
 private WebElement organisationLink;
 
 public WebElement getUserRadioButton() {
	return userRadioButton;
}
@FindBy(xpath ="//img[@src='themes/softed/images/btnL3Add.gif']")
 private WebElement createOrganisation;
 
 @FindBy(name ="notify_owner")
 private WebElement notifyownerCheckBox;
 
 @FindBy(name = "bill_street")
 private WebElement billingAddress;
 
 @FindBy(name = "email1")
 private WebElement emailTxtBox;
 
 @FindBy(name = "accountname")
 private WebElement orgName;
 
 @FindBy(xpath ="//input[@title='Save [Alt+S]']")
 private WebElement saveButton;
 
 @FindBy(name ="assigntype")
 private WebElement userRadioButton;

public WebElement getOrganisationLink() {
	return organisationLink;
}

public WebElement getCreateOrganisation() {
	return createOrganisation;
}

public WebElement getNotifyownerCheckBox() {
	return notifyownerCheckBox;
}

public WebElement getBillingAddress() {
	return billingAddress;
}

public WebElement getEmailTxtBox() {
	return emailTxtBox;
}

public WebElement getOrgName() {
	return orgName;
}

public WebElement getSaveButton() {
	return saveButton;
}
 
 
 
 
}
