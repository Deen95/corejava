 package day2.sync;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ImplicitWait_actitimelogin_logout {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		 //implicit wait - Selenium 3.0
		//driver.manage().timeouts().implicitWait(30,TimeUnit.SECOND);
		//or
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://demo.actitime.com/login.do");
		
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		  
		String expectedHomepageTitle="actiTime-Enter Time-Track";
		         //explicit wait
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
	   // wait.until(ExpectedConditions.titleIs(expectedHomepageTitle));
				//or
		wait.until(ExpectedConditions.elementToBeClickable(By.id("logoutLink")));
		
		String actualHomepageTitle=driver.getTitle();
		System.out.println("Home page Actual Title: "+actualHomepageTitle);
		System.out.println("Home page Expected Title: "+expectedHomepageTitle);
		System.out.println("Is login sucessfully:"+actualHomepageTitle.equals(expectedHomepageTitle)); 
		driver.findElement(By.id("logoutLink")).click();
		
		String expectedLoginpageTitle="actiTime-Login";
		wait.until(ExpectedConditions.titleIs(expectedLoginpageTitle));
		String actualLoginpageTitle=driver.getTitle();
		System.out.println("is logout done sucessfully: "+actualLoginpageTitle.equals(expectedLoginpageTitle));
		driver.close();
	}

}
 