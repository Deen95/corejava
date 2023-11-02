package day2.sync;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginIntoOrangeHrm {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		//once you define implicite wait,after this statement each element which are getting identified using
		//driver instance will get 0-30 sec for identification
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
        WebElement usernameInputField=driver.findElement(By.name("username"));
        usernameInputField.sendKeys("Admin");
        
        driver.findElement(By.name("password")).sendKeys("admin123");
        
        driver.findElement(By.className("orangehrm-login-button")).click();
	}

}
