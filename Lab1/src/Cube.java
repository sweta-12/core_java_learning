/**
*Name: Swetlana Kumari
*Description: sum of cubes
*Date:13/03/2021
*/

import java.util.Scanner;
public class Cube {

public static void main(String[] args){
	
	
		System.out.print("Enter values:");
		Scanner SC= new Scanner(System.in);
		int n = SC.nextInt();
		
		
		int sum=0;
		int rem;
		
		while(n>0){
		
		rem=n%10;
		sum=sum+((rem*1)*(rem*1)*(rem*1));
		n=n/10;
		
		}
		System.out.println("Sum of digits is:"+sum);
	
	}
}
