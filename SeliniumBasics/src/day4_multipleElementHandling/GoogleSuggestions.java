package day4_multipleElementHandling;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GoogleSuggestions {
	
	public static WebDriver setUp(String browserName,String url) {
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
	
	public static void main(String[] args) {
		WebDriver driver=setUp("chrome","https://www.google.com");
		driver.findElement(By.name("q")).sendKeys("Selenium");
		//identify suggestion
		List<WebElement> suggList=driver.findElements(By.cssSelector("ul.G43f7e>li>div>*:nth-child(2)>*:first-child>*:first-child>span"));
		
		int suggCount=suggList.size();
		System.out.println("is Suggestion count 10: "+(suggCount==10));
		
		for(int i=0;i<suggCount;i++) {
			//below line will help you to avoid"StateElementRefrenceException
			suggList=driver.findElements(By.cssSelector("ul.G43f7e>li>div>*:nth-child(2)>*:first-child>*:first-child>span"));
			
			WebElement element=suggList.get(i);
			String suggestion=element.getText();
			if(suggestion.contains("selenium")) {
				System.out.println("Suggesion "+i+" matching");
			}else {
				System.out.println("Suggestion "+i+" +not matching");
				
			}
		}
		

	}

}
