package selenium_prgm;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Navigate {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
System.setProperty("WebDriver.edge.driver", "C:\\Users\\lenovo\\Downloads\\edgedriver_win64\\msedgedriver.exe");
WebDriver driver=new EdgeDriver();
//navigate method
driver.navigate().to("facebook");
Thread.sleep(4000);
//forward method 
driver.navigate().forward();
//back method
driver.navigate().back();
//refresh method 
driver.navigate().refresh();
	}

}
