/*
 * java programme to show Genric Exception Handler and Specific Exception Handler in Single java programme. 
 */

class Exx2
{
	void test() throws InterruptedException
	{
		System.out.println("Chetan");
		Thread.sleep(2000);
		System.out.println("Salve");
		Thread.sleep(2000);
	}
	
	void test1() throws Exception
	{
		System.out.println("Chetan");
		Thread.sleep(2000);
		System.out.println("Salve");
	
	}
}
public class Ex2
{
	public static void main(String[] args) throws Exception
	{
		Exx2 e2 = new Exx2();
		e2.test();
		e2.test1();
	}
}
