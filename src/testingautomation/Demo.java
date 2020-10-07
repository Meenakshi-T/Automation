package testingautomation;

import org.openqa.selenium.ie.InternetExplorerDriver;

//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo 
{
	public static void main(String[] args) throws InterruptedException 
	{
		/*String key ="webdriver.gecko.driver";
		String value ="C:\\Users\\USER\\Desktop\\seleniumdrivers\\geckodriver.exe";
				
		System.setProperty(key, value);
		FirefoxDriver f=new FirefoxDriver();
		Thread.sleep(5000);
		f.close();*/
		/*String key ="webdriver.chrome.driver";
		String value ="./drivers/chromedriver.exe";
				
		System.setProperty(key, value);
		ChromeDriver c=new ChromeDriver();
		Thread.sleep(5000);
		c.close();*/
		
		String key ="webdriver.ie.driver";
		String value ="./drivers/IEDriverServer.exe";
				
		System.setProperty(key, value);
		InternetExplorerDriver ie =new InternetExplorerDriver();
		Thread.sleep(2000);
		ie.close();
		
		
	}
	

}
