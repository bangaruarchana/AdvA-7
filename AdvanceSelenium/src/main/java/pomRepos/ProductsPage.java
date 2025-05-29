package pomRepos;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductsPage {
	public ProductsPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	@FindBy(linkText = "Products")
	private WebElement ProductLink;
	
	public WebElement getProductLink() {
		return ProductLink;
	}

	public WebElement getCreatelink() {
		return Createlink;
	}
	 @FindBy(xpath = "Create Product...")
	 public WebElement productsPlusIcon;
	 
	public WebElement getProductsPlusIcon() {
		return productsPlusIcon;
	}

	public WebElement getProductNameTxtBox() {
		return ProductNameTxtBox;
	}

	public WebElement getSaveButton() {
		return SaveButton;
	}
	@FindBy(linkText = "Create a Product")
	private WebElement Createlink;
	
	@FindBy(name="productname")
	private WebElement ProductNameTxtBox;
	
	@FindBy(name="button")
	private WebElement SaveButton;
	

		
	
	

}
