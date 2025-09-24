package homeWorkCollection;
//7 Write a program to find the size of an ArrayList after adding 5 elements

import java.util.ArrayList;
import java.util.List;

public class Que7 {

	public static void main(String[] args) {
		List<String> l = new ArrayList<String>();
		
		l.add("Ram");
		l.add("Sham");
		l.add("Riya");
		l.add("Sita");
		l.add("Gita");
		
		System.out.println("ArrayList : " + l);
		
		int size = l.size();
		
		System.out.println("Size of ArrayList after add 5 elements : " + size);
		
	}

}
