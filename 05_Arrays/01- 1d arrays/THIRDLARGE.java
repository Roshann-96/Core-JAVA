public class THIRDLARGE
{
	public static void main( String x[] )
	{
		int a[] = { 10,50,30,80,20,60 };
		int large = 0;
		int sec = 0;
		int third = 0;
		
		for(int i=0; i<a.length; i++)
		{
			if( a[i] > large )
			{
				third = sec;
				sec = large;
				large = a[i];
			}
			else if( a[i] > sec && a[i] < large )
			{
				third = sec;
				sec = a[i];
			}
		}
		System.out.printf("Third Laragest: %d ", third );
	}
}