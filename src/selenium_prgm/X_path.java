package selenium_prgm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class X_path {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("WebDriver.edge.driver","C:\\Users\\lenovo\\Downloads\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.instagram.com");
		//enter email
		driver.findElement(By.xpath(" //input[@name='username']")).sendKeys("kalpanapatil@gamil.com");
		//enter password
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("kadam123");
	}
	}


