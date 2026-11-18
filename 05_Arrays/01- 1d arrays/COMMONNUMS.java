public class COMMONNUMS
{
	public static void main(String x[] )
	{
		int a[] = { 10,20,30,40,50 };
		int b[] = { 20,40,60,80 };
		
		System.out.println("Common Element is: ");
		for(int i=0; i<a.length; i++)
		{
			for(int j=0; j<b.length; j++)
			{
				if( a[i] == b[j] )
				{
					//System.out.printf(" %d ",a[i] );
					System.out.println( a[i] );
				}
			}
		}
	}
}