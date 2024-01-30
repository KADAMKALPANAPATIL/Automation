package Test_NG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class invocation_count {
@Test(invocationCount = 10)
public void tc() {
	Reporter.log("HELLO....KALPANA PATIL",true);
}
}
