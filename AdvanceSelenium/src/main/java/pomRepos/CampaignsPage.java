package pomRepos;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CampaignsPage {
   public  void CampaignPage(WebDriver driver) {
	   PageFactory.initElements(driver, this);
   }
   
   
 
   
   @FindBy(id ="more")
   private WebElement campaignlink;
   
   @FindBy(xpath = "//img[@src='themes/softed/images/btnL3Add.gif']")
   private WebElement createcamapignicon;
   
   @FindBy(name = "campaignname")
   private WebElement CampaignNameTxtBox;
   
   @FindBy(name = "numsent")
   private WebElement NumberSentTxtBox;
   
   @FindBy(name = "button")
   private WebElement saveBtn;
 


public WebElement getCampaignlink() {
	return campaignlink;
}

public WebElement getCreatecamapignicon() {
	return createcamapignicon;
}

public WebElement getCampaignNameTxtBox() {
	return CampaignNameTxtBox;
}

public WebElement getNumberSentTxtBox() {
	return NumberSentTxtBox;
}

public WebElement getSaveBtn() {
	return saveBtn;
}
}
 
 