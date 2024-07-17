package helper_Attributes;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Learning_DependsOnMethod {
@Test(priority = 1)
public void login() {
	//int i =1/0;
	Reporter.log("user has login to the app");
}
@Test(dependsOnMethods = "login",priority = 2)
public void addToCart() {
	Reporter.log("user has to added product into the cart");
}
@Test(dependsOnMethods = "login",priority = 3)
public void logout() {
	Reporter.log("user has to logout from app");
}
}
