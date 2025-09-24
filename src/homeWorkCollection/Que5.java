package homeWorkCollection;

import java.util.ArrayList;
import java.util.List;

//5. write a program to change the element at index 1 in an ArrayList

public class Que5 {

	public static void main(String[] args) {
		List<String> l = new ArrayList<String>();
		
		l.add("Ram");
		l.add("Sham");
		l.add("Gita");
		l.add("Sita");
		
		System.out.println("ArrayList : " + l);
		
		l.set(1, "Krishna");
		
		System.out.println("Element at index 1 : " + l);
		
		
		
	}

}
