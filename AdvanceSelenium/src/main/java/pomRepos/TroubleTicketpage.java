package pomRepos;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TroubleTicketpage {
	public   TroubleTicketpage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(linkText = "Trouble Tickets")
	private WebElement TroubleTicketLink;
	
	@FindBy(xpath = "//img[@src='themes/softed/images/btnL3Add.gif']")
	private WebElement CreateATicketlink;
	
	@FindBy(name = "ticket_title")
	private WebElement TitleBox;
	
	@FindBy(name = "button")
	private WebElement SaveBtn;

	public WebElement getTroubleTicketLink() {
		return TroubleTicketLink;
	}

	public WebElement getCreateATicketlink() {
		return CreateATicketlink;
	}

	public WebElement getTitleBox() {
		return TitleBox;
	}

	public WebElement getSaveBtn() {
		return SaveBtn;
	}
	
	
		
	
}
