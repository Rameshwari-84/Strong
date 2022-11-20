package all_program;

public class Prime_No 
{
	public static void main(Demo[] args)
	{
		int number=7;
		
		for(int i=2; i<=number/2; i++)
		
			if(number %i==0)
			{
				System.out.println("The no is prime number");
			}
			else
			{
				System.out.println("The no is not prime number");
			}
	}

}
