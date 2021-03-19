/**
 * Name: Swetlana Kumari
 * Description: create the mirror image of a String.
 * Date:19/03/2021 
 */
public class Mirror {

	public static void main(String[] args) {

		String str="EARTH";
		System.out.print(str+"|");
		rev(str);
		
	}

	public static void rev(String str) {
		
		for(int i=str.length()-1;i>=0;i--)
		{
			char ch = str.charAt(i);
			System.out.print(ch);
		}
		
		
	}
}