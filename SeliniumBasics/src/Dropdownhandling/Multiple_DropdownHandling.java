package Dropdownhandling;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Multiple_DropdownHandling {

	public static void main(String[] args) {
		WebDriver driver = setUp("chrome", "https://www.letskodeit.com/practice");
		//step1: identify dropdown list
		WebElement skillDropdown=driver.findElement(By.id("multiple-select-example"));
		//Step2: create instance of Select class and pass above dropdown object to its constructor
		Select slt=new Select(skillDropdown);
		
		System.out.println("Is multi-select allowed or not? "+slt.isMultiple());
		
		List<WebElement> skillList=slt.getOptions();
		System.out.println("Skill count: "+skillList.size());
		
		for(int i=0;i<skillList.size();i++) {
			System.out.println(skillList.get(i).getText());

	}
		slt.selectByIndex(0);
		slt.selectByValue("orange");
		slt.deselectByVisibleText("peach");
		
		//get all selected options
		List<WebElement> selectOptionList=slt.getAllSelectedOptions();
		System.out.println("select option count : "+selectOptionList.size());
		
		//unselect option
  //     slt.deselectByIndex(2);
 //      slt.deselectByVisibleText("orange");
 //      slt.deselectByValue("apple");
		      //or
		slt.deselectAll();

}

	private static WebDriver setUp(String browserName, String url) {
		WebDriver driver = null;
		if (browserName.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		} else if (browserName.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get(url);
		return null;
	}
}