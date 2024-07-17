package Scripts_VTiger;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;
import genericlibrary.BaseClass;
import pomRepos.ContactsPage;
import pomRepos.LeadsPage;
import pomRepos.OrganisationPage;
public class Script3_Test extends BaseClass 
{
	@Test(groups = "leads")
	public void script3() throws EncryptedDocumentException, IOException, InterruptedException {
		LeadsPage lpg =  new LeadsPage(driver);
		lpg.getLeadslink().click();
		lpg.getCreatelink().click();
		int ranNo = ja.getRandomNumber();
		lpg.getLastnameTxtFld().sendKeys(um.getDatafromPropertyFile("lastName")+ranNo);
		lpg.getCompanynameTxtFld().sendKeys(um.getDatafromPropertyFile("company")+ranNo);
		lpg.getSaveBtn().click();
	}
	

}
