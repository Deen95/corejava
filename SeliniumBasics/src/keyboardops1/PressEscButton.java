package keyboardops1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import utility.SeleniumUtil;

public class PressEscButton {

	public static void main(String[] args) {
		WebDriver driver=SeleniumUtil.setUp("chrome","https://www.flipkart.com/");
		//press EXCAPE button from keyboard to remove login popup
		driver.findElement(By.xpath("//body")).sendKeys(Keys.ESCAPE);

	}

}
