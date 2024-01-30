package Test_NG;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class Annotations {
@BeforeSuite
public void as() {
	Reporter.log("before class",true);
}
@BeforeTest
public void as1() {
	Reporter.log("before class",true);
}
@BeforeClass
public void bs() {
	Reporter.log("before test",true);
}
@BeforeMethod
public void bm() {
Reporter.log("before method",true);

}
@Test
public void verifyuserid() {
	Reporter.log("running verify",true);
}
@AfterSuite
public void As() {
	Reporter.log("after suit",true);
}
@AfterMethod
public void Av() {
	Reporter.log("after method",true);
}
@AfterClass
public void Ac() {
	Reporter.log("after class",true);
}
@AfterTest
public void At() {
	Reporter.log("after test",true);
}
@AfterSuite
public void AS1() {
	Reporter.log("after suit",true);
}
@AfterMethod
public void AM1() {
	Reporter.log("after method",true);
}
@AfterClass
public void AC1() {
	Reporter.log("after class",true);
}
@AfterTest
public void AT1() {
	Reporter.log("after test",true);
}
@AfterSuite
public void As1() {
	Reporter.log("after suit",true);
}
}
