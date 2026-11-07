
import java.util.*;
public class SortArray
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		
		int a[] = new int[10];
		
		System.out.print("Enter value in Array: ");
		for(int i=0; i<a.length; i++)
		{
			a[i] = xyz.nextInt();
		}
		
		Arrays.sort(a);
		
		System.out.print("Display array after sorting: ");
		for(int i=0; i<a.length; i++)
		{
			System.out.printf("%d ",a[i]);
		}
	}
}