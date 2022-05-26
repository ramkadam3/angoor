package utilitypackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Time;
import java.text.SimpleDateFormat;
import java.util.SimpleTimeZone;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;


public class Utilityclass 

{
	WebDriver driver;
	static int i=0;
	
	public WebDriver webbrowser()
	{

		System.setProperty("webdriver.chrome.driver","src\\test\\resources\\browser\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		return driver;
	}
	
	public void screenshot(WebDriver driver) throws IOException
	{
	    
	    
		File source =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest =new File("E:\\Jscreenshot\\photo"+i+".jpeg");
		FileHandler.copy(source, dest);
		
		System.out.println("photo"+i+"this is screenshot");
	    i++;
	
	}
	public  String exel(int i,int j) throws EncryptedDocumentException , IOException
	{
		
		
		
		
		 String path = "C:\\Users\\sunny\\Desktop\\test.xlsx";
         FileInputStream file= new FileInputStream(path);
         String n=WorkbookFactory.create(file).getSheet("first").getRow(i).getCell(j).getStringCellValue();
         
         return n;     		 
	}
	
	
 
		 
		 
		 
		 


}
