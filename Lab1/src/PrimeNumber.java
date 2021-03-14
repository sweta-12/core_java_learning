/**
*Name: Swetlana Kumari
*Description: PrimeNumber series
*Date:13/03/2021
*/
 
import java.util.Scanner;
class PrimeNumber
{
	public static void main(String[] args) 
	{
		
		String primeNumbers="  ";
		int i=0;
		int num=0;
		
		System.out.println("Enter the from till you want to print from 1: ");
		
		Scanner Sc= new Scanner(System.in);
		int n= Sc.nextInt();
		 
		for(i=1;i<=n;i++)
		{
			int counter=0;
				for(num=i;num>=1;num--)
				{
					if(i%num==0)
					{
						counter=counter+1;
					}
		         }
		if(counter==2)
			{
				primeNumbers=primeNumbers + i +" ";
			}
	
		}
	System.out.println("prime numbers from 1 to n are: ");
	System.out.println(primeNumbers);

}
}