/**
*Name: Swetlana Kumari
*Description: sum of digits
*Date:12/03/2021
*/

class sumofdigits{
	
	public static void main(String[] args){
		
		int n=162;
		int sum=0;
		int rem;
		
		while(n>0){
		
		rem=n%10;
		sum=sum+rem;
		n=n/10;
		
		}
		System.out.println("Sum of digits is:"+sum);
	
	}
}
