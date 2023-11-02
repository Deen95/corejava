package day0Openbrowsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GenericwayToOpenBrowser {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
        //Enter application url
		driver.get("https://www.google.com");
		
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		String pageSource=driver.getPageSource();
	//	System.out.println("source code: "+pageSource);
		System.out.println("Source code lenght: "+pageSource.length());
		
		driver.close();
	}

}
