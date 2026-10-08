import java.util.*;
public class PositiveNum
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		
		int p;
		System.out.println("Enter your number: ");
		p = xyz.nextInt();
		
		if( p > 0)
		{
			System.out.println("Positive Number");
		}
	}
}
