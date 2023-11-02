package keyboardops1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import utility.SeleniumUtil;

public class PageScrollingWithkeys2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = SeleniumUtil.setUp("chrome", "https://www.flipkart.com/");
        
		// press EXCAPE button from keyboard to remove login popup
				driver.findElement(By.xpath("//body")).sendKeys(Keys.ESCAPE);
				driver.findElement(By.xpath("//span[text()='Mobiles']")).click();
				Thread.sleep(1000);
				// scrolling till bottom of page
				Thread.sleep(1000);
				driver.findElement(By.xpath("//body")).sendKeys(Keys.chord(Keys.CONTROL, Keys.END));
				Thread.sleep(2000);
				// scrolling till top of page
				driver.findElement(By.xpath("//body")).sendKeys(Keys.chord(Keys.CONTROL, Keys.HOME));
	}

}
