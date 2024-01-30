package selenium_prgm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Snapchat {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
System.setProperty("WebDriver.edge.driver", "C:\\Users\\lenovo\\Downloads\\edgedriver_win64\\msedgedriver.exe");
WebDriver driver=new EdgeDriver();
driver.get("https://www.snapchat.com");
//click on chat
driver.findElement(By.xpath("(//span[text()='Chat'])[2]")).click();
//create user name
Thread.sleep(4000);
driver.findElement(By.xpath("//div[@class='form-group']")).sendKeys("patilkalpana@gamil.com");
	}

}
