package Scripts_VTiger;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;
import genericlibrary.BaseClass;
import pomRepos.ContactsPage;
import pomRepos.LeadsPage;
import pomRepos.OpportunitiesPage;
import pomRepos.OrganisationPage;
public class Script4_Test extends BaseClass 
{
	@Test(groups = "Opportunities")
	public void script4() throws EncryptedDocumentException, IOException, InterruptedException {
		OpportunitiesPage op = new OpportunitiesPage(driver);
		op.getOpportunitiesLink().click();
		op.getCreateOpportunitiesLink().click();
		int ranNo = ja.getRandomNumber();
		op.getOpportunityNameTxtFld().sendKeys(um.getDatafromPropertyFile("opportunityName")+ranNo);
		Thread.sleep(2000);
		op.getSaveBtn().click();
		
		
		
	}
	

}
