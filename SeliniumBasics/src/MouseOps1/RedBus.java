package MouseOps1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utility.SeleniumUtil;

public class RedBus {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = SeleniumUtil.setUp("chrome", "https://www.redbus.in/");
		

		Thread.sleep(2000);
		driver.findElement(By.id("src")).sendKeys("pune");
		Thread.sleep(2000);
		
		List<WebElement>srcList=driver.findElements(By.xpath("//div[@role='button']/ul/li/div/text"));
		System.out.println("Src list : "+srcList.size());
		for (int i = 0; i < srcList.size(); i++) {
			if (srcList.get(i).getText().contains("Swargate")) {
				srcList.get(i).click();
				break;

	}

}
 }
}