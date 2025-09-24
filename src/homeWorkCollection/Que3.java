package homeWorkCollection;

import java.util.ArrayList;
import java.util.List;

//3. Write a program to insert an element at the first position of an ArrayList.
public class Que3 {

	public static void main(String[] args) {
	       List<String> l = new ArrayList<String>();
	       
	       l.add("Sham");
	       l.add("Sita");
	       l.add("Gita");
	       
	       System.out.println("ArrayList : " + l);
	       
	       l.add(0, "Ram");
	       
	       System.out.println("After inserting at first position : " + l);
	}

}
