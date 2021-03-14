/**
*Name: Swetlana Kumari
*Description: Traffic control using Switch Statement
*Date:13/03/2021
*/
import java.util.Scanner;
class TrafficSwitch{
public static void main(String[] args){
	
	System.out.println("1. Red");
	System.out.println("2. Green");
	System.out.println("3. Yellow"); 
	
	System.out.print("Enter option:");
	
	Scanner sc= new Scanner(System.in);
	int n=sc.nextInt();
	
	switch (n)
	{
	case 1:
	System.out.println("Stop");
	break;
	case 2:
	System.out.println("Go");
	break;
	
	case 3:
	System.out.println("Ready");
	break;
	
	}
	if(n>3)
	{
		System.out.println("Invalid Number");
	}
	
}
}
	