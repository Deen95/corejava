package Dropdownhandling;

import java.sql.Driver;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActitimeDropdown_handling {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://demo.actitime.com/login.do");
		
		System.out.println("Login with Administrator Credentials");
		driver.findElement(By.id("username")).clear();
		WebElement usernameInput=driver.findElement(By.cssSelector("#demoCredentials>tbody>*:first-child>*:nth-child(2)>b"));
		driver.findElement(By.id("username")).sendKeys(usernameInput.getText());
		
		driver.findElement(By.name("pwd")).clear();
		WebElement passwordInput=driver.findElement(By.cssSelector("#demoCredentials>tbody>*:nth-child(2)>*:first-child>b"));
		driver.findElement(By.name("pwd")).sendKeys(passwordInput.getText());
		
		driver.findElement(By.id("loginButton")).click();
		
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("logoutLink")));
		
		String ExpectedHomepageTitle="actiTime-Enter Time-Track";
		String ActualHomepageTitle=driver.getTitle();
		System.out.println("ActualHomepageTitle: "+driver.getTitle());
		System.out.println("Is login successful: "+ActualHomepageTitle.equals(ExpectedHomepageTitle));
		
	    driver.findElement(By.id("logoutLink")).click();
	    
	    String ExpectedLoginpageTitle="actiTime-Login";
		String ActualLoginpageTitle=driver.getTitle();
		System.out.println("ActualLoginpageTitle: "+ActualLoginpageTitle);
		System.out.println("Is login successful: "+ActualLoginpageTitle.equals(ExpectedHomepageTitle));
		
	   WebDriverWait wait2=new WebDriverWait(driver,Duration.ofSeconds(30));
	   wait.until(ExpectedConditions.elementToBeClickable(By.id("loginButton")));
	   System.out.println("**************************************************************************************");
	   
	   System.out.println("Login with Regular User Credentials");
	   
	   driver.findElement(By.id("username")).clear();
		WebElement regularuser=driver.findElement(By.cssSelector("#demoCredentials>*:first-child>*:nth-child(3)>*:nth-child(2)>b"));
		driver.findElement(By.id("username")).sendKeys(regularuser.getText());
		
		driver.findElement(By.name("pwd")).clear();
		WebElement regularuserPass=driver.findElement(By.cssSelector("#demoCredentials>*:first-child>*:nth-child(4)>*:first-child>b"));
		driver.findElement(By.name("pwd")).sendKeys(regularuserPass.getText());
		
		driver.findElement(By.id("loginButton")).click();
		
		WebDriverWait wait3=new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("logoutLink")));
		
		String ExpectedHomepageTitle1="actiTime-Enter Time-Track";
		String ActualHomepageTitle1=driver.getTitle();
		System.out.println("ActualHomepageTitle: "+driver.getTitle());
		System.out.println("Is login successful: "+ActualHomepageTitle1.equals(ExpectedHomepageTitle1));
		
        driver.findElement(By.id("logoutLink")).click();
        
        String ExpectedLoginpageTitle1="actiTime-Login";
		String ActualLoginpageTitle1=driver.getTitle();
		System.out.println("ActualLoginpageTitle1: "+ActualLoginpageTitle);
		System.out.println("Is logout successful1: "+ActualLoginpageTitle1.equals(ExpectedHomepageTitle1));
        
        
	    
	    
	    
				
	}

}
