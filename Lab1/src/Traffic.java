/**
*Name: Swetlana Kumari
*Description: Traffic control
*Date:13/03/2021
*/
import java.util.Scanner;
class Traffic{
public static void main(String[] args){
	
	System.out.println("1. Red");
	System.out.println("2. Green");
	System.out.println("3. Yellow"); 
	
	System.out.print("Enter option:");
	
	Scanner sc= new Scanner(System.in);
	int n=sc.nextInt();
	
	if(n ==1){
		System.out.println("Stop");
	}
	else if(n == 2){
		System.out.println("Go");
	}
	else{
		System.out.println("Ready");
	}
	
}

}