package pilot;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Softassert 
{    SoftAssert soft= new SoftAssert();
	 @BeforeClass
	   public void beforeclass()
	   {
		   System.out.println("beforeclassS");
	   }
	   @BeforeMethod
	   public void beforemethode()
	   {
		   System.out.println("beforemethode");
	   }
	   @Test
	   public void test10()
	   
	   {  String a="MeeRam";
	      String b="MeeRam";
		   soft.assertEquals(a,b);
		   soft.assertAll();
		   
		   System.out.println("testA");
	   }
	   @Test
	   public void test11()
	   {
		   String c="Ram";
		   String d="Meera";
		   
		   soft.assertNotEquals(c,d);
		   soft.assertAll();
		   System.out.println("testB");
	   }
	   @Test
	   public void test12()
	   {    boolean result=false;
		   soft.assertTrue(result);
		   //soft.assertAll();
		   System.out.println("testc");
	   }
	   @Test
	   public void test13()
	   { 
		   boolean result = false;
		   soft.assertFalse(result);
		   System.out.println("testd");
	   }
	   @AfterMethod
	   public void aftermethode()
	   {
		   System.out.println("aftermethode");
	   }
	   @AfterClass
	   public void afterclass()
	   {
		   System.out.println("afterclass");
	   }
}
