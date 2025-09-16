package overriding;

// overriding -  runtime polymorphism
public class Animal {
	
	public int number = 123;
	
	public void printColor() {
		System.out.println("Yeollow black Stripped");
	}
	
	public void Something() {
		System.out.println("Something method");
		System.out.println(this.number);
		this.printColor();
		this.printName();
	}
	
	
	public void printName() {
		System.out.println("Print name - Animal");
	}
	
	
	//constrictor
	
//	public Animal() {
//		
//	}
//	
	

}









//Inheritance (Lion extends Animal).
//Method Overriding (Lion overrides printName).
//Runtime Polymorphism (method call depends on object, not reference).



//How to know it’s runtime polymorphism (overriding)? - 
//		
//Method in parent + same method in child (same name, same parameters). - printName
//Object decides which method runs (not reference type).
//means this.printName(); method
//this = the object you created, which is Lion