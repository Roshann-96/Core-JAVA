import java.util.*;
public class AAPP
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		
		int a[] = new int[6];
		System.out.println("Enter value in array: ");
		
		for(int i=0; i<a.length; i++)
		{
			a[i] = xyz.nextInt();
		}
		System.out.print("Entered values : ");
		for(int i=0; i<a.length; i++)
		{
			System.out.printf(" %d ",a[i]);
		}
	}
}