package selenium_prgm;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Set_position {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("WebDriver.edge.driver", "C:\\Users\\lenovo\\Downloads\\edgedriver_win64\\msedgedriver.exe" );
WebDriver driver=new EdgeDriver();
driver.get( "https://www.facebook.com");
Point p=new Point(30, 60);
driver.manage().window().setPosition(p);

	}

}
