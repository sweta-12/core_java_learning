/**
*Name: Swetlana Kumari
*Description: accept the value of money and convert to rupees;
*Date:12/03/2021
*/

class reverse{

public static void main(String[] args){

int n=1234;
int temp;
int rev=0;

while(n>0){

temp=n%10;
rev=rev*10+temp;
n=n/10;
}

System.out.println("reverse is:"+rev);
}
}