package day2.sync;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BrowserOps_actitimelogin_logout2 {

	public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
	//to maximize browser
	driver.manage().window().maximize();
	
	//to minimize use setSize
	driver.manage().window().setSize(new Dimension(200,300));
	
	//to maximize browser
	driver.manage().window().maximize();
	
	driver.get("https://demo.actitime.com/login.do");
	
	driver.findElement(By.id("username")).sendKeys("admin");
	driver.findElement(By.name("pwd")).sendKeys("manager");
	driver.findElement(By.id("loginButton")).click();

	String expectedHomepageTitle="actiTIME-Enter Time-Track";
	
	//explicit wait
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
//	wait.until(ExpectedConditions.titleIs(expectedHomepageTitle));
	//or
	wait.until(ExpectedConditions.elementToBeClickable(By.id("logoutLink")));
	
	String actualHomepageTitle=driver.getTitle();
	System.out.println("Home page Actual Title: "+actualHomepageTitle);
	System.out.println("Home page Expected Title: "+expectedHomepageTitle);
	System.out.println("Is login successfull: "+actualHomepageTitle.equals(expectedHomepageTitle));
	
	//click on report tab
	driver.findElement(By.id("container_reports")).click();
	//to come back to home page
	driver.navigate().back();
	//again goto reports page
	driver.navigate().forward();
	//to refress page
	driver.navigate().refresh();
	
	driver.findElement(By.id("logoutlink")).click();
	
	String expectedLoginpageTitle="actiTIME-Login";
	wait.until(ExpectedConditions.titleIs(expectedLoginpageTitle));
	String actualLoginpageTitle=driver.getTitle();
	System.out.println("is logout done successfully: "+actualLoginpageTitle.equals(expectedLoginpageTitle));
	
	//to move to different URL
	driver.navigate().to("https://www.google.com");
//	driver.close();

	
	}

}
