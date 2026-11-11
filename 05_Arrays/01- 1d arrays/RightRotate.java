public class RightRotate
{
	public static void main( String x[] )
	{
		int a[] = {10,20,30,40,50};
		int temp = a[4];
		
		for(int i=a.length-1; i>0; i--)
		{
			a[i] = a[i-1];
		}
		a[0] = temp;
		
		for(int i=0; i<a.length; i++)
		{
			System.out.printf("%d ",a[i] );
		}
	}
}