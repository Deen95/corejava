package day0Openbrowsers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example2 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		String pageSource=driver.getPageSource();
		System.out.println("source code length: "+pageSource.length());
		
		//step1:identify username input field
		WebElement usernameInputField=driver.findElement(By.id("username"));
		//step2:perform required operation
		usernameInputField.sendKeys("admin");
		

		//step1:identify password input field
		WebElement passwordInputField=driver.findElement(By.name("pwd"));
		//step2:perform required operation
		passwordInputField.sendKeys("manager");
		
		WebElement loginButton=driver.findElement(By.id("loginButton"));
		loginButton.click();
		
	}

}
