public class TB
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
		System.out.println( n );
		show( n-1 );
	}
}