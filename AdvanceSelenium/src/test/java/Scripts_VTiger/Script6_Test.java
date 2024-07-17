package Scripts_VTiger;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;
import genericlibrary.BaseClass;
import pomRepos.CampaignsPage;
import pomRepos.MoreDropDown;
import pomRepos.OrganisationPage;
import pomRepos.TroubleTicketpage;
public class Script6_Test extends BaseClass 
{
	@Test(groups = "Opportunities")
	public void script5() throws EncryptedDocumentException, IOException, InterruptedException {
		MoreDropDown md = new MoreDropDown(driver);
		md.getMoreDropDown().click();
	    CampaignsPage cp = new CampaignsPage();	
	   cp.getCampaignlink().click();
	   cp.getCreatecamapignicon().click();
	   int ranNo = ja.getRandomNumber();
	   cp.getCampaignNameTxtBox().sendKeys(um.getDatafromPropertyFile("campaignName")+ranNo);
	   cp.getNumberSentTxtBox().sendKeys(um.getDatafromPropertyFile("numbersent"));
	   cp.getSaveBtn().click();
	
	}
	

}
