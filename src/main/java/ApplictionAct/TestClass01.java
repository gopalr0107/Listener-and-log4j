package ApplictionAct;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(ApplictionAct.Listenersclass.class)

public class TestClass01 extends BaseClass01
{
	@Test(priority=0)
	public void logingfuctinality()
	{
		System.out.println("verifying loing fuctionlity");
		Assert.assertTrue(true);
	}
	@Test(priority=1)
	public void logingfuctinality01()
	{
		System.out.println("verifying loing fuctionlity01");
		Assert.assertTrue(false);
	}

}
