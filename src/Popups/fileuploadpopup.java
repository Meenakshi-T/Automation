package Popups;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class fileuploadpopup 
{
	static
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		
	}
	public static void main(String[] args) throws InterruptedException, AWTException 
	{
		WebDriver driver=new ChromeDriver();
		/*driver.get("https://www.actitime.com/contact-support");
		String file_path="C:\\Users\\USER\\Desktop\\Meenakshi resume .doc";
		driver.findElement(By.id("fileupload")).sendKeys(file_path);*/
		
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("c");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@class='popup_menu_icon'])[3]")).click();
		driver.findElement(By.xpath("//a[text()='Contact actiTIME Support']")).click();
		driver.findElement(By.xpath("//div[@class='icon dz-clickable']")).click();
		String file_path="C:\\Users\\USER\\Desktop\\Meenakshi resume .doc";
		StringSelection file=new StringSelection(file_path);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(file, null);
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		Thread.sleep(1000);
		r.keyRelease(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		
		
		
		
		
	}

}
