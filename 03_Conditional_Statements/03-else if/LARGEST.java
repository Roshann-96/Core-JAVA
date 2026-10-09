import java.util.*;
public class LARGEST
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		
		int a,b,c;
		
		System.out.print("Enter 1st num: ");
		a = xyz.nextInt();
		
		System.out.print("Enter 2nd num: ");
		b =xyz.nextInt();
		
		System.out.print("Enter 3rd num: ");
		c = xyz.nextInt();
		
		if( a > b && a > c )
		{
			System.out.printf(" %d is largest number",a);
		}
		else if( b > a && b > c)
		{
			System.out.printf(" %d is largest number",b);
		}
		else
		{
			System.out.printf(" %d is largest number",c);
		}	
	}
		
}