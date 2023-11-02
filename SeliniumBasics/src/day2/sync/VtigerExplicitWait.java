package day2.sync;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class VtigerExplicitWait {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://demo.vtiger.com/vtigercrm/index.php");
		
		System.out.println("Home page title: "+driver.getTitle());
		System.out.println("Home page URL: "+driver.getCurrentUrl());
		
		WebElement usernameInputField=driver.findElement(By.id("username"));
		usernameInputField.clear();
		usernameInputField.sendKeys("admin");
		
		WebElement passwordInputField=driver.findElement(By.name("password"));
		passwordInputField.clear();
		passwordInputField.sendKeys("admin");
		
		driver.findElement(By.className("button")).click();
		
		String expectedHomepageTitle="Dashboard";
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
		wait.until(ExpectedConditions.elementToBeClickable(By.className("fa-user")));//profile
		
		String actualHomepageTitle=driver.getTitle();
		System.out.println("Is login successfull: "+actualHomepageTitle.equals(expectedHomepageTitle));
		
		System.out.println("page title after logging in: "+driver.getTitle());
		System.out.println("page URL after logging in: "+driver.getCurrentUrl());
		
		driver.findElement(By.className("fa-user")).click();
		driver.findElement(By.linkText("Sign Out")).click();
		String expectedHomepageTitle2="vtiger";
		WebDriverWait wait2=new WebDriverWait(driver,Duration.ofSeconds(20));
		wait2.until(ExpectedConditions.elementToBeClickable(By.className("buttonBlue")));
		
	}

}
