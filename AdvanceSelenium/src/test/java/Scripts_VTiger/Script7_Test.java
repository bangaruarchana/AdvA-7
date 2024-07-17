package Scripts_VTiger;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;
import genericlibrary.BaseClass;
import pomRepos.OrganisationPage;
public class Script7_Test extends BaseClass 
{
	@Test(groups = "organisation")
	public void script1() throws EncryptedDocumentException, IOException, InterruptedException {
		OrganisationPage op = new OrganisationPage(driver);
		op.getOrganisationLink().click();
		op.getCreateOrganisation().click();
		Thread.sleep(2000);
	}
	

}
