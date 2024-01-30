package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class xpath_contains {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("WebDriver.edge.driver","C:\\Users\\lenovo\\Downloads\\edgedriver_win64\\msedgedriver.exe");
WebDriver driver=new EdgeDriver();
driver.get("https://www.facebook.com");
//xpath contains
driver.findElement(By.xpath("//a[contains(text(),'Create new account')]")).click();


	}

}
