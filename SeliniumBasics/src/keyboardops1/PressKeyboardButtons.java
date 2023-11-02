package keyboardops1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import utility.SeleniumUtil;

public class PressKeyboardButtons {

	public static void main(String[] args) {
		WebDriver driver=SeleniumUtil.setUp("chrome","https://demo.actitime.com/");
		//enter username
		driver.findElement(By.id("username")).sendKeys("admin");
		//enter password and press ENTER button using Keys class
		driver.findElement(By.name("pwd")).sendKeys("manager",Keys.ENTER);

	}

}
