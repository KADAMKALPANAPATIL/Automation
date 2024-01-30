package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class doubleclick_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("WebDriver.edge.driver", "C:\\Users\\lenovo\\Downloads\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.instagram.com");
		//movetoElement method
	WebElement	login = driver.findElement(By.xpath("//span[text()='Log in with Facebook']"));
	//double click method
	Actions q=new Actions(driver);
	q.moveToElement(login).doubleClick().perform();
	}
	}


