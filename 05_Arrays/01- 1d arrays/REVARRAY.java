import java.util.*;
public class REVARRAY
{
	public static void main(String x[])
	{
		Scanner xyz =new Scanner(System.in);
		
		int a[] = new int[5];
		System.out.println("Enter Array 5 value: ");
		for(int i=0; i<a.length; i++)
		{
			a[i] = xyz.nextInt();
			
		}
	
		System.out.print("\nAfter Reverse Array : ");
		for(int i=a.length -1; i>=0; i--)
		{
			System.out.printf("%d ",a[i] );
		}
		
	}
}