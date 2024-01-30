package practice;

import java.awt.Dimension;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class setsize_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stubSystem.setProperty("WebDriver.edge.driver", "C:\\Users\\lenovo\\Downloads\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.meesho.com");
		Dimension d=new Dimension(25, 40);
		driver.manage().window().setSize(null);
	}

}
