package selenium_prgm;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Scrollig {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
WebDriver driver=new EdgeDriver();
driver.get("https://www.amazon.com");
//click on Pop-up
//TypeCasting move from WebDriver to JavaScriptexecutor
JavascriptExecutor jse=(JavascriptExecutor)driver;
//scrolling down
jse.executeScript("window.scrollBy(0,2000);");
//scrolling up
Thread.sleep(5000);
jse.executeScript("window.scrollBy(0,-2000);");

	}

}
