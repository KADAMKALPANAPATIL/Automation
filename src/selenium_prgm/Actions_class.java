package selenium_prgm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions_class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("WebDriver.edge.driver", "C:\\Users\\lenovo\\Downloads\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.google.com");
		//movetoElement method
		WebElement about=driver.findElement(By.xpath("//a[text()='About']"));
		//create object of action class
	Actions a=new Actions(driver);
		//move cursor to about
	a.moveToElement(about).perform();
		
	}

}
