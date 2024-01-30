package Test_NG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class enabled {
@Test(enabled = true)
public void tc() {
	Reporter.log( "hello...",true);
}
}
