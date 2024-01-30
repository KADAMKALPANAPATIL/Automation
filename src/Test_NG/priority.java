package Test_NG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class priority {
@Test(priority = 3)
public void tc1() {
	Reporter.log("cab",true);
}
@Test(priority = 2)
public void tc2() {
	Reporter.log( "bac",true);
}
@Test(priority = 1)
public void tc3() {
	Reporter.log( "abc",true);
}
@Test(priority = 0)
public void tc4() {
	Reporter.log( "sri",true);
}
@Test(priority = -1)
public void tc5() {
	Reporter.log( "ram",true);
}
}
