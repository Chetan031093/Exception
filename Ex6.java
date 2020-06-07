import java.io.File;
import java.io.FileNotFoundException;

/*
 * java programme to handle the Exception Event where multiple Exception class is present.((Compile time Exception)
 */
class Exx6
{
	void test() throws InterruptedException
	{
		System.out.println("Chetan");
		Thread.sleep(2000);
		System.out.println("Salve");
	}
	
	void test1() throws FileNotFoundException
	{
		System.out.println("FileNotFoundException is handled");
		File file = new File("E://file.txt"); 
	}
}
public class Ex6 
{
	public static void main(String[] args) throws Exception
	{
		Exx6 e6 = new Exx6();
		e6.test();
		e6.test1();
	}
}
