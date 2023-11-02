package Dropdownhandling;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class AutomationTestingSite_MonthDropdown {
	public static WebDriver setUp(String browserName, String url) {
		WebDriver driver = null;
		if (browserName.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		} else if (browserName.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get(url);
		return driver;
	}

	public static void main(String[] args) {
		WebDriver driver = setUp("chrome", "https://demo.automationtesting.in/Register.html");
		//step1: identify dropdown list
		WebElement MonthDropdown=driver.findElement(By.cssSelector("select[placeholder='Month']"));
		//Step2: create instance of Select class and pass above dropdown object to its constructor
        Select Month=new Select(MonthDropdown);
		
		System.out.println("Is multi-select allowed or not? "+Month.isMultiple());
		
		System.out.println("Default selected value is: "+Month.getFirstSelectedOption().getText());
		

		List<WebElement> MonthDropdownList=Month.getOptions();
		System.out.println("TotalMonthDropdownList Is: "+MonthDropdownList.size());
		
		for(int i=0;i<MonthDropdownList.size();i++) {
			System.out.println(MonthDropdownList.get(i).getText());
		}
		Month.selectByIndex(6);
		System.out.println("select value from dropdown using index option:"+Month.getFirstSelectedOption().getText());
		
		Month.selectByValue("May");
		System.out.println("select value from dropdown using value option: "+Month.getFirstSelectedOption().getText());

		Month.selectByVisibleText("February");
		System.out.println("select value from dropdown using visible text option: "+Month.getFirstSelectedOption().getText());

		String expectedOptions="Month January,February,March,April,May,June,July,August,Septemmber,October,November,December";
		String actualOptions="";
		

		for(int i=0;i<Month.getOptions().size();i++) {
			actualOptions=actualOptions+MonthDropdownList.get(i).getText();
			if(i<Month.getOptions().size()-1)
				actualOptions += ",";
			}
		System.out.println("Actual Options: "+actualOptions);		
		System.out.println("is Options sequence correct? "+actualOptions.equals(expectedOptions));
	}
}
