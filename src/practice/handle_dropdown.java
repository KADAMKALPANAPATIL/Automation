package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class handle_dropdown {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
System.setProperty("WebDriver.edge.driver","C:\\Users\\lenovo\\Downloads\\edgedriver_win64\\msedgedriver.exe");
WebDriver driver=new EdgeDriver();
driver.get("https://www.facebook.com");
//create new account
driver.findElement(By.xpath(" //a[text()='Create new account']")).click();
//inspect the day which we need to handle
Thread.sleep(4000);
 WebElement day=driver.findElement(By.xpath("//select[@id='day']"));
//select object of select class
 Thread.sleep(4000);
 Select s=new Select(day);
 Thread.sleep(5000);
 s.selectByVisibleText("27");
 //inspect the month 
 Thread.sleep(4000);
 WebElement month=driver.findElement(By.xpath(" //select[@id='month']"));
 //select object of select class
 Thread.sleep(5000);
 Select s1=new Select(month);
Thread.sleep(3000);
  s1.selectByVisibleText("Oct");
  //inspect the year
  Thread.sleep(2000);
  WebElement year=driver.findElement(By.xpath(" //select[@id='year']"));
  //select object of select class2002
  Thread.sleep(2000);
  Select s2=new Select(year);
  s2.selectByVisibleText("2002");

	}

}
