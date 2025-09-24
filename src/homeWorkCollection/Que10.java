package homeWorkCollection;
// 10. Write a program to clear all elements from an ArrayList and check if it is empty

import java.util.ArrayList;
import java.util.List;

public class Que10 {

	public static void main(String[] args) {
		List<String> l = new ArrayList<String>();
		
		l.add("Ram");
		l.add("Sham");
		l.add("Sita");
		l.add("Gita");
		
		System.out.println("ArrayList : " + l);
		
		l.clear();
		
		System.out.println("ArrayList after clear " + l);
		
		if(l.isEmpty()) {
			System.out.println("ArrayList is empty ");
		}
		else {
			System.out.println("ArrayList is not empty");
		}
	}

}
