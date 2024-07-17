package genericlibrary;
import java.awt.Desktop.Action;
/**
 * @author Archana N
 */
import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
public class WebdriverUtil {
/**
 * this method is used to maximize the window
 * @param driver
 */
	public static void MaximizeTheWindow(WebDriver driver) {
		driver.manage().window().maximize();
	}
	/**
	 * this method is used to refresh the page
	 * @param driver
	 */
	public static void RefreshThePage(WebDriver driver) {
		driver.navigate().refresh();
	}
	/**
	 * this method is used to forward the page
	 * @param driver
	 */
	
	public static void ForwardThePage(WebDriver driver) {
		driver.navigate().forward();
	}
	/**
	 * this method is used for implicitly wait
	 * @param driver
	 */
	public  static void ImplicitlyWait(WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	private WebDriver driver;
	/**
	 * this method is used for explicit wait
	 * @param driver
	 * @param Element
	 */
	public void elementToBeClickWait(WebDriver driver, WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}
	/**
	 * this method is used to switch the frame using web element
	 * @param driver
	 * @param element
	 */
	public void SwitchToFrame(WebDriver driver,WebElement element) {
		driver.switchTo().frame(element);
}
	/**
	 * this method is used to switch back the driver control to main page 
	 * @param driver
	 */
	public void SwitchBackToParentPage(WebDriver driver) {
		driver.switchTo().parentFrame();
	}
	/**
	 * this method is used to select the dropdown by using value
	 * @param dropdown
	 * @param value
	 */
	public void SelectDropDwonByValue(WebElement dropdown,String value) {
		Select sel= new Select(dropdown);
		sel.selectByValue(value);
	}
	/**
	 * this method is used to select the dropdown by using visibleText
	 * @param dropdown
	 * @param visibleText
	 */
	public void SelectDropDownByVisibleText(WebElement dropdown,String visibleText) {
		Select sel = new Select(dropdown);
		sel.selectByVisibleText(visibleText);
	}
	/**
	 * this method is used to deselect the dropdown by using value
	 * @param dropdown
	 * @param value
	 */
	public void deselectDropDownByValue(WebElement dropdown,String value) {
		Select sel =new Select(dropdown);
		sel.deselectByValue(value);
	}
	 /**
	  * this method is used to deselct the dropdown by using visibleText
	  * @param dropdown
	  * @param visibleText
	  */
	public void deSelectDropDownByVisibleText(WebElement dropdown,String visibleText) {
		Select sel = new Select(dropdown);
		sel.deselectByVisibleText(visibleText);
	}
	/**
	 * this method is used to handle the alert popup
	 * @param driver
	 */
	public void acceptAlert(WebDriver driver) {
		driver.switchTo().alert().accept();
		}
	/**
	 * this is method is used to click on cancel button present in alert popoup
	 * @param driver
	 */
	public void dismissAlert(WebDriver driver) {
		driver.switchTo().alert().dismiss();
	}
	/**
	 * this method is used to click on webelement using actions class
	 * @param element
	 */
	public void clickOnWebElement(WebElement element) {
		Actions actions= new Actions(driver);
		actions.click(element).perform();
	}
	/**
	 * this method is used to double click on element
	 * @param element
	 */
	public void doubleClick(WebElement element) {
		Actions actions = new Actions(driver);
		actions.doubleClick(element).perform();
	}
	/**
	 * this method is usd to perform right click action
	 * @param element
	 */
	public void contextClick(WebElement element) {
		Actions actions = new Actions(driver);
		actions.contextClick(element).perform();
	}
	/**
	 * this method is used to scrollup window using javascript executor
	 * @param driver
	 */
	public void scrollUp(WebDriver driver) {
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,-500);");
	}
	/**
	 * this method is used to scrolldown window using javascript executor
	 * @param driver
	 */
	public void scrollDown(WebDriver driver) {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,500);");
	}
	public void closeBrowser(WebDriver driver) {
		driver.close();
	}
}
