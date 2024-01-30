package selenium_prgm;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Get_current_src {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("WebDriver.edge.driver","C:\\Users\\lenovo\\Downloads\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.facebook.com");
		String explurl="www.mostar.com";
		String acturl=driver.getCurrentUrl();
		System.out.println("acturl");
	}

}
