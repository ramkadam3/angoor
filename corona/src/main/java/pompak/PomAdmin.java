package pompak;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

public class PomAdmin
{
	
	WebDriverWait w;
  @FindBy(xpath="//b[text()='Admin']")
  private WebElement admin;
  @FindBy(xpath="//a[@id='menu_admin_Job']")
  private WebElement job ;
  @FindBy(xpath="//a[@id='menu_admin_Organization']")
  private WebElement org;
  @FindBy(xpath="//a[@id='menu_admin_nationality']")
  private WebElement natio;
  
  
  public PomAdmin(WebDriver driver)
  {   w=new WebDriverWait(driver,20);
	  PageFactory.initElements(driver, this);
  }
  public void admin()
  {   
	  w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//b[text()='Admin']")));
	  SoftAssert s=new SoftAssert();
	  admin.click();
	  

	  
	  s.assertTrue(job.isDisplayed());
	  s.assertTrue(org.isEnabled());
	  System.out.println("yes");
	  s.assertTrue(natio.isEnabled());
      s.assertAll();
  
  
  }
}
