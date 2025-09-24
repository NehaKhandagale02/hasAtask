package homeWorkCollection;

import java.util.ArrayList;
import java.util.List;

// 4.Write a program to get the element at index 2 from an ArrayList

public class Que4 {

	public static void main(String[] args) {
		List<String> l = new ArrayList<String>();
		
		l.add("Ram");
		l.add("Sham");
		l.add("Gita");
		l.add("Sita");
		
		System.out.println("ArrayList : " + l);
		
		//l.add(2, "Raj");
		String element = l.get(2);
		
		System.out.println("Index 2 : " + element);
		
		
		

	}

}
