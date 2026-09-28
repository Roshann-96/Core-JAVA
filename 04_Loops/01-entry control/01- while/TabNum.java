import java.util.*;
public class TabNum
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		
		int num,tab,i;
		
		System.out.print("Enter num of table: ");
		num = xyz.nextInt();
		
		i=1;
		while( i<= 10)
		{
			tab = num * i;
			
			i++;
			System.out.printf(" %d\n",tab);
		}
	}
}