package testingautomation;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo2 
{
	static
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		
	}
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=null;
		System.out.println("enter the browser name");
		Scanner sc= new Scanner(System.in);
		String browser=sc.next();
		if(browser.equals("chrome"))
		{
			driver=new ChromeDriver();	
		}
		else if(browser.equals("firefox"))
		{
			driver=new FirefoxDriver();	
		}
		
		
		
		Thread.sleep(2000);
		
		driver.close();
	}

}
