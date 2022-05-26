package pilot;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Hardassert {
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
   public void test0()
   {
	   String a ="Meeram";
	   String b="Meeram";
	   Assert.assertEquals(a, b);
	   System.out.println("test0");
   }
   @Test
   public void test1()
   
   {
	   String a="Raam";
	   String b="Meera";
	   Assert.assertNotEquals(a,b);
	   System.out.println("test1");
   }
   @Test(dependsOnMethods={"test1"})
   public void test2()
   {
	   Assert.fail();
	   System.out.println("test2");
   }
   @Test
   public void test3()
   {
	   boolean result= true;
	   Assert.assertTrue(result);
	   System.out.println("test3");
   }
   @Test
   public void test4()
   {
	   boolean result=false;
	   Assert.assertFalse(result);
	   System.out.println("test4");
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
