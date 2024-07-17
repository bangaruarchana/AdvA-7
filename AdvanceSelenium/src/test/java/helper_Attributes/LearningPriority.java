package helper_Attributes;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class LearningPriority {
@Test(priority = 1)
public void logout() {
	Reporter.log("user has logged out",true);
}
@Test(priority = 3)
public void login() {
	Reporter.log("user has succesfully logged in",true);
}
@Test(priority = 2)
public void addToCart() {
	Reporter.log("user has added product to the cart",true);
}
}
