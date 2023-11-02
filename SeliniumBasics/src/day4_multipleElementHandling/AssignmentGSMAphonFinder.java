package day4_multipleElementHandling;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AssignmentGSMAphonFinder {

	public static void main(String[] args) {
		WebDriver driver=setup("Chrome","https://www.gsmarena.com/");
		List<WebElement> PhoneFinderList = driver.findElements(By.cssSelector("#body>*:nth-child(2)>.brandmenu-v2>ul>li>a"));
        System.out.println("PhoneFinder Brand Count: "+PhoneFinderList.size());
        for(int i=0;i<PhoneFinderList.size();i++){
        	System.out.println(PhoneFinderList.get(i).getText());
        }
	}

	private static WebDriver setup(String browserName, String url) {
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
