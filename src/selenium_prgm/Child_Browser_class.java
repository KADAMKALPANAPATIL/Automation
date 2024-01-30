package selenium_prgm;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Child_Browser_class {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
WebDriver driver=new ChromeDriver();
//click on continue with google
driver.get("https://www.Linkedin.com");
driver.findElement(By.xpath("//span[text()='Continue with Google']")).click();
//get window handles
Thread.sleep(4000);
Set<String> ids=driver.getWindowHandles();
//create object of array list
ArrayList<String>a=new ArrayList<String>(ids);
//get the window id
Thread.sleep(4000);
String cwid=a.get(2);
Thread.sleep(4000);
//switch to child browser 
driver.switchTo().window(cwid);
driver.findElement(By.xpath("//input[@name='identifier']")).sendKeys("kadamkalpanapatil@gmail.com");

	}

}
