public class SECL
{
	public static void main(String x[])
	{
		int a[] = {12,45,23,67,34,56,89};

		int large = 0;
		int sec = 0;
		for(int i=0; i<a.length; i++) 
		{
			if( a[i] > large )
			{
				sec = large;
				large = a[i];
			}
		}
		
		System.out.printf("%d ", temp );
	}
}