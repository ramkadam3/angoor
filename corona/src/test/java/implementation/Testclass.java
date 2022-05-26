package implementation;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import pompak.Pom;
import pompak.PomAdmin;
import pompak.Pom_dashaboard;
import utilitypackage.Utilityclass;

public class Testclass extends Utilityclass
{
	WebDriver driver;

	@BeforeClass
	public void beforeclass() throws InterruptedException, IOException 
	{   driver= webbrowser();
		Thread.sleep(3000);
		
		screenshot(driver);
		System.out.println("beforeclass");
	}
	@BeforeMethod
	public void beforemethode() 
	{
		System.out.println("beforemethode");
	}
	@Test
	public void testA() throws IOException
	{
	    
		Pom	p= new Pom(driver);
		p.user();
		p.pass();
		p.login();
		
		String actual=driver.getCurrentUrl();
		String Expected ="https://opensource-demo.orangehrmlive.com/index.php/dashboard";
		Assert.assertEquals(actual,Expected);
		
		screenshot(driver);
		
	}
	@Test
	public void testB() throws IOException, InterruptedException
	{
		
		Pom_dashaboard	d= new Pom_dashaboard(driver);
    	  d.leave();
	    	screenshot(driver);
		  
		  System.out.println("dashboard executed");
	}
	@Test
	public void testC() throws IOException
	{
		PomAdmin c=new PomAdmin(driver);
		c.admin();
		screenshot(driver);
	}
	@AfterMethod()
	public void aftermethod()
	{
		System.out.println("aftermethod");
	}
	@AfterClass
	public void afterclass()
	{
		System.out.println("afterclass");
	}
}
