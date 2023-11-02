package day0Openbrowsers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chrome_Vtiger {

	public static void main(String[] args) {
		WebDriver Driver=new ChromeDriver();
		Driver.get("https://demo.vtiger.com/vtigercrm/index.php");
		System.out.println("Current url : "+Driver.getCurrentUrl());
		System.out.println("title : "+Driver.getTitle());
		System.out.println("pageSource length: "+Driver.getPageSource().length());
		
		//step1 identify user name feild
		WebElement usernameInputField=Driver.findElement(By.id("username"));
		usernameInputField.clear();
		usernameInputField.sendKeys("admin");
		
		//step2 identify password field
		WebElement passwordInputField=Driver.findElement(By.id("password"));
		passwordInputField.clear();
		passwordInputField.sendKeys("admin");
		
		WebElement SignInButton=Driver.findElement(By.tagName("button"));
		SignInButton.click();
        
	} 

}
