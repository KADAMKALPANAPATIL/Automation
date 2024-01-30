package selenium_prgm;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class robot_2 {

	public static void main(String[] args) throws AWTException, Throwable {
		// TODO Auto-generated method stub
WebDriver driver=new EdgeDriver();
driver.get("https://www.edureka.co");
//click on cancel btn
driver.findElement(By.xpath("//a[text()='Courses']")).click();
//robot class scroll down
Robot r=new Robot();
r.keyPress(KeyEvent.VK_PAGE_DOWN);
r.keyPress(KeyEvent.VK_PAGE_DOWN);
Thread.sleep(5000);
r.keyPress(KeyEvent.VK_PAGE_DOWN);
r.keyPress(KeyEvent.VK_PAGE_DOWN);
r.keyPress(KeyEvent.VK_PAGE_UP);
r.keyPress(KeyEvent.VK_PAGE_UP);
	}

}
