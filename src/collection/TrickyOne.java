package collection;

import java.util.ArrayList;
import java.util.List;

// Store even numbers from 1 to 20 in a list and print using for each loop.

public class TrickyOne {
	
	public static void main(String[] args) {
		//no - 1 to 20
		//filter even no
		//store even no
		//print list
		
		
		List<Integer> evenNoList = new ArrayList<Integer>();
		for(int i = 1; i<=20; i++) {
			if(i % 2 ==0) {
				System.out.println(i);
				//every i is even no and need to add it in a list  
				evenNoList.add(i);
				
				
			}
		}
		
		for(int x : evenNoList) {
			System.out.println(x);
		}
			
	}

}
