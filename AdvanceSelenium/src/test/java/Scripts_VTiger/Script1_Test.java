package Scripts_VTiger;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;
import genericlibrary.BaseClass;
import pomRepos.OrganisationPage;
public class Script1_Test extends BaseClass 
{
	@Test(groups = "organisation")
	public void script1() throws EncryptedDocumentException, IOException, InterruptedException {
		OrganisationPage op = new OrganisationPage(driver);
		op.getOrganisationLink().click();
		op.getCreateOrganisation().click();
		int ranNo = ja.getRandomNumber();
		op.getOrgName().sendKeys(um.getDatafromPropertyFile("organisation")+ranNo);		
		op.getEmailTxtBox().sendKeys(um.getDatafromPropertyFile("email"));
		Thread.sleep(2000);
		op.getBillingAddress().sendKeys(um.getDatafromPropertyFile("billingAdd"));
		op.getUserRadioButton().click();
		op.getNotifyownerCheckBox().click();
		Thread.sleep(2000);
		op.getSaveButton().click();
		Thread.sleep(2000);
	}
	

}
