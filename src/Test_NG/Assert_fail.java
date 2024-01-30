package Test_NG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Assert_fail {
@Test
public void tc1() {
	Reporter.log( "testcase",true);
	Assert.fail();//it is used fail tc intentionally
}
}
