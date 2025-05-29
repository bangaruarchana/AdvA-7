package Scripts_VTiger;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import genericlibrary.BaseClass;
import pomRepos.ProductsPage;
@Test
public class Script8_Test extends BaseClass {
public void Script8() throws EncryptedDocumentException, IOException {
   	 ProductsPage pp= new ProductsPage(driver);
	  pp.getProductLink().click();
	  pp.getCreatelink().click();
	  int ranNo =ja.getRandomNumber();
	  pp.getProductNameTxtBox().sendKeys(um.getDatafromPropertyFile("productName"));
	  pp.getSaveButton().click();
}
}
