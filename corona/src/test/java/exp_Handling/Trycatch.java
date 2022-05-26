package exp_Handling;

public class Trycatch 
{
public static void main(String[] args) 
{
 int a=13;
 int b=0;
 int c=0;
 int n[]= {1,2,3,4,5};
 try
 {
	
	 try
	 {
		 System.out.println(n[5]);
	 }
	 catch(ArrayIndexOutOfBoundsException m)
	 {
		 
		 System.out.println(n[4]);
	 }
	 c=a/b;
 
}
 catch(ArithmeticException e)
 {
	 System.out.println("b is zero");
	 b=10;
	 c=a/b;
 }
// catch(ArrayIndexOutOfBoundsException m)
// {
//	 System.out.println(n[4]);
// }
// catch(Exception o)
// {
//	 System.out.println("Handled");
// }
 
 System.out.println(c);
}
}
