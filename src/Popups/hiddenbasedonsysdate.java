package Popups;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class hiddenbasedonsysdate 
{
	static
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		
	}
	public static void main(String[] args) throws InterruptedException 
	{
		Date date=new Date();
		SimpleDateFormat s1=new SimpleDateFormat("d");
		String day=s1.format(date);
		SimpleDateFormat s2=new SimpleDateFormat("MMMM");
		String month=s2.format(date);
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.cleartrip.com/");
		driver.findElement(By.id("DepartDate")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='"+month+"']/parent::div/parent::div/parent::div//a[text()='"+day+"']")).click();
		Thread.sleep(3000);
		driver.close();		
		
		
	}

}
