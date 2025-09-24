package homeWorkCollection;

import java.util.ArrayList;
import java.util.List;

// 8. Write a program to check whether an element exists in an ArrayList or not. (Example: check if "Sita" is present).
public class Que8 {

	public static void main(String[] args) {
		List<String> l = new ArrayList<String>();
		
		l.add("Ram");
		l.add("Sham");
		l.add("Sita");
		l.add("Gita");
		
		if(l.contains("Sita")) {
			System.out.println("Sita is present");
		}
		else {
			System.out.println("Sita is not present");
		}
		

	}

}
