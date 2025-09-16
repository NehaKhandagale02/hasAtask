package inheritanceTwo;
//child class extends Employee
public class Developer extends Employee {
	
	public Developer() {
		super();         //calls Employee()
		System.out.println("Const - Developer");
	}
	
	int age = 24;
	
	int empId = 110;

	@Override
	public void printCity() {
		super.printCity();
		System.out.println("Pune");
	}
	
	public void printProject() {
		System.out.println("Google");
	}

}
