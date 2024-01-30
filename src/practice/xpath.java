package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class xpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("WebDriver.edge.driver","C:\\Users\\lenovo\\Downloads\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.facebook.com");
		//enter email
		driver.findElement(By.xpath(" //input[@id='email']")).sendKeys("kalpanapatil@gamil.com");
		//enter password
		driver.findElement(By.xpath("//div[@id='passContainer']")).sendKeys("kadam123");
	}

}
