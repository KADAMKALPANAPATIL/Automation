package practice;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class setposition {

	public static void main(String[] args) {
		// TODO Auto-generated method stubSystem.setProperty("WebDriver.edge.driver","C:\\Users\\lenovo\\Downloads\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.hotstar.com");
		Point p=new Point(400, 200);
		//set application position
		driver.manage().window().setPosition(p);
	}

}
