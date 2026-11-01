import java.util.*;
public class CSUM
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		
		int a[][] = new int[3][3];
		
		System.out.println("Enter array : ");
		for(int i=0; i<a.length; i++)
		{
			for(int j=0; j<a[i].length; j++)
			{
				a[i][j] = xyz.nextInt();
			}
		}
		System.out.println(" ");
		System.out.println("Array is : ");
		for(int i=0; i<a.length; i++)
		{
			for(int j=0; j<a[i].length; j++)
			{
				System.out.printf("%d ",a[i][j] );
			}
			System.out.print("\n");
		}
		
		int sum[] = new int[3];
		for(int j=0; j<a.length; j++)
		{
			for(int i=0; i<a[j].length; i++)
			{
				sum[i] = sum[i] + a[j][i]; 
			}
		}
		for(int i=0; i<sum.length; i++)
		{
			System.out.printf("Column %d Sum = %d \n", i+1, sum[i] );
		}
		
		
	}
}