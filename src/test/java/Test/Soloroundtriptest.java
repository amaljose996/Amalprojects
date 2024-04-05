package Test;

import org.testng.annotations.Test;

import Base.Solobase;
import Page.Soloroundtrip;

public class Soloroundtriptest extends Solobase {
	
	@Test

public void roundtrip() throws Exception
{
Soloroundtrip ob=new Soloroundtrip(driver);
Thread.sleep(3000);
ob.roundtrip();
ob.pickupdestination();
ob.enterdestination();
ob.plusbutton();
ob.nextdestination();
ob.pickupdate();
ob.selecttime();
ob.returndate();
ob.phonenumber();
ob.searchnowbutton();
}
}