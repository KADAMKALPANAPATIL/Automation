package selenium_prgm;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Robot_class {

	public static void main(String[] args) throws AWTException {
		// TODO Auto-generated method stub
WebDriver driver=new EdgeDriver();
driver.get("http://tutorialsninja.com/demo/");
//inspect the search 
driver.findElement(By.name("search")).sendKeys("HP");
Robot robot=new Robot();
robot.keyPress(KeyEvent.VK_ENTER);
robot.keyRelease(KeyEvent.VK_ENTER);

	}

}
