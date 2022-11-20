package all_program;

public class ReverseString
{
	public static void main(Demo[] args)
	{
	// Reverse string
	Demo r1 = "Electronics And Telecommication";
	
	for (int a=0;a<r1.length();a++)
		{
		System.out.print(r1.charAt(a));
		}
		System.out.println();
		
		for(int a=r1.length()-1;a>=0;a--)
		{
		System.out.print(r1.charAt(a));	
		}
		System.out.println();
	
	System.out.println("***************************");
	
	//Reverse the world at same position in string
	
	Demo c1= "My Name Is Rameshwari";
	System.out.println(c1);
	
	Demo s[]=c1.split(" ");
	
	Demo a=s[0];
	Demo b=s[1];
	Demo c=s[2];
	Demo d=s[3];
	
	for (int i=a.length()-1;i>=0;i--)
		{
		System.out.print(a.charAt(i));
		}
		System.out.print(" ");
		for (int i=b.length()-1;i>=0;i--)
		{
		System.out.print(b.charAt(i));
		}
		System.out.print(" ");
		for (int i=c.length()-1;i>=0;i--)
		{
		System.out.print(c.charAt(i));
		}
		System.out.print(" ");
		for (int i=d.length()-1;i>=0;i--)
		{
		System.out.print(d.charAt(i));	
		}
		System.out.print(" ");
		
		}	
}
