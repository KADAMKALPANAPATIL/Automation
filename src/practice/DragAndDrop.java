package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
System.setProperty("WebDriver.edge.driver","C:\\Users\\lenovo\\Downloads\\edgedriver_win64\\msedgedriver.exe");
WebDriver driver=new EdgeDriver();
driver.get("https://jqueryui.com/resources/demos/droppable/default.html");
//inspect the source element
WebElement src=driver.findElement(By.xpath( "//div[@id='draggable']"));
//inspect the target element
Thread.sleep(2000);
WebElement trgt=driver.findElement(By.xpath("//div[@id='droppable']"));
//create actions class for drop and drag
Actions as=new Actions(driver);
as.dragAndDrop(src, trgt).perform();

	}

}
