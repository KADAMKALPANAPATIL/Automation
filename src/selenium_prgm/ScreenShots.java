package selenium_prgm;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import com.google.common.io.Files;

public class ScreenShots {
public static void main(String[] args) throws IOException {
WebDriver driver=new EdgeDriver();
driver.get("https://www.facebook.com/");
//move the control of selenium from WebDriver(I) to TakeScreenShot(I)
TakesScreenshot ts=(TakesScreenshot) driver;
File src=ts.getScreenshotAs(OutputType.FILE);
File trg=new File("C:\\Users\\lenovo\\Desktop\\sreenshots\\A.png");
Files.copy(src,trg);
	}

}
