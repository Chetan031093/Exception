
class Exx4
{
	void test()
	{
		System.out.println("Chetan");
		try
		{
			try
			{
				Thread.sleep(3000);
			}
			catch(InterruptedException ie)
			{
				System.out.println("EXCEPTION HANDLED IN InterruptedException ");// NOT GET PRINtED BECAUSE EXCEPTIUON HANDLED IN COMPILE TIME
			}
			System.out.println("Prakash");
			Thread.sleep(2000);
			}
		catch(InterruptedException e)
		{
			System.out.println("EXCEPTION HANDLED IN InterruptedException ");// NOT GET PRINTED BECAUSE EXCEPTIUON HANDLED IN COMPILE TIME
		}
		System.out.println("Salve");
	}

}

public class Ex4
{
	public static void main(String[] args) 
	{
		Exx4 e4 = new Exx4();
		e4.test();
	}
}	
	

