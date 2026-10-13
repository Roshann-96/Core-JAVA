public class SECLARGE
{
	public static void main(String x[])
	{
		int a[] = new int[]	{12,45,23,67,34,56};
		
		System.out.println("Array is: ");
		for(int i=0; i<a.length; i++)
		{
			System.out.printf("%d ",a[i]);
		}
		int largest = 0;
		int sec = 0;
		System.out.println("Second Largest : ");
		for(int i=0; i<a.length; i++)
		{
			if( a[i] > largest )
			{
				sec = largest;
				largest = a[i];
			}
			else if( a[i] < largest && a[i] > sec )
			{
				sec = a[i];
			}
			
		}
		System.out.printf("Second Largest is:- %d ",sec );
		
	}
}