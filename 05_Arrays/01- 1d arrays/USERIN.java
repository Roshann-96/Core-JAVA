import java.util.*;
public class USERIN
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in );
		int a[] = new int [5];
		
		System.out.print(" Enter arrays 5 nums : ");
		
		for(int i=0; i<a.length; i++)
		{
			a[i] = xyz.nextInt();
		}
		System.out.print(" Entered Array is :  ");
		for(int i=0; i<a.length; i++)
		{
			System.out.printf(" %d ",a[i] );
		}
		
	}

}