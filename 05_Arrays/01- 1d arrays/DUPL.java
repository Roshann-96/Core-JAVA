import java.util.*;
public class DUPL
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		
		int a[] = new int[5];
		System.out.print("Enter a arrays: ");
		
		for(int i=0; i<a.length; i++)
		{
			a[i] = xyz.nextInt();
		
		}
		boolean flag = false;
		
		for(int i=0; i<a.length; i++)
		{
			for(int j=(i+1); j<a.length;j++)
			{
				if( (a[i] == a[j]) )
				{
					System.out.printf("%d or %d \n" , a[i],a[j]);
					
					flag = true;
					break;
				}
				
			}	
		}
		if(flag)
		{
			System.out.print("Duplicate is found");
		}
		else
		{
			System.out.print("Duplicate is not found");
		}
	}
}