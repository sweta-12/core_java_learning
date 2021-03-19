/**
 * Name: Swetlana Kumari
 * Description:Take 20 integer inputs from user and print the following:
			1. number of positive numbers
			2. number of negative numbers
			3. number of odd numbers
			4. number of even numbers
			5. number of 0s.
 * Date:19/03/2021 
 */
import java.util.Scanner;

public class Number {

	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		int [] z=new int[20];
		int positive=0;
		int negative=0;
		int odd=0;
		int even=0;
		int zero=0;
		
		 
		System.out.print("write 20 numbers:");
		
		for(int i=0;i<z.length;i++)
		{
//			System.out.println("print the value of z["+i+"]");
			//System.out.println(z[i]);
			
			z[i]=sc.nextInt();
			
			if(z[i]>0)
			{
				positive++;
			}
			else if(z[i]<0)
			{
				negative++;
			}
			else
			{
				zero++;
			}
			
			if(z[i]%2==0)
			{
				even++;
			}
			else
			{
				odd++;
			}
			
		}
		
	
		System.out.println("positive: "+positive+"\n Negative: "+negative+"\n Zero: "+zero+"\n even: "+even+"\n odd: "+odd);
		

	}

}
