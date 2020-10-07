package testingautomation;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Demo1 
{
	static
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		System.setProperty("webdriver.geckodriver", "./drivers/geckodriver.exe");
		System.setProperty("webdriver.ie.driver", "./drivers/IEDriverServer.exe");	
	}
	
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=null;
		System.out.println("enter the browser name");
		Scanner sc=new Scanner(System.in);
		String browser=sc.next();
		if(browser.equals("chrome"))
		{
			driver=new ChromeDriver();
		}
		else if (browser.equals("firefox"))
		{
			driver=new FirefoxDriver();
		}
		else if (browser.equals("ie"))
		{
			driver=new InternetExplorerDriver();
		}
		
		Thread.sleep(2000);
		driver.close();
		
	}

}
