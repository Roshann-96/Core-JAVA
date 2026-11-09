public class SEC
{
	// SEClARGE-NUM
	public static void main ( String x[])
	{
		int a[] = {10,20,30,40,50};
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
		System.out.printf("Sec large num: %d ",sec );
	}
}