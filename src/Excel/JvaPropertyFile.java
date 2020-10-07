package Excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JvaPropertyFile 

{
	public static void main(String[] args) throws Exception 
	{
		File f=new File("data/java.properties");
		FileInputStream file =new FileInputStream(f);
		Properties p=new Properties();
		
		p.load(file);
		String url=p.getProperty("url");
		String un=p.getProperty("un");
		String pw=p.getProperty("pw");
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get(url);
		driver.findElement(By.id("username")).sendKeys(un);
		driver.findElement(By.name("pwd")).sendKeys(pw,Keys.ENTER);
		
		
		
	}

}
