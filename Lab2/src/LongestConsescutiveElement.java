
/**
 * Name: Swetlana Kumari
 * Description:find the length of the longest consecutive elements sequence from a 
               given unsorted array of integers.
 * Date:19/03/2021 
 */
import java.util.HashSet;

public class LongestConsescutiveElement{
	
	public static void main(String[] args)
	{
		int a[]= {49,1,3,200,2,4,70,5};
		HashSet<Integer> hs = new HashSet<>();
		for(int i=0;i<a.length;i++)
		{
			hs.add(a[i]);//49,1,3,200,2,4,70,5
		}
		int length=0;
		for(int i=0;i<a.length;i++)
			
		{
			if(!hs.contains(a[i]-1))
			{
				int no=a[i];
				
				while(hs.contains(no))
				{
					no++;
				}
				if(length<no-a[i])
						{
					length=no-a[i];
						}
				
			
			}
			
			
		}
		System.out.println("longest sequence length is:"+length);
		
		
		
	}
	
}