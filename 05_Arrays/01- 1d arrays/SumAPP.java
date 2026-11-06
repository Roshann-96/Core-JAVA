
import java.util.*;
public class SumAPP
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		
		int a[] = new int[6];
		
		System.out.printf("Enter 5 digits array only: ");
		
		for(int i=1; i<a.length; i++)
		{
			a[i] = xyz.nextInt();
		}
		
		System.out.print("\n Entered array is: ");
		
		int sum = 0;
		for(int i=1; i<a.length; i++)
		{
			sum = sum + a[i];
			System.out.printf(" %d ",a[i]);
		}
		System.out.printf("\n Sum is: %d",sum);
			
	}
}