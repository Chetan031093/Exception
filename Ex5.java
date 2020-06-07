/*
 * java programme to show difference between PrintStachTrace() and getMessage() method.
 */

class Exx5 
{
	String a = "Infinity"; 
	void test()
	{
		try
		{
			System.out.println("normally answer is : " +a);
			System.out.println(10/0);
		}
		catch(ArithmeticException e)
		{
			e.printStackTrace();//gives fully qualified information about Exception Event
		}
	}
		void test1()
		{
			try
			{
				System.out.println("normally answer is : " +a);
				System.out.println(10/0);
			}
			catch(ArithmeticException e)
			{
				System.out.println(e.getMessage());// gives reason for Exception Event.
			}
		}
}
public class Ex5 
{
	public static void main(String[] args)
	{
		Exx5 e5 = new Exx5();
		e5.test();
		e5.test1();
	}
}


