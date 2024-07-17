package pomRepos;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OpportunitiesPage {
public OpportunitiesPage(WebDriver driver) {
	PageFactory.initElements(driver, this);
}
     @FindBy(linkText = "Opportunities")
     private WebElement OpportunitiesLink;
     
     @FindBy(linkText = "Create a Opportunity")
     private WebElement CreateOpportunitiesLink;
     
     @FindBy(name = "potentialname")
     private WebElement OpportunityNameTxtFld;
     
     @FindBy(id = "related_to_display")
     private WebElement RelatedToTxtFld;
     
     @FindBy(name = "sales_stage")
     private WebElement SalesStageDropDown;
     
     @FindBy(name = "button")
     private WebElement SaveBtn;
     
     @FindBy(xpath = "//img[@src='themes/softed/images/select.gif']")
     private WebElement LookupIcon;
     
     @FindBy(linkText = "Reebok")
     private WebElement RelatedOrgname;

	public WebElement getLookupIcon() {
		return LookupIcon;
	}

	public WebElement getRelatedOrgname() {
		return RelatedOrgname;
	}

	public WebElement getOpportunitiesLink() {
		return OpportunitiesLink;
	}

	public WebElement getCreateOpportunitiesLink() {
		return CreateOpportunitiesLink;
	}

	public WebElement getOpportunityNameTxtFld() {
		return OpportunityNameTxtFld;
	}

	public WebElement getRelatedToTxtFld() {
		return RelatedToTxtFld;
	}

	public WebElement getSalesStageDropDown() {
		return SalesStageDropDown;
	}

	public WebElement getSaveBtn() {
		return SaveBtn;
	}
     
     
     
     
     
     
     
     
}
