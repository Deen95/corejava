package day0Openbrowsers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1 {

	public static void main(String[] args) {
	WebDriver Driver=new ChromeDriver()	;
	
	Driver.get("https://demo.actitime.com/login.do");
	Driver.getTitle();
	Driver.getTitle().length();
	System.out.println("Title of page: "+Driver.getTitle());
	System.out.println("Title length: "+Driver.getTitle().length());
	
	String CurrentURL = Driver.getCurrentUrl();
	System.out.println("Current URL: "+Driver.getCurrentUrl());
	String ExpectedURL="https://demo.actitime.com/login.do";
	System.out.println("Verify URL & Check correct page is Opened or Not: "+CurrentURL.equals(ExpectedURL));
	Driver.getPageSource();
	System.out.println("pageSource Length: "+Driver.getPageSource().length());
	
	WebElement usernameInputField=Driver.findElement(By.id("username"));
	usernameInputField.sendKeys("admin");
	
	WebElement passwordInputField=Driver.findElement(By.name("pwd"));
	passwordInputField.sendKeys("manager");
	
	WebElement inputLoginButton=Driver.findElement(By.id("loginButton"));
	inputLoginButton.click();
//	Driver.close();

	}

}
