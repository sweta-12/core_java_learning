/**
 * Name: Swetlana Kumari
 * Description:method which accepts an array of integer elements and return the second smallest 
				element in the array. 
 * Date:19/03/2021 
 */
public class SmallestNumber {
	
	public static void main(String[] args) {
			
			int arr[]= {49,1,3,200,2,4,70,5};
			System.out.print("Elements are:");
			number(arr);
			
			System.out.println("\nSecond smallest number is: " +arr[1]);
			
		}

		private static void number(int[] arr) {
			
			
			
			int temp=0;
				for(int i=0;i<arr.length;i++)
				{
					for(int j=0;j<arr.length-1-i;j++)
					{
						if(arr[j]>arr[j+1])
						{
						temp=arr[j];
						arr[j]=arr[j+1];
						arr[j+1]=temp;
						}
					}
				
				}

			for(int i=0;i<arr.length;i++)				
				{
								System.out.print(arr[i]+" ");				
			}			
		}

	}



