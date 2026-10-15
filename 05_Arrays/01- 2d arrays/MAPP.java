 import java.util.*;
 public class MAPP
 {
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		
		int a[][] = new int[3][3];
		
		System.out.print("Enter value in Array: ");
		for(int i=0; i<a.length; i++)
		{
			for(int j=0; j<a[i].length; j++)
			{
				a[i][j] = xyz.nextInt();
			}
		}
		System.out.println("Display Matrix: ");
		for(int i=0; i<a.length; i++)
		{
			for(int j=0; j<a[i].length; j++)
			{
				System.out.printf(" %d",a[i][j]);
			}
			System.out.print("\n");
		}
	}
 }