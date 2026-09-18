
import java.util.*;
public class REMINDER
{
	public static void main(String x[])
	{ 	
		Scanner xyz = new Scanner(System.in);
		
		int a , b ,c;
		System.out.printf("Enter 1st value: ");
		a = xyz.nextInt();
		
		System.out.printf("Enter 2nd value: ");
		b = xyz.nextInt();
		
		c = a % b;
		System.out.printf("Reminder is: %d ", c);
	}
}