package Popups;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class promptpopup 
{
	static
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		
	}
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("file:///F:/seleniumdrivers/promptpopup.html");
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		Alert a=driver.switchTo().alert();
		//Thread.sleep(3000);
		a.sendKeys("srikanth");
		Thread.sleep(3000);
		a.accept();
	     Thread.sleep(3000);
	     driver.close();
		
		
	}

}
