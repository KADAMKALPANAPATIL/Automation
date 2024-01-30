package selenium_prgm;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Get {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("WebDriver.edge.driver", "C:\\Users\\lenovo\\Downloads\\edgedriver_win64\\msedgedriver.exe");
WebDriver driver=new EdgeDriver();
//get method
driver.get("https://www.google.com");
	}

}
