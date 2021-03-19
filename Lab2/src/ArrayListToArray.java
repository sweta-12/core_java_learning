/**
 * Name: Swetlana Kumari
 * Description:Convert ArrayList to array.
 * Date:19/03/2021 
 */
import java.io.*; 
import java.util.List; 
import java.util.ArrayList; 
  
public class ArrayListToArray { 
    public static void main(String[] args) 
    { 
        List<Integer> list = new ArrayList<>(); 
        list.add(10); 
        list.add(20); 
        list.add(30); 
        list.add(40); 
  
        
        Object[] objects= list.toArray();
        for(Object values:objects)
        {
        	System.out.print(values+"  ");
        }
        
        
        
    } 
}