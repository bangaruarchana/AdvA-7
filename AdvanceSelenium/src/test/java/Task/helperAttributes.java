package Task;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class helperAttributes {
	@Test (priority = -1)
	public void logout() {
		Reporter.log("user has successfully logged out");
	}
  @Test (priority = 0)
  public void addCart() {
	  Reporter.log("user has able to add a product to the cart");
  }
  @Test (priority = 1)
  public void login() {
	  Reporter.log("user has to login in to the application");
  }
}
