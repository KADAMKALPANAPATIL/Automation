package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class instagram_2 {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
System.setProperty("WebDriver.edge.driver", "C:\\Users\\lenovo\\Downloads\\edgedriver_win64\\msedgedriver.exe");
WebDriver driver=new EdgeDriver();
driver.get("https://www.instagram.com");
//inspect username
driver.findElement(By.xpath("//input[@name='username']")).sendKeys("kalpana_patil");
//inspect password
driver.findElement(By.xpath(" //input[@name='password']")).sendKeys("patil123");
//login into the instagram
Thread.sleep(4000);
driver.findElement(By.xpath("(//div[@class='x9f619 xjbqb8w x78zum5 x168nmei x13lgxp2 x5pf9jr xo71vjh x1xmf6yo x1e56ztr x540dpk x1m39q7l x1n2onr6 x1plvlek xryxfnj x1c4vz4f x2lah0s xdt5ytf xqjyukv x1qjc9v5 x1oa3qoh x1nhvcw1'])[1]")).click();
	}
}
