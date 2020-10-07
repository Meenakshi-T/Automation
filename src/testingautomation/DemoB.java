package testingautomation;

import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DemoB 
{
	@DataProvider
	public Object[][] getData()
	{
		Object[][] data = new Object[2][2];
		data[0][0] = "usera";
		data[0][1] = "user123";
		data[1][0] = "userb";
		data[1][1] = "1234";
		return data;
		
	}
	
	@Test(dataProvider="getData")
	
	public void CreateUser(Object un,Object pw)
	{
		Reporter.log(un+"\t"+pw, true);
	}

}
