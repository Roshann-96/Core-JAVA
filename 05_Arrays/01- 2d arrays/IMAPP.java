import java.util.*;
public class IMAPP
{
	public static void main(String x[])
	{
		int a[][] = new int[][]{
									{1,3,2},
									{5,4,6},
									{9,8,7},
								 };
	
		System.out.print("Display Matrix");   // display array
		for(int i=0; i<a.length; i++)
		{
			for(int j=0; j<a[i].length; j++)
			{
				System.out.printf("%d ",a[i][j]);
			}
			System.out.print("\n");
		}
		
		System.out.println("Display Sorted Matrix");  // sorted array
		for(int i=0; i<a.length; i++)
		{
			Arrays.sort(a[i]);
			
			for(int j=0; j<a[i].length; j++)
			{
				System.out.printf("%d ",a[i][j]);
				
			}
			System.out.print("\n");
		}
	}
}