/*
 * java progrrame to avoid Exception propogation
 */
class Exx1
{
	void test1()
	{
		System.out.println(10+10);
	}
	
	void test2()
	{
		try
		{
			System.out.println(10/0);
		}
		catch(ArithmeticException ae)
		{
			this.test1();
		}
	}
	
	void test3()
	{
		this.test2();
	}
}
public class Ex1 
{
	public static void main(String[] args)
	{
		Exx1 e1 = new Exx1();
		e1.test3();
	}
}
