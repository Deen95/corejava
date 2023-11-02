package day2.sync;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OrangeHrmExplicitWait {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		//once you define implicite wait,after this statement each element which are getting identified using
		//driver instance will get 0-30 sec for identification
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		System.out.println("current URL : "+driver.getCurrentUrl());
		System.out.println("Actual title : "+driver.getTitle());
		
		driver.findElement(By.name("username")).sendKeys("Admin");//0-30sec
        driver.findElement(By.name("password")).sendKeys("admin123");//0-30sec
        driver.findElement(By.className("orangehrm-login-button")).click();//0-30sec
        
        String expectedHomepageTitle= "OrangeHRM";
		System.out.println("expected home page URL : "+ expectedHomepageTitle);
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		//wait.until(ExpectedConditions.titleIs(expectedHomepageTitle));
		//or
		wait.until(ExpectedConditions.elementToBeClickable(By.className("oxd-input")));//search
		
		String actualHomeTitle=driver.getTitle();
		System.out.println("actual home page title : "+actualHomeTitle);
		System.out.println("Is log in successful: "+ expectedHomepageTitle.equals(actualHomeTitle));
        driver.findElement(By.className("oxd-userdropdown-name")).click();
        driver.findElement(By.linkText("Logout")).click();
       
        String expectedLoginpageTitle="OrangeHRM";
       
        wait.until(ExpectedConditions.titleIs(expectedLoginpageTitle));
        String actualLoginpageTitle=driver.getTitle();
        System.out.println("Is logout done successfully: "+actualLoginpageTitle.equals(expectedLoginpageTitle));
       
	}

}
