package keyboardops1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utility.SeleniumUtil;

public class PageScrollingWithKeys {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = SeleniumUtil.setUp("chrome", "https://www.flipkart.com/");
		//press EXCAPE button from keyboard to remove login popup
		WebElement pageBody=driver.findElement(By.xpath("//body"));
		pageBody.sendKeys(Keys.ESCAPE);
		driver.findElement(By.xpath("//span[text()='Mobiles']")).click();
		Thread.sleep(1000);
		// scrolling down the page
		for (int i = 0; i < 6; i++) {
			
			driver.findElement(By.xpath("//body")).sendKeys(Keys.PAGE_DOWN);
			Thread.sleep(1000);
		}
		Thread.sleep(2000);
		// scrolling up the page
		for (int i = 0; i < 6; i++) {
			driver.findElement(By.xpath("//body")).sendKeys(Keys.PAGE_UP);
			Thread.sleep(1000);
		}
		System.out.println("Bye");

	}

}
