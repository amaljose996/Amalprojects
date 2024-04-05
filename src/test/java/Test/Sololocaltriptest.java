package Test;

import org.testng.annotations.Test;

import Base.Solobase;
import Page.Sololocaltrip;

public class Sololocaltriptest extends Solobase {

	@Test

public void localtrip() throws Exception
{
	Sololocaltrip ob=new Sololocaltrip(driver);
	Thread.sleep(3000);
	ob.localtrip();
	ob.pickuplocation();
	ob.selectpackage();
	ob.pickupdate();
	ob.selecttime();
	ob.phonenumber();
	ob.searchnowbutton();
}

}
