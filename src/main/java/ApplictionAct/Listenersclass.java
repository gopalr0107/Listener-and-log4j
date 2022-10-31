package ApplictionAct;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listenersclass implements ITestListener
{    WebDriver driver;

	public void onTestStart(ITestResult result)
	{
		System.out.println("test case started executioin");
	}
	public void onTestFailure(ITestResult result)
	{
		System.out.println("tast case is fail hence taking screen shot");
		
		this.driver=((TestClass01)result.getInstance()).driver;
		TakesScreenshot ts=(TakesScreenshot)driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File dest= new File("./Screenshots//logingpage.jpg");
		try {
			FileHandler.copy(source, dest);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void onTestSuccess(ITestResult result)
	{
		System.out.println("test case pass successfully");
	}
}
