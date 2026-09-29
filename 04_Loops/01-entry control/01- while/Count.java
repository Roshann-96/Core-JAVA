import java.util.*;
public class Count
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		
		int n, count = 0;
		
		System.out.print("Enter nums: ");
		n = xyz.nextInt();
		
		
		while( 0 < n )
		{
			n = n / 10;
			count++;
	
		}
		System.out.printf("Count is: %d",count);
	}
}