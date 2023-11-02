package uivalidation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UiComponentValidation {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	
		WebElement usernameInputField=driver.findElement(By.name("username"));
		System.out.println("is username input field visible: "+usernameInputField.isDisplayed());
		System.out.println("is username input field visible: "+usernameInputField.isEnabled());
		System.out.println("username input field default value- "+usernameInputField.getAttribute("placeholder"));
		
		WebElement passwordInputField=driver.findElement(By.name("password"));
		System.out.println("is password input field visible: "+passwordInputField.isDisplayed());
		System.out.println("is password input field visible: "+passwordInputField.isEnabled());
		System.out.println("password input field default value- "+passwordInputField.getAttribute("placeholder"));
	
		WebElement Forgotyourpassword=driver.findElement(By.className("orangehrm-login-forgot-header"));
		System.out.println("is forgot your password visible? "+Forgotyourpassword.isDisplayed());
		System.out.println("is Forgotyourpassword clickable? "+Forgotyourpassword.isEnabled());
		System.out.println("is Forgot your password by default selected? "+Forgotyourpassword.getText());
		
		WebElement loginButton =driver.findElement(By.className("orangehrm-login-button"));
		System.out.println("is login button visible: "+loginButton.isDisplayed());
		System.out.println("is login button clickable: "+loginButton.isEnabled());
		System.out.println("login button name-"+loginButton.getText());
		
		
	}

}
