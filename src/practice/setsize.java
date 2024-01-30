package practice;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class setsize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("WebDriver.edge.driver","C:\\Users\\lenovo\\Downloads\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.meesho.com");
		Dimension d=new Dimension(100, 100);
		//set the application size
		driver.manage().window().setSize(d);
	}

}
