import java.util.*;
public class Reverse
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		
		int n,rev ,rem ;
		
		System.out.print("Enter reverse num: ");
		n = xyz.nextInt();
		
		rev = 0;
		
		while( n > 0)    
		{
			
			rem = n % 10;
			rev = rev * 10 + rem ;  
			n = n / 10;    
			
		}
		
		System.out.printf(" Reverse is: %d ", rev);
		
	}
}