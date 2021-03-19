
/**
 * Name: Swetlana Kumari
 * Description:program to get the list of products with duplicate values.
 * Date:19/03/2021 
 */
import java.util.ArrayList;
import java.util.Scanner;

public class DuplicateValue {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the number");
		int num = sc.nextInt();
		
		
		int arr[]= new int[num];
		for(int i=0;i<num;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		//int a[]= {1,2,3,4,1,2,3,5};
		for(int j=0;j<num;j++) {
			for(int k=j+1;k<num;k++) {
				if(arr[j]==arr[k]) {
					System.out.print(arr[k]);
				}
			}
		}
	 
}
}