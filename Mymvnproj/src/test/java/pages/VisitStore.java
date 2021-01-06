package pages;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class VisitStore  
{
	FirefoxDriver driver;
	@FindBy(xpath="//div[@class='select-city']/a/i[2]") WebElement cityarrow;
	@FindBy(xpath="//span[text()='All India']") WebElement ind;
	@FindBy(xpath="//span[text()='Visit Our Store']") WebElement st;
	@FindBy(xpath="(//ul)[15]") WebElement w1;
	@FindBy(xpath="//div[@class='spl-cities']/a[text()='All India']") WebElement h;
	
	@Test(priority=1)
	public void store()
	{
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		PageFactory.initElements(driver, this);
		try {
			driver.get("https://www.quikr.com/");
			//Thread.sleep(5000);
			//cityarrow.click();
			//Thread.sleep(2000);
			//ind.click();
			Thread.sleep(10000);
			
			
		}catch(Exception e) {}
		new Actions(driver).moveToElement(st).click().perform();
		
	}
	@Test(priority=2)
	public void display()
	{
		try {
			Thread.sleep(10000);	
		}catch(Exception e) {}
			ArrayList<String> wnds=new ArrayList<String>(driver.getWindowHandles());
			driver.switchTo().window(wnds.get(1));
			List<WebElement> l=w1.findElements(By.tagName("h1"));
			System.out.println(l.size());
			System.out.println("committing............");
			for(int i=0;i<l.size();i++)
			{
				Reporter.log("Title: "+l.get(i).getText()+" ");
				Reporter.log("Address: "+l.get(i).findElement(By.xpath("//h2[text()]")).getText()+" ");
				System.out.println(l.get(i).getText());
			}		
	}
}
