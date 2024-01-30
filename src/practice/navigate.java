package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class navigate {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		System.setProperty("WebDriver.edge.driver","C:\\Users\\lenovo\\Downloads\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		//navigate method
		driver.navigate().to("google");
		Thread.sleep(2000);
		driver.navigate().to("amazon");
		//back method
		driver.navigate().back();
		//refresh method
		driver.navigate().refresh();
		//forward method
		driver.navigate().forward();
		Thread.sleep(5000);

}
}