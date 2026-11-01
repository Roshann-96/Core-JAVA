import java.util.*;
public class LCAPP
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		int no;
		
		System.out.printf("Enter table num: ");
		no = xyz.nextInt();
		
		show( no,0 );
		
	}
	public static void show(int x, int count )
	{
		++count;
		
		if( count > 10 )
		{
			return;
		}
		else{
			System.out.printf(" %d\n", x*count );
			
			show(x ,count );
		}
	}
}



