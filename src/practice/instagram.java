package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class instagram {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
System.setProperty("WebDriver.edge.driver","C:\\Users\\lenovo\\Downloads\\edgedriver_win64\\msedgedriver.exe");
WebDriver driver=new EdgeDriver();
driver .get("https://www.instagram.com");
Thread.sleep(3000);
//create email
driver.findElement(By.xpath(" //input[@class='_aa4b _add6 _ac4d _ap35']")).sendKeys("patilkalpana@gmail.com");
//password
Thread.sleep(4000);
driver.findElement(By.xpath("//input[@name='password']")).sendKeys("patil123");
	}

}
