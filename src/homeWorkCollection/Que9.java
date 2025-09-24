package homeWorkCollection;

import java.util.ArrayList;
import java.util.List;

// 9. Write a program to iterate over an ArrayList using for loop and print all elements
public class Que9 {

	public static void main(String[] args) {
		List<String> l = new ArrayList<String>();
		
		l.add("Ram");
		l.add("Sham");
		l.add("Sita");
		l.add("Gita");
		
		System.out.println("Elements in List : ");
		
		for(int i = 0; i< l.size(); i++) {
			System.out.println(l.get(i));
		}

	}

}
