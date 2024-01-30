package selenium_prgm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Customized_LB {
public static void main(String[] args) {
	System.setProperty("WebDriver.edge.driver", "C:\\Users\\lenovo\\Downloads\\edgedriver_win64\\msedgedriver.exe");
	WebDriver driver=new EdgeDriver();
	driver.get("https://www.facebook.com");
	//inspect create new button it is not click able
	driver.findElement(By.xpath("(//[@role='button])[2]")).click();
	//select month(lb)
	WebElement month=driver.findElement(By.xpath("//select[@id='month']"));
}
}