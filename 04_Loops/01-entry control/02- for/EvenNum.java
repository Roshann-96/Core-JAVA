
import java.util.*;
public class EvenNum
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
	
		int n;
	
		System.out.print("\nEnter a nums: ");
		n = xyz.nextInt();
	
		int count=0;
		
		System.out.printf("Even numbers are: ");
		for(int i=1; i<=n; i++)
		{	
			
			if( i % 2 == 0)
			{
				count++;
				System.out.printf(" %d ", i);
			}
			
		}
		System.out.printf("\nEven numbers count = %d", count);
		
		
	}
}