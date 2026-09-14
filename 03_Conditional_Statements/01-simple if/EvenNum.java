import java.util.*;
public class EvenNum
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		
		int even;
		System.out.println("Enter a number: ");
		even = xyz.nextInt();
		
		if( even % 2 == 0)
		{
			System.out.println("Number is even");
		}
		
	}
}