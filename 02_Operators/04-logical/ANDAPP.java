import java.util.*;
public class ANDAPP
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		
		int a ,b,c;
		
		System.out.print("Enter 1st value: ");
		a = xyz.nextInt();
		
		System.out.print("Enter 2nd value: ");
		b = xyz.nextInt();
		
		System.out.print("Enter 3rd value: ");
		c = xyz.nextInt();
		
		if( a>b && a>c)
		{
			System.out.printf("%d is greater than %d and %d \n", a,b,c);
		}
		if( b>a && b>c){
				System.out.printf("%d is greater than %d and %d \n",b,a,c);
		}
		if( c>a && c>b){
			System.out.printf("%d is greater than %d and %d",c,a,b);
		}
	}
}