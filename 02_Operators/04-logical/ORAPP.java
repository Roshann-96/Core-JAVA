
import java.util.*;
public class ORAPP
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		
		int a,b;
		
		System.out.print("Enter a num: ");
		a = xyz.nextInt();
		
		
		if( a > 15 || a % 2 == 0 )
		{
			System.out.println("True");
		}
		else
		{
			System.out.print("False");
		}
		
	}
}