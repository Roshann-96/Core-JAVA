import java.util.*;
public class GRADE
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		
		int grade;
		
		System.out.print("Enter your grade: ");
		grade = xyz.nextInt();
		
		if( grade >=90 && grade <=100)
		{
			System.out.print(" Grade is : A ");
		}
		else if( grade >=75 && grade <= 89)
		{
			System.out.print(" Grade is : B");
		}
		else if( grade >=60 && grade <= 74)
		{
			System.out.print(" Grade is : C");
		}
		else if( grade >= 40 && grade <= 59)
		{
			System.out.print(" Grade is : D");
		}
		else{
			System.out.print(" Fail");
		
		}
	}
}