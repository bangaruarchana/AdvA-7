package pomRepos;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class ContactsPage {
	public ContactsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(linkText = "Contacts")
	private WebElement Contactslink;
	
	@FindBy( xpath ="//img[@src='themes/softed/images/btnL3Add.gif']")
	private WebElement CreateContactlink;
	
	@FindBy(name = "lastname")
	private WebElement lastnameTxtFld;
	
	@FindBy(name = "button")
	private WebElement SaveBtn;
	
	@FindBy(name = "email")
	private WebElement EmailTxtFld;
	
	@FindBy(name = "birthday")
	private WebElement DOBTxtFld;
	
	@FindBy(id = "jscal_trigger_birthday")
	private WebElement DOBLookupIcon;
	
	public WebElement getDOBLookupIcon() {
		return DOBLookupIcon;
	}
	@FindBy(name = "mobile")
	private WebElement MobileNoTxtFld;

	public WebElement getContactslink() {
		return Contactslink;
	}

	public WebElement getCreateContactlink() {
		return CreateContactlink;
	}

	public WebElement getLastnameTxtFld() {
		return lastnameTxtFld;
	}

	public WebElement getSaveBtn() {
		return SaveBtn;
	}

	public WebElement getEmailTxtFld() {
		return EmailTxtFld;
	}

	public WebElement getDOBTxtFld() {
		return DOBTxtFld;
	}

	public WebElement getMobileNoTxtFld() {
		return MobileNoTxtFld;
	}
	
	
	
	
}
