package Popups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class hiddendivisionpopup 
{
	static
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		
	}
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.cleartrip.com/");
		driver.findElement(By.id("DepartDate")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='February']/parent::div/parent::div/parent::div//a[text()='15']")).click();
		
		Thread.sleep(2000);
		driver.close();
		
	}

}

