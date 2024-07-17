package code;
import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import genericlibrary.ExcelUtil;
import genericlibrary.WebdriverUtil;
import pomRepos.LoginPage;
import pomRepos.OrganisationPage;
public class Script2UsingpomRepo {
public static void main(String[] args) throws IOException, InterruptedException {
	WebDriver driver = new ChromeDriver();
	ExcelUtil um = new ExcelUtil();
	WebdriverUtil wb = new WebdriverUtil();
	wb.MaximizeTheWindow(driver);
	wb.ImplicitlyWait(driver);
	driver.get(um.getDatafromPropertyFile("url"));
	LoginPage lp = new LoginPage(driver);
	lp.getUserTxtBox().sendKeys(um.getDatafromPropertyFile("username"));
	lp.getPswd().sendKeys(um.getDatafromPropertyFile("password"));
	lp.getLogin().click();
	OrganisationPage op = new OrganisationPage(driver);
	op.getOrganisationLink().click();
	op.getCreateOrganisation().click();
	op.getOrgName().sendKeys(um.getDatafromPropertyFile("organisation"));
	op.getBillingAddress().sendKeys(um.getDatafromPropertyFile("billingAdd"));
	op.getEmailTxtBox().sendKeys(um.getDatafromPropertyFile("email"));
	op.getUserRadioButton().click();
	Thread.sleep(2000);
	op.getNotifyownerCheckBox().click();
	Thread.sleep(2000);
	op.getSaveButton().click();
	Thread.sleep(2000);
	driver.close();
}
}
