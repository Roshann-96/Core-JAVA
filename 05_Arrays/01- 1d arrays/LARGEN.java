public class LARGEN
{
	public static void main(String x[])
	{
		int a[] = new int[] {87,45,72,18,90,76};
		
		int large = 0;
		for(int i=0; i<a.length; i++)
		{
			if(large < a[i] )
			{
				large = a[i];
			}	
		}
		System.out.printf("Large Number is:- %d ",large );
	}
}