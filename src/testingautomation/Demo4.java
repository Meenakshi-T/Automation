package testingautomation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Demo4 
{
	static
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		
	}
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
		WebDriver driver=new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com");
		String title=driver.getTitle();
		System.out.println(title);
		verifyTitle(driver,title);
		Thread.sleep(2000);
		
	   	driver.findElement(By.id("email")).sendKeys("27novmeenu@gmail.com");
       driver.findElement(By.id("pass")).sendKeys("vivekananda");
        driver.findElement(By.id("u_0_b")).click();
        
       driver.findElement(By.name("q")).sendKeys("sweetyammu jeni",Keys.ENTER);
       driver.findElement(By.xpath("(//button[@class='_42ft _4jy0 FriendRequestAdd addButton _4jy3 _517h _51sy'])[1]")).click();
   	   driver.findElement(By.id("userNavigationLabel")).click();
   	 driver.findElement(By.xpath("(//span[@class='_54nh'])[6]")).click();
        Thread.sleep(2000);
		driver.close();
		
		
	}
	private static void verifyTitle(WebDriver driver, String title) 
	{
		
		WebDriverWait wait=new WebDriverWait(driver,10);
		try
		{
			wait.until(ExpectedConditions.titleIs(title));
			System.out.println("login page is displayed");
		}
		catch(Exception e)
		{
			System.out.println("login page is not displayed");
		}

	}

}
