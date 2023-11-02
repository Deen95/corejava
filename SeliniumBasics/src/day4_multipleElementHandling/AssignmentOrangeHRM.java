package day4_multipleElementHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utility.SeleniumUtil;

public class AssignmentOrangeHRM {

	public static void main(String[] args) {
		
		WebDriver driver=SeleniumUtil.setUp("chrome","https://opensource-demo.orangehrmlive.com/");
		
		driver.findElement(By.name("username")).clear();
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).clear();
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.className("orangehrm-login-button")).click();
		driver.findElement(By.linkText("PIM")).click();
		driver.findElement(By.linkText("Add Employee")).click();
		driver.findElement(By.name("firstName")).sendKeys("Aman");
		driver.findElement(By.name("middleName")).sendKeys("kumar");
		driver.findElement(By.name("lastName")).sendKeys("yadav");
		WebElement employeeID=driver.findElement(By.cssSelector("oxd-grid-2>div>div>*nth-child(2)>input"));
	}

}
