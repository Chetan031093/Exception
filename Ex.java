/*
 * java programme on Exception propogation.
 */
 class Exx
{
	void add()
	{
		System.out.println(10+10);
	}
	void test()
	{
		System.out.println(10/0);
		this.add();
	}
	
	void view()
	{
		this.test();
		
	}
}

 public class Ex
 {
	 public static void main(String[] args) 
	 {
		Exx e = new Exx();
		e.view();
	 }
 }