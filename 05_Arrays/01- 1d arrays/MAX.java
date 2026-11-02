import java.util.*;
public class MAX
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		
		int a[] = new int[6];
		
		System.out.println("Enter Array 6 value");
		for(int i=0; i<a.length; i++)
		{
			a[i] = xyz.nextInt();
		}
		
		int max =0;
		for(int i=0; i<a.length; i++)
		{
			if( max < a[i] )
			{
				max = a[i];
			}
		}
		System.out.printf("Max value is: %d ", max );
	}
}