package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class facebook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("WebDriver.edge.driver","C:\\Users\\lenovo\\Downloads\\edgedriver_win64\\msedgedriver.exe");
WebDriver driver=new EdgeDriver();
driver.get("https://www.facebook.com");
//create email
driver.findElement(By.id("email")).sendKeys("patil@gmail.com");
//password
driver.findElement(By.id("pass")).sendKeys("patil");
//login into the facebook
driver.findElement(By.linkText("Log in")).click();
	}

}
