
/**
 * Name: Swetlana Kumari
 * Description::Write a program to get the sorted list of Products name.
 * Date:19/03/2021 
 */
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import java.util.stream.Collectors;

public class SortedListOfProductName {

	public static void main(String[] args) {
		
	   List<String>list=Arrays.asList("swetlana","tanya","sikku","apple");
	   //List<String>Sortedlist=list.stream().sorted().collect(Collectors.toList());
	    Collections.sort(list);
	    System.out.println(list);
		
				
		
	}
}
