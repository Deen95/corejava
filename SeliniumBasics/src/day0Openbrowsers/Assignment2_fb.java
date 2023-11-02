package day0Openbrowsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2_fb {

	public static void main(String[] args) {
		WebDriver Driver=new ChromeDriver();
		
		Driver.get("https://www.faceboook.com");
	    String T1 = Driver.getTitle();
		String T2="Facebook - log in or sign up";
		System.out.println("Verify Actual Title with Expected Title: "+T1.equals(T2));
		System.out.println("Homepage Title: "+Driver.getTitle());
		//Driver.close();
		
		

	}

}
