package inheritanceTwo;
//parent class
public class Employee {
	
	public Employee() {
		super();                //call to parent constructor
		System.out.println("Const - employee");
	}
	
	
	//29-8-25
	static int abc = 1234;
	
	
	int empId = 102;
	
	String name ="Neha";
	
	//static method
	
	public static void printVehicle() {
		System.out.println("Honda City");
	}
	
	public void printCity() {
		System.out.println("City Name");
	}
	
	public void printSalary() {
		System.out.println("200000");
	}

}



//Constructor chaining - Parent constructor executes before child’s.
//Variable hiding - Variables are resolved by reference type.
//Method overriding - Methods are resolved by actual object type (runtime).
//Upcasting - You can store a Developer object in an Employee reference, but can only access members available in Employee.
//Upcasting -  Storing a child object in a parent reference.


//Developer is a child of Employee, so before Java can construct the child, it must construct the parent first.

//When a child class object is created, the parent constructor always runs before the child constructor.