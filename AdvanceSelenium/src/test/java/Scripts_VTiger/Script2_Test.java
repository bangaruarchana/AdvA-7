package Scripts_VTiger;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;
import genericlibrary.BaseClass;
import pomRepos.ContactsPage;
import pomRepos.OrganisationPage;
public class Script2_Test extends BaseClass 
{
	@Test(groups = "contacts")
	public void script2() throws EncryptedDocumentException, IOException, InterruptedException {
		ContactsPage cp = new ContactsPage(driver);

		cp.getContactslink().click();
		cp.getCreateContactlink().click();
		int ranNo = ja.getRandomNumber();
		cp.getLastnameTxtFld().sendKeys(um.getDatafromPropertyFile("lastName")+ranNo);
		cp.getEmailTxtFld().sendKeys(um.getDatafromPropertyFile("emailId")+ranNo);
		cp.getDOBLookupIcon().click();
		cp.getMobileNoTxtFld().sendKeys(um.getDatafromPropertyFile("phoneNo")+ranNo);
		cp.getSaveBtn().click();
	}
	

}
