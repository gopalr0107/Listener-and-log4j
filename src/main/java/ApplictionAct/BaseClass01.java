package ApplictionAct;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

public class BaseClass01
{
WebDriver driver;
TestClass01 login;
 Logger log;
 @BeforeMethod
 public void setup()
 {
	 System.setProperty("webdriver.chrome.driver","./Drivers//chromedriver.exe");
	 driver = new ChromeDriver();
	 driver.manage().window().maximize();
	 log= Logger.getLogger("Utillityprojet");
	 PropertyConfigurator.configure("log4j.properties");

	 driver.get("https://www.google.com/");
	 log.info("url is opened");
	WebElement searcbox = driver.findElement(By.xpath("//input[@jsaction='paste:puy29d;']"));
	searcbox.sendKeys("mayname is khan");
	log.info("site has been enterd");
	WebElement element = driver.findElement(By.xpath("//div[@class='aajZCb']/descendant::div[7]"));

	element.click();
	driver.quit();
 }
	

}
