
import java.util.*;
public class OddNums
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		
		int n;
		
		System.out.print("Enter a number: ");
		n = xyz.nextInt();
		
		String str = (n % 2 == 0) ? "Even" : "Odd";
		
		System.out.printf("%d is %s", n , str);
	}
}