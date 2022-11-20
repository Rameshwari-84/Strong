package all_program;

public class PracProg 
{
	public static void main (String []args)
	{
		String a= "Rameshwari";
		System.out.println(a.length());
		
		for(int b=a.length()-1; b>=0; b--)
		{
			System.out.print(a.charAt(b));
		}
	}

}
