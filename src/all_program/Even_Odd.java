package all_program;

import java.util.*;
public class Even_Odd
{
	public static void main(Demo[] args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("enter num");
		
		int num = scan.nextInt();
		
		if(num%2==0)
		{
			System.out.println("This is a even number");
		}
		
		else
		{
			System.out.println("This is a odd number");
		}
	}

}
