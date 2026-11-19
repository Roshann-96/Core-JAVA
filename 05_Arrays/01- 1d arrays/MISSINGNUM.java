public class MISSINGNUM
{
	public static void main(String x[] )
	{
		int a[] = { 1,2,3,5,6};
		int sum = 0;
		for(int i=0; i<a.length; i++)
		{	
			sum = sum + a[i];
		}
		int n = 6; //array add total ;
		int total = n*(n+1) / 2;
		int missing = sum - total ;

		System.out.printf("Missing Num: %d ",missing );
	}
}