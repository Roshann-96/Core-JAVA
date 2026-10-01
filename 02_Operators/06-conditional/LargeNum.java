
import java.util.*;
public class LargeNum
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		
		int a;
		System.out.print("Enter 1st num: ");
		a = xyz.nextInt();
		
		int b;
		System.out.print("Enter 2nd num: ");
		b = xyz.nextInt();
		
		int largest = ( a > b) ? a : b;
		
		System.out.printf("Largest element is: %d",largest);
	}
}