package collection;

import java.util.ArrayList;
import java.util.List;

public class Demo {

	public static void main(String[] args) {
		//List - Parent, ArrayList - Child
		//<>  diamond braces -> generics - It determines which type of element is to be added in collection.
		
		//with generic [With dimaond braces]
 		List<String> l = new ArrayList<String> ();
 		l.add("abc");
 		l.add("Pqr");
 		l.add("xyz");
 		//l.add(123);   -> not allowed
		System.out.println(l.toString());
		
		
	//convert every element in list 'l' to upper case.
	//to achieve this we need to take out every element one by one.
	// for loop ->>> iteratio - means take out an element from collection
		
		
		//for-each loop  value - reference var
		
		for(String v :l) {
			System.out.println("Using for each loop : " +v.toUpperCase());
			
		}
		
		//without generics
		List la = new ArrayList();
		la.add("Pune");
		la.add(1234);
		la.add(false);
		
		System.out.println(la.toString());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
  //collections - gr of entities or elements of datatype
  //Array - storing elements
  //hierachy of collection
	
  //TODO-
  // List , set and Map[Tyeps]
  // ways to insert and iterate elements
  // java 8 - Lambda function 
		
  //Prerequisite
  //cocept need for coll - oops, inheritance,abstraction
		
	// List - array list, linked list

	}

}
