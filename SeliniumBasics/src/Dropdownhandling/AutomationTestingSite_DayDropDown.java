package Dropdownhandling;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class AutomationTestingSite_DayDropDown {
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
		WebElement DayDropdown=driver.findElement(By.id("daybox"));
		//Step2: create instance of Select class and pass above dropdown object to its constructor
		Select Day=new Select(DayDropdown);
		
		
		System.out.println("Is DayDropdown multi-select allowed or not? "+Day.isMultiple());
		System.out.println("DayDropdown Default selected value is: "+Day.getFirstSelectedOption().getText());
		
		List<WebElement> DayDropdownList=Day.getOptions();
		System.out.println("DayDropdown count: "+DayDropdownList.size());
		
		for(int i=0;i<DayDropdownList.size();i++) {
			System.out.println(DayDropdownList.get(i).getText());
		}
		Day.selectByIndex(5);
		System.out.println("select value from dropdown using index option:"+Day.getFirstSelectedOption().getText());
		
		Day.selectByValue("");
		System.out.println("select value from dropdown using value option: "+Day.getFirstSelectedOption().getText());

		Day.selectByVisibleText("22");
		System.out.println("select value from dropdown using visible text option: "+Day.getFirstSelectedOption().getText());


        List<String>OriginalList=new ArrayList();
        for(int i = 0;i < DayDropdownList.size();i++) {
        OriginalList.add(DayDropdownList.get(i).getText());
        }
        System.out.println("OriginalList: "+OriginalList);
        
        
        List DuptList=new ArrayList();
        DuptList=OriginalList;
        System.out.println("DuplicateList: "+DuptList);
        
        Collections.sort(DuptList);
        System.out.println("DayDropdown Is In AscendingOrder: "+OriginalList.equals(DuptList));
        
        String ExpectedList="Day,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31";
        String ActualList="";
        
        for(int i=0; i<Day.getOptions().size();i++) {
        ActualList=ActualList + Day.getOptions().get(i).getText();
        if(i<Day.getOptions().size()-1)
        	ActualList +=", ";
        }
        System.out.println("ActualList: "+ActualList);
        System.out.println("Day Sequence Is Correct: "+ActualList.equals(ExpectedList));
        
        
        
	}

}
