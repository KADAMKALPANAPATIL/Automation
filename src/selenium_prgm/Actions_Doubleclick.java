package selenium_prgm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions_Doubleclick {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("WebDriver.edge.driver", "C:\\Users\\lenovo\\Downloads\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.snapchat.com");
		//movetoElement method
	WebElement	lense = driver.findElement(By.xpath(" //span[text()='Lenses']"));
	//double click method
	Actions q=new Actions(driver);
	q.moveToElement(lense).doubleClick().perform();
	}
	}


