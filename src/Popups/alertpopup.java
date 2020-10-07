package Popups;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alertpopup 
{
	static
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		
	}
	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("file:///F:/seleniumdrivers/alertpopup.html");
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		try
		{
			Alert a=driver.switchTo().alert();
			System.out.println("popup is displayed");
			String text=a.getText();
			System.out.println(text);
			if(text.equals("I am an alert box!"))
			{
				System.out.println("pass");
				a.accept();
			}
			else
			{
				System.out.println("fail");
			}
		}
		
		catch(Exception e)
		{
			System.out.println("popup is not displayed");
		}
		
	}

}
