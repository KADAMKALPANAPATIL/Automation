package Test_NG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class depends_on_method {
@Test
public void login() {
	Reporter.log( "running login",true);
	Assert.fail();
}
@Test(dependsOnMethods = {"login"})
public void logout() {
	Reporter.log( "running logout",true);
}
}
