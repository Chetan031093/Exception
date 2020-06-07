/*
 * java programme to handle the Exception with help of multiple catch block.
 */

class Ex3
{
	void test()
	{
		try
		{
			System.out.println(10/0);
		}
		catch(ArrayIndexOutOfBoundsException  e)
		{
			System.out.println("Exception handled in ArrayIndexOutOfBoundsException ");
		}
		catch(ArithmeticException e)
		{
			System.out.println("Exception handled in ArithmeticException");
		}
	}
}
public class Exx3 
{
	public static void main(String[] args) throws Exception
	{
		System.out.println("mms");
		Ex3 e3 = new Ex3();
		e3.test();
		System.out.println("mme");
	}

}
