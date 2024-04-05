package Test;

import org.testng.annotations.Test;

import Base.Solobase;
import Page.Solooneway;

public class Soloonewaytest extends Solobase  {
	
	@Test
	public void oneway() throws Exception
	{
		Solooneway ob=new Solooneway(driver);
		Thread.sleep(3000);
		ob.pickupdestination();
		ob.dropdestination();
		ob.pickupdate();
		ob.selecttime();
		ob.phonenumber();
		ob.searchnowbutton();
		
	}
	
	

}
