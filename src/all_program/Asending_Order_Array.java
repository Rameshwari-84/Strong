package all_program;

import java.util.Arrays;

public class Asending_Order_Array 
{

	public static void main(String []args)
			{
				int a[] = new int[4];
				  	a[0] = 90;
					a[1] = 30;
					a[2] = 40;
					
					
			int size = a.length;
			System.out.println(size);
			Arrays.sort(a);
			
			
				
				for (int i=0; i<a.length; i++)
				{ 
					System.out.println(a[i]);
				}

				for (int j=a.length; j>=0; j--)
				{
					System.out.println(a[j]);
				}
			}

}
