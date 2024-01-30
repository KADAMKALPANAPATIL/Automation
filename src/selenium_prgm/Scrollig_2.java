package selenium_prgm;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Scrollig_2 {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
WebDriver driver=new EdgeDriver();
driver.get("https://www.meesho.com");
JavascriptExecutor jse=(JavascriptExecutor)driver;
//scroll right side
jse.executeScript("window.scrollBy(2000,0);");
//scroll left side
Thread.sleep(5000);
jse.executeScript("window.scrollBy(-2000,0);");

	}

}
