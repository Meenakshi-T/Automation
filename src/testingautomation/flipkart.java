package testingautomation;

import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class flipkart 
{
	static
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
	}
	
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		//Thread.sleep(1000);
		
		driver.findElement(By.name("q")).sendKeys("iphone xs 64");
		List<WebElement> allsug = driver.findElements(By.xpath("//li[@class='_1va75j']"));
		int count=allsug.size();
		System.out.println(count);
		Thread.sleep(2000);
		TreeSet<String> ts=new TreeSet<String>();
		for(WebElement a:allsug)
		{
			String text=a.getText();
			ts.add(text);
			System.out.println(text);
		}
		System.out.println("------------------------------------------");
		for(String t:ts)
		{
			System.out.println(t);
		}
		
		Thread.sleep(3000);
		driver.close();
		
		
	}

}
