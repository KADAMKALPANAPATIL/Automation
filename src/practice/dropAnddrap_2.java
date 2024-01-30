package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class dropAnddrap_2 {

	public static void main(String[] args)throws Throwable {
		// TODO Auto-generated method stub
		System.setProperty("WebDriver.edge.driver", "C:\\Users\\lenovo\\Downloads\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.get("https://jqueryui.com/resources/demos/droppable/default.html");
		//inspect source element
		WebElement Srcele=driver.findElement(By.id("draggable"));
		//inspect target element
		Thread.sleep(3000);
		WebElement tarele=driver.findElement(By.id("droppable"));
		// create object of actions class
		Actions q=new Actions(driver);
		q.dragAndDrop(Srcele, tarele).perform();
	}

}
