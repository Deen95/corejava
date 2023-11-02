package day0Openbrowsers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chrome_OrangeHRM {

	public static void main(String[] args) {
		WebDriver Driver = new ChromeDriver();
		Driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		System.out.println(Driver.getTitle());
		System.out.println(Driver.getCurrentUrl());
		System.out.println(Driver.getPageSource());
		
		//step1 identify use name field
		WebElement usernameInputField = Driver.findElement(By.name("username"));
		usernameInputField.click();
		usernameInputField.sendKeys("admin");
		
		//step2 identify password  field
		WebElement passwordInputField = Driver.findElement(By.name("password"));
		passwordInputField.click();
		passwordInputField.sendKeys("admin");
		
		WebElement logInField = Driver.findElement(By.tagName("button"));
		logInField.click();
		
		
		
		
		
	}

}
