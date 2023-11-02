package MouseOps1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import utility.SeleniumUtil;

public class Assignment_mouseHover {

	public static void main(String[] args) {
		WebDriver driver = SeleniumUtil.setUp("chrome","https://www.espncricinfo.com/");
        
       Actions Act= new Actions(driver);
		
		List<WebElement> menuBarList=driver.findElements(By.cssSelector(".ds-relative>nav>div>div>div>*:nth-child(2)>div"));
		for(int i=0;i<menuBarList.size();i++) {
		System.out.println(menuBarList.get(i).getText());
		Act.moveToElement(menuBarList.get(i)).perform();
	  }
        System.out.println("END");
	}

}
