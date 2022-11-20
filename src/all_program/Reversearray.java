package all_program;

public class Reversearray 
{
	public static void main(Demo[] args)
	{
		
		
		int a[] = {2,4,6,8,10};
		for(int i=0; i<a.length; i++)
		{
			System.out.print(" "+a[i]);
		}
		{	
			System.out.println();
		}
		
		//Reverse Array
		
		for(int c=a.length-1; c>=0; c--)
		{
			System.out.print(" "+a[c]);
		}
	}

}
