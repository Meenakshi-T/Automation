package Popups;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class filedownloadpopup 
{
	static
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		
	}
	public static void main(String[] args) throws InterruptedException, AWTException 
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("https://selenium.dev/downloads/");
		driver.findElement(By.xpath("//td[text()='Java']/parent::tr//a[text()='Download']")).click();
		Robot r= new Robot();
		r.keyPress(KeyEvent.VK_ALT);
		r.keyPress(KeyEvent.VK_S);
		Thread.sleep(2000);
		r.keyRelease(KeyEvent.VK_S);
		r.keyRelease(KeyEvent.VK_ALT);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
        r.keyRelease(KeyEvent.VK_ENTER);
		
		
		
		
	}

	
}
