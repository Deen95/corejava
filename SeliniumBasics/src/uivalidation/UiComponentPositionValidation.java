package uivalidation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UiComponentPositionValidation {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.findElement(By.name("username")).sendKeys("Admin");
		
		driver.findElement(By.className("orangehrm-login-button")).click();
		
		WebElement passwordInputField=driver.findElement(By.name("password"));
		Point ptpwd=passwordInputField.getLocation();
		int pwd_x=ptpwd.getX();
		int pwd_y=ptpwd.getY();
		System.out.println("pwd cord-x: "+pwd_x);
		System.out.println("pwd cord-y: "+pwd_y);
		WebElement errorMsg=driver.findElement(By.className("oxd-input-field-error-message"));
		Point ptError=errorMsg.getLocation();
		int error_x=ptError.getX();
		int error_y=ptError.getY();
		System.out.println("error cord-x: "+error_x);
		System.out.println("error cord-y: "+error_y);
		System.out.println("is error msg getting displayed below password field: "+(pwd_y<error_y));
	}

}
