package selenium_prgm;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Get_source {
	public static void main(String[] args) {
		
	
System.setProperty("WebDriver.edge.driver", "C:\\Users\\lenovo\\Downloads\\edgedriver_win64\\msedgedriver.exe");
WebDriver driver=new EdgeDriver();
driver.get("https://www.google.com");
String tit=driver.getPageSource();
System.out.println(tit);
}
}