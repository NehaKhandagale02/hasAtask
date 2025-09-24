package homeWorkCollection;

import java.util.ArrayList;
import java.util.List;

//6. Write a program to remove the element at index 0 from an ArrayList
public class Que6 {

	public static void main(String[] args) {
		List<String> l = new ArrayList<String>();
		
		l.add("Sham");
		l.add("Krishna");
		l.add("Sita");
		l.add("Gita");
		
		System.out.println("ArrayList : " + l);
		
		l.remove(0);
		
		System.out.println("Element at index 0 : " + l);
	}

}
