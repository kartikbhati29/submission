package Sorting;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class practice {
	
	public void check(String s) 
	{

		String str = s ;
		
		char[] ch = str.toCharArray();
		
		
		 Map<Character, Integer> map = new HashMap<Character,Integer>();
		 int count = 0 ;
	     for(char c : ch) 
	     {
	    	 
	         if(map.containsKey(c)) {
	            count++ ; 
	             map.put(c,map.get(c)+1);
	         } else {
	             map.put(c, 1);
	         }
	     }
	     
	     System.out.println(ch.length - count);
		
	}
	

public static void main(String[] args) {
	System.out.println("Enter the string to find smallest substring with max numbers of Distinct characters ");
    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();
	practice p = new practice();
	
	p.check(s);

}
}
