package Test_NG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class time_out {
@Test(timeOut = 4000)
public void tc() {
Reporter.log( "Morning",true);	
}
}
