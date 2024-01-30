package Popups;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.TargetLocator;
import org.openqa.selenium.edge.EdgeDriver;

public class Alert_popup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("WebDriver.edge.driver", "C:\\Users\\lenovo\\Downloads\\edgedriver_win64\\msedgedriver.exe");
WebDriver driver=new EdgeDriver();
driver.get("https://demo.guru99.com/test/delete_customer.php");
//give customer id
driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("0909");
//click on submit btn
driver.findElement(By.xpath("//input[@name='submit']")).click();
//move the control selenium from webpage to particular popup
Alert alt=driver.switchTo().alert();
//click on ok btn
//alt.accept();

//click on cancel
//alt.dismiss();

//get the text which is present on alert popup
String text=alt.getText();
System.out.println(text);
		System.out.println("hello");
	}

}
