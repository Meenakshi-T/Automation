package testingautomation;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Demo5 
{
	static
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");	
	}
	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.get("https://home.redbrickhealth.com");
		String title=driver.getTitle();
		verifyTitle(driver,title);
		List<WebElement> allmenu=driver.findElements(By.xpath("//ul[@id='main-menu']/li[5]/preceding-sibling::li"));
		int count=allmenu.size();
		System.out.println("count"+count);
		
		
	}
	
	private static void verifyTitle(WebDriver driver, String title) 
	{
		
		WebDriverWait wait=new WebDriverWait(driver,10);
		try
		{
			wait.until(ExpectedConditions.titleIs(title));
			System.out.println("title is displayed");
		}
		catch(Exception e)
		{
			System.out.println("title is not displayed");
		}

	}

}
