/**
*Name: Swetlana Kumari
*Description: PrimeNumber series
*Date:13/03/2021
*/
 
import java.util.Scanner;
public class PrimeNumber {

	public static void main(String[] args)
	{
		
		System.out.println("enter any number to check whether it is prime or not:");
		Scanner Sc=new Scanner(System.in);
		int a = Sc.nextInt();
		int b = Sc.nextInt();
		int i;
		int n;
		for(n=a+1;n<=b-1;n++)
		{
			for(i=2;i<=n-1;i++)
			{
				if(n%i==0)
				{
					break;
				}
				
			}
			
			if(n==i)
			{
				System.out.println(n);
			}
			
		}
	}

}