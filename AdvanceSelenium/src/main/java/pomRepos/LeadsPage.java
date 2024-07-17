package pomRepos;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeadsPage {
	public LeadsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
		@FindBy(linkText = "Leads")
		private WebElement Leadslink;
		
		@FindBy(xpath ="//img[@src='themes/softed/images/btnL3Add.gif']")
		private WebElement createlink;
		
		@FindBy(name="lastname")
		private WebElement lastnameTxtFld;
		
		@FindBy(name = "company")
		private WebElement companynameTxtFld;
		
		@FindBy(name = "assigntype")
		private WebElement assignedToRadioBtn;
		
		@FindBy(name = "button")
		private WebElement saveBtn;

		public WebElement getLeadslink() {
			return Leadslink;
		}

		public WebElement getCreatelink() {
			return createlink;
		}

		public WebElement getLastnameTxtFld() {
			return lastnameTxtFld;
		}

		public WebElement getCompanynameTxtFld() {
			return companynameTxtFld;
		}

		public WebElement getAssignedToRadioBtn() {
			return assignedToRadioBtn;
		}

		public WebElement getSaveBtn() {
			return saveBtn;
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
}
