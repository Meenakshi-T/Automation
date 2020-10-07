package Popups;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class popupassignment1 
{
	static
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		
	}
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		//WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@class='popup_menu_icon'])[1]")).click();
		driver.findElement(By.xpath("//a[text()='Logo Settings']")).click();
		driver.findElement(By.xpath("(//td[@class='aligned_radio_button_cell'])[2]")).click();
		//String file_path="C:\\Users\\USER\\Desktop\\Meenakshi resume .doc";
		Thread.sleep(3000);
		String file_path="‪C:\\Users\\USER\\Desktop\\DemoA.png";
		driver.findElement(By.xpath("(//input[@class='inputChooseFile'])[1]")).sendKeys(file_path);
		driver.findElement(By.xpath("//input[@class='saveButton']")).click();
		
	}

}
