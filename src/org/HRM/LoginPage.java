package org.HRM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage 
{
 //declaration
	@FindBy(id="txtUsername") private WebElement uname;
	@FindBy(id="txtPassword") private WebElement password;
	@FindBy(id="btnLogin") private WebElement login;
	
	//initialization
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	//utilization
	public void Login(String username,String passwordd)
	{
		uname.sendKeys(username);
		password.sendKeys(passwordd);
		login.click();
		
	}
	

}
