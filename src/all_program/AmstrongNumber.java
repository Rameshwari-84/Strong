package all_program;

public class AmstrongNumber 
{
	//using while loop
	
	public static void main(Demo[] args)
	{
		int a=370;
		int rem;
		int b;
		int sum=0; //343
		int c=a; //370/3
		
		while(c>0) //370>0,3>0,0>0
		{
			rem=c%10; //370%10=37=r=7, 3%10=0.3=3 
			b=sum+rem*rem*rem; //0+7*7*7=343, 343+27=370
			sum=sum+b;  //0+343=343, 0+370=370
			c=c/10;   //370/10=37, 3/10=0.3
		}
		if(sum==a)
		{
			System.out.println("It is a amstrong number");
		}
		else
		{
			System.out.println("It is not a anstrong number");
		}
	}

}
