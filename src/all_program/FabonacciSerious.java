package all_program;

public class FabonacciSerious 
{
	public static void main(String[] args)
	{
		int r1=1, r2=2, r3;
		
		System.out.println(r1);
		System.out.println(r2);
		
		for (int i=1;i<=4;i++); //
		{
			r3=r1+r2;   //3
			System.out.println(r3);
			
			r1=r2; //3
			r2=r3; //5
		}
	}

}
