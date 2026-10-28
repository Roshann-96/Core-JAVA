public class VOWELS
{
	public static void main(String x[])
	{
		String s = "Hi Java Learner ";
		String h = "Hi JAVA LEARNER ";
		
		int count = 0;
		int countt = 0;
		
		for(int i=0; i<s.length(); i++)
		{
			char ch = s.charAt(i);
			if(ch == 'a' || ch == 'e'
			|| ch == 'i' || ch == 'o' || ch == 'u' )
			{
			    count++;
			}
		}
		for(int i=0; i<h.length(); i++)
		{	
			char ch = h.charAt(i);
			if(ch == 'A' || ch == 'E' 
			|| ch == 'I' || ch == 'O' || ch == 'U' )
			{
				countt++;
			}
		
		}

		System.out.printf("Low vowels count is: %d\n",count );
		System.out.printf("Upp vowels count is: %d ",countt );
	}
}