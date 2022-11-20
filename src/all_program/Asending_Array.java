package all_program;

public class Asending_Array 
{
	public static void main(String[] args)
	{
		int[] a= {20,30,54,12,90,10};
		int x;
		for(int i=0; i<a.length; i++)
		{
			for(int j=i+1; j<a.length; j++)
			{
				if (a[i]>a[j])
				{
					x=a[i];
					a[i]=a[j];
					a[j]=x;
				}
			}
		}
		
		for (int k=0; k<a.length; k++)
		{
			System.out.println(a[k]);
		}
		
		
		System.out.println("****************************************");
		
		
		//Desending_Array
		int[] b= {20,30,54,12,90,10};
		int r;
		for(int m=0; m<b.length; m++)
		{
			for(int n=m+1; n<b.length; n++)
			{
				if (b[m]<b[n])
				{
					r=b[m];
					b[m]=b[n];
					b[n]=r;
				}
			}
		}
		
		for (int p=0; p<b.length; p++)
		{
			System.out.println(b[p]);
		}
		
		
	}

}
