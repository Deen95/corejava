package Dropdownhandling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Saucedemo {

	public static void main(String[] args) {

		 WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.get("https://www.saucedemo.com/");
			
			String usernames=driver.findElement(By.id("login_credentials")).getText();
			String[] UserList=usernames.split("\n");
			System.out.println("Usernames: "+usernames);
			
			String Passwords=driver.findElement(By.className("login_password")).getText();
			System.out.println("Passwords: "+Passwords);
			String[] Password = Passwords.split("\n");
			System.out.println("Password: "+Password[1]);
System.out.println("*******************************************************************************************");
System.out.println("Login Using Username: standard_user,& Password: secret_sauce");

            driver.findElement(By.id("user-name")).sendKeys(UserList[1]);
            driver.findElement(By.id("password")).sendKeys(Password[1]);
            driver.findElement(By.id("login-button")).click();
            
            WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
            wait.until(ExpectedConditions.elementToBeClickable(By.id("react-burger-menu-btn")));
            
            String ExpectedHomepageURL_1="https://www.saucedemo.com/inventory.html";
            String ActualHomepageURL_1=driver.getCurrentUrl();
            System.out.println("Is Login Successfull: "+ActualHomepageURL_1.equals(ExpectedHomepageURL_1));
            
            driver.findElement(By.id("react-burger-menu-btn")).click();
            driver.findElement(By.id("logout_sidebar_link")).click();
            
            WebDriverWait wait2=new WebDriverWait(driver,Duration.ofSeconds(30));
            wait2.until(ExpectedConditions.elementToBeClickable(By.id("login-button")));
            
            String ExpectedLoginpageURL_1="https://www.saucedemo.com/";
            String ActualLoginpageURL_1=driver.getCurrentUrl();
            System.out.println("Is Logout Successfull: "+ActualHomepageURL_1.equals(ExpectedHomepageURL_1));
            
System.out.println("*****************************************************************************************");
System.out.println("Login Using Username: locked_out_user,& Password: secret_sauce");


            driver.findElement(By.id("user-name")).sendKeys(UserList[2]);
            driver.findElement(By.id("password")).sendKeys(Password[1]);
            driver.findElement(By.id("login-button")).click();
            System.out.println("Is Login successful: "+"Sorry,this user has been locked out.");
            
            
System.out.println("*****************************************************************************************");
System.out.println("Login Using Username: problem_user,& Password: secret_sauce");

            driver.findElement(By.id("user-name")).clear();
            driver.findElement(By.id("user-name")).sendKeys(UserList[3]);
            driver.findElement(By.id("password")).clear();
            driver.findElement(By.id("password")).sendKeys(Password[1]);
            driver.findElement(By.id("login-button")).click();
           
            
            WebDriverWait wait3=new WebDriverWait(driver,Duration.ofSeconds(30));
            wait3.until(ExpectedConditions.elementToBeClickable(By.id("react-burger-menu-btn")));
            
            
            String ExpectedHomepageURL_3="https://www.saucedemo.com/inventory.html";
            String ActualHomepageURL_3=driver.getCurrentUrl();
            System.out.println("Is Login Successfull: "+ActualHomepageURL_3.equals(ExpectedHomepageURL_3));
            
            driver.findElement(By.id("react-burger-menu-btn")).click();
            driver.findElement(By.id("logout_sidebar_link")).click();
            
            WebDriverWait wait4=new WebDriverWait(driver,Duration.ofSeconds(30));
            wait4.until(ExpectedConditions.elementToBeClickable(By.id("login-button")));
            
            String ExpectedLoginpageURL_3="https://www.saucedemo.com/";
            String ActualLoginpageURL_3=driver.getCurrentUrl();
            System.out.println("Is Logout Successfull: "+ActualHomepageURL_3.equals(ExpectedHomepageURL_3));
            
            
System.out.println("*****************************************************************************************");
System.out.println("Login Using Username: performance_glitch_user,& Password: secret_sauce");

            driver.findElement(By.id("user-name")).sendKeys(UserList[4]);
            driver.findElement(By.id("password")).sendKeys(Password[1]);
            driver.findElement(By.id("login-button")).click(); 
            
            WebDriverWait wait5=new WebDriverWait(driver,Duration.ofSeconds(30));
            wait5.until(ExpectedConditions.elementToBeClickable(By.id("react-burger-menu-btn")));
            
            String ExpectedHomepageURL_4="https://www.saucedemo.com/inventory.html";
            String ActualHomepageURL_4=driver.getCurrentUrl();
            System.out.println("Is Login Successfull: "+ActualHomepageURL_4.equals(ExpectedHomepageURL_4));
            
            driver.findElement(By.id("react-burger-menu-btn")).click();
            driver.findElement(By.id("logout_sidebar_link")).click();
            
            WebDriverWait wait6=new WebDriverWait(driver,Duration.ofSeconds(30));
            wait6.until(ExpectedConditions.elementToBeClickable(By.id("login-button")));
            
            String ExpectedLoginpageURL_4="https://www.saucedemo.com/";
            String ActualLoginpageURL_4=driver.getCurrentUrl();
            System.out.println("Is Logout Successfull: "+ActualHomepageURL_4.equals(ExpectedHomepageURL_4));
            
 System.out.println("*****************************************************************************************");
 System.out.println("Login Using Username: error_user,& Password: secret_sauce");
 
            driver.findElement(By.id("user-name")).sendKeys(UserList[5]);
            driver.findElement(By.id("password")).sendKeys(Password[1]);
            driver.findElement(By.id("login-button")).click(); 
            
            WebDriverWait wait7=new WebDriverWait(driver,Duration.ofSeconds(30));
            wait7.until(ExpectedConditions.elementToBeClickable(By.id("react-burger-menu-btn"))); 
            
            String ExpectedHomepageURL_5="https://www.saucedemo.com/inventory.html";
            String ActualHomepageURL_5=driver.getCurrentUrl();
            System.out.println("Is Login Successfull: "+ActualHomepageURL_5.equals(ExpectedHomepageURL_5));
            
            driver.findElement(By.id("react-burger-menu-btn")).click();
            driver.findElement(By.id("logout_sidebar_link")).click();
            
            WebDriverWait wait8=new WebDriverWait(driver,Duration.ofSeconds(30));
            wait8.until(ExpectedConditions.elementToBeClickable(By.id("login-button")));
            
            String ExpectedLoginpageURL_5="https://www.saucedemo.com/";
            String ActualLoginpageURL_5=driver.getCurrentUrl();
            System.out.println("Is Logout Successfull: "+ActualHomepageURL_5.equals(ExpectedHomepageURL_5));
            
System.out.println("*****************************************************************************************");
System.out.println("Login Using Username: visual_user,& Password: secret_sauce");

           driver.findElement(By.id("user-name")).sendKeys(UserList[5]);
           driver.findElement(By.id("password")).sendKeys(Password[1]);
           driver.findElement(By.id("login-button")).click(); 
           
           WebDriverWait wait9=new WebDriverWait(driver,Duration.ofSeconds(30));
           wait9.until(ExpectedConditions.elementToBeClickable(By.id("react-burger-menu-btn"))); 
           
           String ExpectedHomepageURL_6="https://www.saucedemo.com/inventory.html";
           String ActualHomepageURL_6=driver.getCurrentUrl();
           System.out.println("Is Login Successfull: "+ActualHomepageURL_6.equals(ExpectedHomepageURL_6));
           
           driver.findElement(By.id("react-burger-menu-btn")).click();
           driver.findElement(By.id("logout_sidebar_link")).click();
           
           WebDriverWait wait10=new WebDriverWait(driver,Duration.ofSeconds(30));
           wait10.until(ExpectedConditions.elementToBeClickable(By.id("login-button")));
           
           String ExpectedLoginpageURL_6="https://www.saucedemo.com/";
           String ActualLoginpageURL_6=driver.getCurrentUrl();
           System.out.println("Is Logout Successfull: "+ActualHomepageURL_6.equals(ExpectedHomepageURL_6));
           
           
           
           
            
            
            
            
            
           
            
            
            
            
            
            
            
            
            
           
            
			
		
	}

}
