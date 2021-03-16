
/*
 * Name: Swetlana Kumari
 * Description:Write your logic here so that the output should be in reverse order. It should be displayed as
		 * Friends Dear My Hello.
		 * You need to reverse the String word by word. 
		 * Limitation :  Do not use the reverse method
 * Date:15/03/2021
 */
class StringAssignment1 { 

	public static void main(String[] args) 
	{ 
		String str[] = "Hello My Dear Friends".split(" "); 
		//String st="Hello My Dear Friends";
		//String str[]=st.split("");
		
    String result = reverse(str);
		System.out.println(result); 
	}

  public static String reverse(String[] str)
  {
    String result = "";

		for (int i = str.length - 1; i >= 0; i--) { 
			result = result + str[i] + " "; 
		}
    
    return result;
  }
} 
