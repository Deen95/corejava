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

public class AutomationTestingSite_YearDropDown {

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
		WebElement YearDropdown=driver.findElement(By.id("yearbox"));
		//Step2: create instance of Select class and pass above dropdown object to its constructor
		Select slt=new Select(YearDropdown);
		
		
		System.out.println("Is YearDropdown multi-select allowed or not? "+slt.isMultiple());
		System.out.println("YearDropdown Default selected value is: "+slt.getFirstSelectedOption().getText());
		

		List<WebElement> YearDropdownList=slt.getOptions();
		System.out.println("YearDropdown count: "+YearDropdownList.size());
		
		for(int i=0;i<YearDropdownList.size();i++) {
			System.out.println(YearDropdownList.get(i).getText());
	}
		slt.selectByIndex(2);
		System.out.println("select value from dropdown using index option:"+slt.getFirstSelectedOption().getText());
		
		slt.selectByValue("2001");
		System.out.println("select value from dropdown using value option: "+slt.getFirstSelectedOption().getText());

		slt.selectByVisibleText("2002");
		System.out.println("select value from dropdown using visible text option: "+slt.getFirstSelectedOption().getText());

        List<String>ActualList=new ArrayList();
        for(int i = 0;i < slt.getOptions().size();i++) {
        ActualList.add(slt.getOptions().get(i).getText());
}
        System.out.println("ActualList: "+ActualList);
        
        List<String>DuplicateList=new ArrayList();
        DuplicateList=ActualList;
        Collections.sort(DuplicateList);
        System.out.println("DuplicateList: "+DuplicateList);
        
        System.out.println("YearDropdown is in AscendingOrder: "+DuplicateList.equals(ActualList));
        String ExpectedOps=" Year,1916,1917,1918,1919,1920,1921,1922,1923,1924,1925,1926,1927,1928,1929,1930,1931,1932,1933,1934,1935,1936,1937,1938,1939,1940,1941,1942,1943,1944,1945,1946,1947,1948,1948,1949,1950,1951,1952,1953,1954,1955,1956,1957,1958,1959,1952,1953,1954,1955,1956,1957,1958,1959,1960,1961,1962,1963,1964,1965,1966,1967,1968,1969,170,1971,1972,1973,1974,1975,1976,1977,1978,1979,1980,1981,1982,1983,1984,1985,1986,1987,1988,1989,1990,1991,1992,1993,1994,1995,1996,1997,1998,1999,2000,2001,2002,2003,2004,2004,2005,2006,2007,2008,2009,2010,2011,2012,2013,2015";
        String ActualOps=" ";
        
        for(int i=0;i < slt.getOptions().size();i++) {
        ActualOps = ActualOps + slt.getOptions().get(i).getText();
        if(i < slt.getOptions().size()-1)
        ActualOps += ", ";
        }
        System.out.println("ActualOps: " + ActualOps);
        System.out.println("Is Option Sequence Is Correct: " + ActualOps.equals(ExpectedOps));
        	
        	
	
     }
}
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
