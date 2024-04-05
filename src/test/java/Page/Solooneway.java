package Page;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Solooneway<javascriptexecutor> {

	
public WebDriver driver;

@FindBy (xpath="//*[@id=\"pickup_city1\"]")
WebElement pickup;

@FindBy (xpath="//*[@id=\"next_destination1\"]")
WebElement drop;

@FindBy (xpath="//*[@id=\"datepicker1\"]")
List <WebElement> dates;

@FindBy (xpath="//*[@id=\"pickUpTime\"]")
List <WebElement> times;

@FindBy (xpath="//*[@id=\"phone1\"]")
WebElement phone;

@FindBy (xpath="//*[@id=\"myTabContent\"]/button")
WebElement searchnow;

public Solooneway (WebDriver driver)
{
	this.driver=driver;
	PageFactory.initElements(driver, this);
}

public void pickupdestination() throws Exception
{
	Thread.sleep(3000);
	pickup.sendKeys("Kochi");
	Actions act=new Actions(driver);
	act.sendKeys(pickup,Keys.ARROW_DOWN).sendKeys(Keys.ENTER);
	act.perform();
}

public void dropdestination() throws Exception
{

	Thread.sleep(3000);
	drop.sendKeys("Bangalore");
	Actions act=new Actions(driver);
	act.sendKeys(drop,Keys.ARROW_DOWN).sendKeys(Keys.ENTER);
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
		if(timedetails.contains("10:00AM"))
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




