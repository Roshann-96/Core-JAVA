import java.util.*;
public class SAPP
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		
		int a,b,choice;
		
		System.out.print("Enter 1st num: ");
		a = xyz.nextInt();
		
		System.out.print("Enter 2nd num: ");
		b = xyz.nextInt();
		
		System.out.print("Enter your choice: ");
		choice = xyz.nextInt();
		
		switch(choice)
		{
			case 1:
				System.out.printf("%d or %d addi is: %d ",a,b,a+b);
				break;
				
			case 2:
				System.out.printf("%d or %d mulply is: %d",a,b,a*b);
				break;
				
			case 3:
				System.out.printf("%d or %d division is: %d",a,b,a/b);
				break;
				
			default:
				System.out.print("wrong choice");
		}
	}
}