package selenium_prgm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class IFrames {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
System.setProperty("WebDriver.edge.driver", "C:\\Users\\lenovo\\Downloads\\edgedriver_win64\\msedgedriver.exe");
WebDriver driver=new EdgeDriver();
driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_form_submit");
//switch the frame

driver.switchTo().frame("iframeResult");
//send the fname
driver.findElement(By.xpath("//input[@name='fname']")).clear();
driver.findElement(By.xpath("//input[@name='fname']")).sendKeys("kalpana");
//send the lname
driver.findElement(By.xpath("//input[@name='lname']")).clear();
driver.findElement(By.xpath(" //input[@name='lname']")).sendKeys("patil");
//submit the values
driver.findElement(By.xpath(" //input[@type='submit']")).click();
Thread.sleep(5000);
//switch the control of selenium from 2nd frame to main webpage
driver.switchTo().defaultContent();
//again move control sel from 2nd to main webpage
driver.switchTo().frame("iframeResult");
//get the text
 String txt=driver.findElement(By.xpath("//label[.='First name:']")).getText();
System.out.println(txt);
	}

}
