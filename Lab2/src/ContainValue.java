/**
 * Name: Swetlana Kumari
 * Description:program to test if an array contains a specific value.
 * Date:19/03/2021 
 */
import java.util.Scanner;

public class ContainValue {

	public static void main(String[] args) {
		
		int arr[]= {1,2,3,4,5,7,9};
		
		Scanner sc=new Scanner(System.in);
		System.out.print("enter number to be found:");
		
		int num=sc.nextInt();
		for(int i=0;i<arr.length-1;i++)
		{
			if(arr[i]==num) {
				System.out.println("value present ");
			}
			
		}
		

	}

}
