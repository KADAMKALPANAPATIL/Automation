package selenium_prgm;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Dynamic_element_handling {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
System.setProperty("WebDriver.edge.driver", "C:\\Users\\lenovo\\Downloads\\edgedriver_win64\\msedgedriver.exe");
WebDriver driver=new EdgeDriver();
driver.get("https://www.flipkart.com");
//search for mobile under 20k
Thread.sleep(4000);
driver.findElement(By.xpath("//input[@name='q']")).sendKeys("mobile under 20000",Keys.ENTER);
String ele=driver.findElement(By.xpath("(//span[@class='_2_R_DZ']//span)[2]")).getText();
System.out.println(ele);
	}

}
