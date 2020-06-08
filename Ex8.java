/*
 * java programme on creation custome Exception Event using Exception Class.
 */
class TrnasectionException extends RuntimeException
{
	@Override
	public String getMessage()
	{
		return "Invalid OTP";
	}
}
class Exx8
{
	int system_OTP = 1234;
	int user_OTP;
	
	void test(int user_OTP) 
	{
		this.user_OTP = user_OTP;
		if(system_OTP == user_OTP)
		{
			System.out.println("Transection Succesfull");
		}
		else
		{
			System.out.println("Transection failed");
			throw new TrnasectionException();
		}
		System.out.println("have nice day");
	}
	
}
public class Ex8 
{
	public static void main(String[] args) 
	{
		Exx8 e8 = new Exx8();
		e8.test(1234);
	}
}
