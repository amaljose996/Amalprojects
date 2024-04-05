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

public class Soloroundtrip {

	public WebDriver driver;
	
	@FindBy (xpath="//*[@id=\"Three-tab\"]")
	WebElement round;

	@FindBy (xpath="//*[@id=\"pickup_city\"]")
	WebElement pickup;

	@FindBy (xpath="//*[@id=\"next_destination\"]")
	WebElement enter;

	@FindBy(xpath="//*[@id=\"Three\"]/button[1]/i")
	WebElement plus;

	@FindBy (xpath="//*[@id=\"next_destination2\"]")
	WebElement next;

	@FindBy (xpath="//*[@id=\"datepicker\"]")
	List <WebElement> dates;

	@FindBy (xpath="//*[@id=\"pickUpTime1\"]")
	List <WebElement> times;

	@FindBy (xpath="//*[@id=\"datepicker2\"]")
	List <WebElement> returnd;

	@FindBy (xpath="//*[@id=\"phone\"]")
	WebElement phone;

	@FindBy (xpath="//*[@id=\"myTabContent\"]/button")
	WebElement searchnow;

	public Soloroundtrip (WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void roundtrip()
	{
		round.click();
	}

	public void pickupdestination() throws Exception
	{
		Thread.sleep(3000);
		pickup.sendKeys("Kochi");
		Actions act=new Actions(driver);
		act.sendKeys(pickup,Keys.ARROW_DOWN).sendKeys(Keys.ENTER);
		act.perform();
	}

	public void enterdestination() throws Exception
	{

		Thread.sleep(3000);
		enter.sendKeys("Mangluru");
		Actions act=new Actions(driver);
		act.sendKeys(enter,Keys.ARROW_DOWN).sendKeys(Keys.ENTER);
		act.perform();
	}

	public void plusbutton()
	{
		plus.click();
	}

	public void nextdestination() throws Exception
	{

		Thread.sleep(3000);
		next.sendKeys("Udupi");
		Actions act=new Actions(driver);
		act.sendKeys(next,Keys.ARROW_DOWN).sendKeys(Keys.ENTER);
		act.perform();
		
	}

	public void pickupdate() throws Exception
	{
		Thread.sleep(3000);
		
		for (WebElement date:dates)
		{
			String datedetails=date.getText();
			System.out.println(datedetails);
			if(datedetails.contains("6"))
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
	public void returndate() throws Exception
	{
		Thread.sleep(3000);
		
		for (WebElement date:returnd)
		{
			String datedetails=date.getText();
			System.out.println(datedetails);
			if(datedetails.contains("11"))
			{
				WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
				wait.until(ExpectedConditions.elementToBeClickable(date));
				date.click();

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



	
