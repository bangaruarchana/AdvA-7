package Scripts_VTiger;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;
import genericlibrary.BaseClass;
import pomRepos.OrganisationPage;
import pomRepos.TroubleTicketpage;
public class Script5_Test extends BaseClass 
{
	@Test
	public void script5() throws EncryptedDocumentException, IOException, InterruptedException {
		TroubleTicketpage tt = new TroubleTicketpage(driver);
		tt.getTroubleTicketLink().click();
		tt.getCreateATicketlink().click();
		int ranNo = ja.getRandomNumber();
		tt.getTitleBox().sendKeys(um.getDatafromPropertyFile("TicketTitle")+ranNo);
		tt.getSaveBtn().click();
	}
	

}
