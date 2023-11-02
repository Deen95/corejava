package utility;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumUtil {

	public static WebDriver setUp(String browserName, String url) {
		WebDriver driver=null;
		if(browserName.equalsIgnoreCase("chrome")) {
			driver=new ChromeDriver();
		}else if(browserName.equalsIgnoreCase("firefox"));{
		driver=new FirefoxDriver();
	}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get(url);
		return driver;
	}

}