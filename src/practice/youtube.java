package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class youtube {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("WebDriver.edge.driver", "C:\\Users\\lenovo\\Downloads\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.youtube.com");
		WebElement search=driver.findElement(By.xpath(" //input[@id='search']"));
		search.sendKeys("jeena laga hoon");
		search.submit();
		driver.findElement(By.xpath("//img[@class='yt-core-image--fill-parent-height yt-core-image--fill-parent-width yt-core-image yt-core-image--content-mode-scale-aspect-fill yt-core-image--loaded']")).click();
		
	}

}
