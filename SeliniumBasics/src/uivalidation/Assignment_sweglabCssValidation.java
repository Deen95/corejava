package uivalidation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_sweglabCssValidation {

	public static void main(String[] args) {
	        WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			
			driver.get("https://www.saucedemo.com");
			
			WebElement loginButton =driver.findElement(By.id("login-button"));
			System.out.println("is login button visible: "+loginButton.isDisplayed());
			System.out.println("is login button clickable: "+loginButton.isEnabled());
			 
	        WebElement ErrorMsg=driver.findElement(By.className("error-message-container"));
	        System.out.println("Is LoginButton is Visible: "+ErrorMsg.isDisplayed());
			
		
		    System.out.println("Login text size: "+loginButton.getCssValue("font-size"));
			System.out.println("Login text family: "+loginButton.getCssValue("font-family"));
			System.out.println("Login text color: "+loginButton.getCssValue("color"));
			System.out.println("Login button background color: "+loginButton.getCssValue("background-color"));
			

			driver.findElement(By.id("user-name")).sendKeys("standard_user");
			driver.findElement(By.id("login-button")).click();
			

			WebElement passwordInputField=driver.findElement(By.id("password"));
			Point ptpwd=passwordInputField.getLocation();
			int pwd_x=ptpwd.getX();
			int pwd_y=ptpwd.getY();
			System.out.println("pwd cord-x: "+pwd_x);
			System.out.println("pwd cord-y: "+pwd_y);
			
			WebElement errorMsg=driver.findElement(By.className("error-message-container"));
			Point ptError=errorMsg.getLocation();
			int error_x=ptError.getX();
			int error_y=ptError.getY();
			System.out.println("error cord-x: "+error_x);
			System.out.println("error cord-y: "+error_y);
			System.out.println("is error msg getting displayed below password field: "+(pwd_y<error_y));
	
			WebElement LoginButton=driver.findElement(By.id("login-button"));
			Point LogButpos=LoginButton.getLocation();
			int LogBut_x=LogButpos.getX();
			int LogBut_y=LogButpos.getY();
			System.out.println("LogButpos cord-x: "+LogBut_x);
			System.out.println("LogButpos cord-y: "+LogBut_y);
			System.out.println("LoginButton Getting Displayed Below Error Msg: "+(error_y<LogBut_y));
	}

}
