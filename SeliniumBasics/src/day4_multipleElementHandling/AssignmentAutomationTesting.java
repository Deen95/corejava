package day4_multipleElementHandling;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AssignmentAutomationTesting {

	public static void main(String[] args) {
		WebDriver driver=setup("chrome","https://demo.automationtesting.in/Register.html");
		List<WebElement> MenuBarList=driver.findElements(By.cssSelector(".navbar-nav>li>a"));
		System.out.println("MenuBar: "+MenuBarList.size());
		for(int i=0; i<MenuBarList.size();i++){
			System.out.println("MenuBarNames: "+MenuBarList.get(i).getText());
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
