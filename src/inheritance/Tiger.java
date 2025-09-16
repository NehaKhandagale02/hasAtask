package inheritance;
//Tiger extends Animal. That means Tiger can use printName() and printAge() methods of Animal without rewriting them.
//Inheritance means the child class can access (or reuse) the methods and variables of the parent class.


//child
public class Tiger extends Animal {
	
	//constructor
	
	public Tiger() {
		System.out.println("In Tiger Constructor - child ");
		
	}

	@Override
	public void printName() {
		super.printName();
		System.out.println("Tiger");
	}
	
	//new method add 26-8-25
	public void printColour() {
		System.out.println("Yellow Colour");
	}

	

}
