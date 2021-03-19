/**
 * Name: Swetlana Kumari
 * Description: Write a Java program that reads a line of integers and then displays each integer and the 
				sum of all integers.
* Date:19/03/2021 
 */
public class SumInteger {

	public static void main(String[] args) {
		String inStr = "5566";
		int number = Integer.parseInt(inStr);  
		System.out.println(number);
		int sum=0;
		
		while(number>0)
		{
			int rem=number%10;
			sum=sum+rem;
			number=number/10;
		}
		System.out.println("sum of number is:"+sum);
	}

}
