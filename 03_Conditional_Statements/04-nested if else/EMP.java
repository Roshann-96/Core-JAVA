import java.util.*;
public class EMP
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		
		int id,sal;
		
		System.out.print("Enter employee id: ");
		id = xyz.nextInt();
		
		if( id >= 1 && id <= 1000 )
		{
			System.out.print("Enter salary of employee: ");
			sal = xyz.nextInt();
			
			if( sal > 30000)
			{
				sal = sal-(( sal * 10)/ 100);
			}
			else{
				sal = sal -(( sal * 5)/ 100);
			}
			System.out.printf("Salary After PF Deduction: %d",sal);
		}
		else{
			System.out.print("Candidate is not employee sorry");
		}	
	}
}