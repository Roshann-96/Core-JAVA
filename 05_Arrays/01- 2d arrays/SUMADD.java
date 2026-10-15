import java.util.*;
public class SUMADD
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		
		int a[][] = new int[3][3];
		int b[][] = new int[3][3];
		int c[][] = new int[3][3];
		
		System.out.println("Enter first Array: ");
		for(int i=0; i<a.length; i++)
		{
			for(int j=0; j<a[i].length; j++)
			{
				a[i][j]= xyz.nextInt();
			}
		}
		System.out.println("Enter second Array: ");
		for(int i=0; i<b.length; i++)
		{
			for(int j=0; j<b[i].length; j++)
			{
				b[i][j]= xyz.nextInt();
			}
		}
		
		System.out.print("\n");
		
		System.out.println("First Array: ");
		for(int i=0; i<a.length; i++)
		{
			for(int j=0; j<a[i].length; j++)
			{
				System.out.printf("%d ",a[i][j]);
			}
			System.out.printf("\n");
		}
		System.out.println("Second Array: ");
		for(int i=0; i<b.length; i++)
		{
			for(int j=0; j<b[i].length; j++)
			{
				System.out.printf("%d ",b[i][j]);
			}
			System.out.print("\n");
		}
		
		System.out.println("Display sum array: ");
		for(int i=0; i<a.length; i++)
		{
			for(int j=0; j<a[i].length; j++)
			{
				c[i][j] = a[i][j] + b[i][j];
				System.out.printf(" %d ", c[i][j]);
			}
			System.out.print("\n");
		}
			
		
	}
}