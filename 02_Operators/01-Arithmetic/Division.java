import java.util.*;
public class Division
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		
		int a, b ,div;
		
		System.out.println("Enter 1st value: ");
		a = xyz.nextInt();
		
		System.out.println("Enter 2nd value: ");
		b = xyz.nextInt();
		
		div = a / b;
		
		System.out.printf("%d or %d  Div is : %d   ",a ,b, div);
	}
}
