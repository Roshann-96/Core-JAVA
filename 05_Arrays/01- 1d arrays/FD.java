public class FD
{
	public static void main(String x[])
	{
		int a[] = {10,20,30,40,20,10,50};
		
		System.out.printf("Duplicate Elements: ");
		int dup = 0;
		
		for(int i=0; i<a.length; i++)
		{
			for(int j=i+1; j<a.length; j++)
			{
				
				if( a[i] == a[j] )
				{
					dup = a[j];
					
					System.out.printf(" %d ",dup );
				}
			}
		
		}
	}
}