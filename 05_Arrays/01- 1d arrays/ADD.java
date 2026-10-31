import java.util.*;
public class ADD
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		
		int a[] = new int[5];
		System.out.print("Enter value in array: ");
		
		for(int i=0; i<a.length; i++)
		{
			a[i] = xyz.nextInt();
		}
		System.out.print("Enter target value: ");
		int target= xyz.nextInt();
		
		System.out.print("Display array value: ");
		
		for(int i=0; i<a.length; i++)
		{
			System.out.printf(" %d ", a[i]);
		}
		
		boolean flag =false;
		
		for(int i=0; i<a.length; i++)
		{
			for(int j=(i+1); j<a.length; j++)
			{
				if( a[i] + a[j] == target)
				{
					System.out.printf("  index Num: (%d,%d) ",i,j);
					
					flag = true;
					break;
				}
			}
		}
		if(flag)
		{
			System.out.println("Pair is found");
		}
		else{
			System.out.print("Pair not found");
		}	
		
	}
}