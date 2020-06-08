/*
 * java programme to return Exception Event information from user defined mthd to main mthd.
 */
class Exx7
{
	ArithmeticException test()
	{
		System.out.println("test started");
		try
		{
			System.out.println(10/0);
		}
		catch(ArithmeticException ae)
		{
			System.out.println("exception handled");
			return ae;
		}
		System.out.println("test end");
		return null;

	}
}


public class Ex7 
{
	public static void main(String[] args)
	{
		Exx7 e7 = new Exx7();
		ArithmeticException ae = e7.test();
		if(ae!=null)
		{
			ae.printStackTrace();
		}
		
	}

}
