package pompak;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Pom_dashaboard 
{ WebDriverWait wait;
  @FindBy(xpath="//span[contains(text(),'Assign Leave')]")
  private WebElement leave;
  @FindBy(xpath="//a[contains(text(),'Apply')]")
  private WebElement apply;
  
  @FindBy(xpath="(//a[contains(text(),'My Leave')])[1]")
  private WebElement my;
  @FindBy(xpath="(//a[contains(text(),'Entitlements')])[@class='arrow']")
  private WebElement entity;
  @FindBy(xpath="(//a[text()='Reports'])[@id='menu_leave_Reports']")
  private WebElement report;
  @FindBy(xpath="//a[@id='menu_leave_Configure']")
  private WebElement configure;
  @FindBy(xpath="//a[@id='menu_leave_viewLeaveList']")
  private WebElement leavelist;
  @FindBy(xpath="//a[@id='menu_leave_assignLeave']")
  private WebElement assignleave;
  
  public Pom_dashaboard(WebDriver driver)
  {   wait=new WebDriverWait(driver,20);
	  PageFactory.initElements(driver, this);
  }
  
  public void leave() throws InterruptedException
  {   wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'Assign Leave')]")));
	  leave.click();
	  boolean a=my.isEnabled();
      System.out.println(a);
      Thread.sleep(3000);
      a=entity.isEnabled();
      System.out.println(a);
      //Thread.sleep(2000);
      System.out.println(entity.isEnabled());
     // Thread.sleep(2000);
      System.out.println(report.isEnabled());
    //  Thread.sleep(2000);
      System.out.println(configure.isEnabled());
    //  Thread.sleep(2000);
      System.out.println(leavelist.isEnabled());
      
      System.out.println(assignleave.isEnabled());
  }
  
  
}
