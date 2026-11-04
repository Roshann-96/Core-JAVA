
import java.util.*;
public class MergedArray
{	
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		
		int a[] = new int[5];
		int b[] = new int[5];
		int c[] = new int[a.length + b.length];
		
		System.out.print("Enter first array: ");
		
		for(int i=0; i<a.length; i++)
		{
			a[i] = xyz.nextInt();
		}
		
		System.out.print("Enter second array: ");
		
		for(int i=0; i<b.length; i++)
		{
			b[i] = xyz.nextInt();
		}
		for(int i=0, k=a.length; i<a.length; i++, k++)
		{
			
			c[i] = a[i];
			c[k] = b[i];
		}
		System.out.print("\nDisplay merged array: ");
		
		for(int i=0; i<c.length; i++)
		{
			System.out.printf("%d ",c[i]);
		}
	}
}