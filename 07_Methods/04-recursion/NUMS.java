public class NUMS
{
	public static void main(String x[])
	{
		show(5);
	}
	public static void show(int n )
	{
		if( n==0 )
		{
			return;
		}
		show( n-1 );
		System.out.println( n );
	}
}