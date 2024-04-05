package Page;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Sololocaltrip {

	
public WebDriver driver;

@FindBy (xpath="//*[@id=\"two-tab\"]")
WebElement local;

@FindBy (xpath="//*[@id=\"city\"]")
WebElement pickup;

@FindBy (xpath="//*[@id=\"cog\"]")
WebElement packages;

@FindBy (xpath="//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[1]/td[6]/a")
List <WebElement> dates;

@FindBy (xpath=" //*[@id=\"local_time\"]")
List <WebElement> times;

@FindBy (xpath="//*[@id=\"phone2\"]")
WebElement phone;

@FindBy (xpath="//*[@id=\"myTabContent\"]/button")
WebElement searchnow;

public Sololocaltrip (WebDriver driver)
{
	this.driver=driver;
	PageFactory.initElements(driver, this);
}

public void localtrip()
{
	local.click();
}

public void pickuplocation() throws Exception
{

	Thread.sleep(3000);
	pickup.sendKeys("Kaloor");
	Actions act=new Actions(driver);
	act.sendKeys(pickup,Keys.ARROW_DOWN).sendKeys(Keys.ENTER);
	act.perform();
}
public void selectpackage() throws Exception
{
	Thread.sleep(3000);
	packages.sendKeys("4 hours,40 km");
	Actions act=new Actions(driver);
	act.sendKeys(packages,Keys.ARROW_DOWN).sendKeys(Keys.ENTER);
	act.perform();
}

public void pickupdate() throws Exception
{
	Thread.sleep(3000);
	
	for (WebElement date:dates)
	{
		String datedetails=date.getText();
		System.out.println(datedetails);
		if(datedetails.contains("5"))
		{
			WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
			wait.until(ExpectedConditions.elementToBeClickable(date));
			date.click();

		}
		}
}
public void selecttime() throws Exception
{
	Thread.sleep(3000);
	
	for (WebElement time:times)
	{
		String timedetails=time.getText();
		System.out.println(timedetails);
		if(timedetails.contains("09:00AM"))
		{

			WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
			wait.until(ExpectedConditions.elementToBeClickable(time));
			time.click();
				
		}
	}
}

public void phonenumber() throws Exception
{

	Thread.sleep(3000);
	phone.sendKeys("9048965083");
	
}
	public void searchnowbutton()
	{
		searchnow.click();
	}
		
	
}







