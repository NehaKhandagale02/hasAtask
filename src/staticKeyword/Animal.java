package staticKeyword;

//The keyword static means belonging to the class, not to any specific object.
//Static members (variables or methods) can be accessed directly using the class name, without creating an object.

//public class Animal {
//	
//// static block
//	static {
//		System.out.println("Static Block");
//	}
//	static int age = 23;
//	
//	public static void printName() {
//		System.out.println("Tiger");
//	}
//
//}



public class Animal{
	static int age = 12;
	
	static {
		System.out.println("Static Block");
	}
	
	public Animal() {
		System.out.println("Constructor");
	}
}