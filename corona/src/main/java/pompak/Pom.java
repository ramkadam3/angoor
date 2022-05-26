package pompak;

import java.io.IOException;
import java.util.function.Function;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Pom extends Utility 
{   WebDriverWait my;
   @FindBy(xpath="//input[@name='txtUsername']")
   private WebElement username;
   @FindBy(xpath="//input[@name='txtPassword']")
   private WebElement passward;
   @FindBy(xpath="//input[@name='Submit' ]")
   private WebElement login;   
   @FindBy(xpath="//b[contains(text(),'Dashboard')]")
   private WebElement dashboard; 
   
   public Pom(WebDriver driver) 
   
   {   my=new WebDriverWait(driver,20);
	   PageFactory.initElements(driver, this);
   }
   public void user() throws EncryptedDocumentException, IOException
   {   String k=exel(0,0);
        System.out.println(k);
	   my.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='txtUsername']")));
	   username.sendKeys(k);
   }
   public void pass() throws EncryptedDocumentException, IOException
   {  
	   passward.sendKeys(exel(0,1));
   }
   public void login()
   {
	   login.click();
  
   
   
   }
    
  
//   public void dash() {
//
//	   boolean a = dashboard.isEnabled();
//	   if(a==true)
//	   {
//		   System.out.println("testA is passed");
//	   }
//}
}
