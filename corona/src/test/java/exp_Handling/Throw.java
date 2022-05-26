package exp_Handling;

public class Throw 
{
	public static void test()
	{
	 System.out.println("hello");
	 throw new NullPointerException();
	}
//	 public static void test2()
//	 {System.out.println("by bby");
//	 throw new ArrayIndexOutOfBoundsException();
//    }
	public static void main(String[] args) {
		test();
		//test2();
	}
}
