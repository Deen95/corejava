package day4_multipleElementHandling;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AssignmentGSMArenaSamsungphonFinder {

	public static void main(String[] args) {
	WebDriver driver=setup("chrome","https://www.gsmarena.com/samsung-phones-9.php");
	List<WebElement> SamsungPhoneList = driver.findElements(By.cssSelector("#review-body>.makers>ul>li>a>*:nth-child(2)>span"));
	System.out.println("SamsungPhoneList Count: "+SamsungPhoneList.size());
	for(int i=0;i<SamsungPhoneList.size();i++) {
		System.out.println(SamsungPhoneList.get(i).getText());
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
