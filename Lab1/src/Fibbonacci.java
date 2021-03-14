/**
*Name: Swetlana Kumari
*Description: fibbonacci series
*Date:13/03/2021
*/

import java.util.Scanner;
class Fibbonacci{
public static void main(String[] args){
	
System.out.print("Enter the number upto where you want to see series: ");

Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int a=0,b=1;

System.out.print(a+" "+b);





for(int i=2;i<n;i++){
int c=a+b;

System.out.print(" "+c);
a=b;
b=c;
}


}



}