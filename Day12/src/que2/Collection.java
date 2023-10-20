package que2;
import java.util.*;

public class Collection 
{
	
	public static void main(String[] args) 
	{
		
		
		class StringComparator implements Comparator<String>
		{
			public int compare (String s1, String s2)
			{
				int diff = s1.length() - s2.length();
				if (diff == 0)
				{
					diff = s1.compareTo(s2);
				
				}
				
				return diff;
			}
			
		}
		
		StringComparator s3 = new StringComparator();
		
		List<String> s1 = new ArrayList<>();
		s1.add("Shubham");
		s1.add("Aniket");
		s1.add("Suresh");
		s1.add("Mahesh");
		s1.add("Sneha");
		
		System.out.println(Collections.max(s1, s3));
		
	}

}
