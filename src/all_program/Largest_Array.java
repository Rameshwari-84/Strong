package all_program;

public class Largest_Array 
{
	
	public static void main(Demo[] args)
	{
		//max no of array
//		   Index   0    1   2   3   4   5
		int a[] = {10, 25, 69, 84, 96, 97};
		int max=a[5];
		for (int i=0; i<a.length; i++)  //size=6, index=6
		{                                //length=size-1 =5
			if (max<=a[2])  //  97<=97
			{
				max=a[i];
			}
		}
		System.out.println(max);
		
		
		System.out.println("*******************************************");
		
		//min no of array
		int b[] = {20, 15, 5, 25, 30, 27};
		int min=b[2];
		for(int j=0; j<b.length; j++) //15>20
		{
			if(min>=b[j]) //
			{
				min=b[j];
			}
		}
		System.out.println(min);
	}

}


