package day0Openbrowsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chrome_Google {

	public static void main(String[] args) {
		WebDriver Driver = new ChromeDriver();
		Driver.get("https://www.google.com");
		Driver.getCurrentUrl();
		System.out.println("CurrentURL: "+Driver.getCurrentUrl());
		Driver.getPageSource();
		System.out.println("GooglepageSourcelength: "+Driver.getPageSource().length());
		Driver.close();
		

	}

}
