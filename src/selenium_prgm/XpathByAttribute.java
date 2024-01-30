package selenium_prgm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class XpathByAttribute {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		System.setProperty("WebDriver.edge.driver","C:\\Users\\lenovo\\Downloads\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.facebook.com");
		//create new account
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		//inspect firstname
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("yogitha");
		//inspect the surname
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("patil");
		//inspect the mobilenum
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("9676974120");
		//inspect the new password
		driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("123456789");
			}


}
