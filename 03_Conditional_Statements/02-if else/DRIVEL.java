import java.util.*;
public class DRIVEL
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		
		int age;
		System.out.print("Enter your age: ");
		age = xyz.nextInt();
		
		if( age >= 18)
		{
			System.out.print("Eligible");
		}
		else{
			System.out.print("Not Eligible");
		}
	}
}