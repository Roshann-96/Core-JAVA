import java.util.*;
public class DSUM
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		
		int a[][] = new int[3][3];
		
		System.out.println("Enter Array");
		for(int i=0; i<a.length; i++)
		{
			for(int j=0; j<a[i].length; j++)
			{
				a[i][j] = xyz.nextInt();
			}
		}
		System.out.println("Array is : ");
		for(int i=0; i<a.length; i++)
		{
			for(int j=0; j<a[i].length; j++)
			{
				System.out.printf("%d ",a[i][j] );
			}
			System.out.print("\n");
		}
		
		int sum = 0;
		for(int i=0; i<a.length; i++)
		{
			sum = sum + a[i][i];
		}
		System.out.printf("Diagonal Sum is: %d ",sum );
	}
}