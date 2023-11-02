package keyboardops1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import utility.SeleniumUtil;

public class Refreshpage {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = SeleniumUtil.setUp("chrome", "https://demowebshop.tricentis.com/");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//body")).sendKeys(Keys.chord(Keys.CONTROL,"r"));
		Thread.sleep(1000);
		driver.findElement(By.xpath("//body")).sendKeys(Keys.F5);

	}

}
