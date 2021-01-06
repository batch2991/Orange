package p1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Base1 
{
	public static WebDriver driver;
	
	/*@Before
	public void initDriver()
	{
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.google.com");
		System.out.println("base classinit");
	}
	@After
	public void teardown()
	{
		driver.close();
		System.out.println("base class down");
	}*/
	
}
