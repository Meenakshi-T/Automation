package Popups;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class fileupload1 
{
	static
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		
	}
	public static void main(String[] args) throws InterruptedException, AWTException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.actitime.com/contact-support");
		String file_path="C:\\Users\\USER\\Desktop\\Stock defects.xlsx";
		driver.findElement(By.id("fileupload")).sendKeys(file_path);
	}
		

}
