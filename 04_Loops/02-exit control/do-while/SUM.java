public class SUM
{
	public static void main(String x[])
	{
		int n = 1;
		int sum = 0;
		
		do{
			sum = sum + n;
			n++;
		}
		while( n <= 10);
		System.out.printf("Sum is: %d",sum);
	}
}