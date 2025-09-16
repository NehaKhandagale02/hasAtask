package abstactClass;
// Employee - parent abstract class
public abstract class Employee {
	
	
	double salary;
	
	//constructor
	//Pass salary of Manager or HR from Demo class using constructor
	public Employee(double salary) {
		this.salary = salary;
	}
	
	//abstract method
	
	public abstract void printSalary();
	
	
	
	
	
	
	
	
	
	
	
	
	//Task - 1
	//Pass salary of Manager of HR from Demo class
	//using constructor
	//for manager deduct - 10% and print salary
	//for HR deduct 20% and print salary
	//inputs should be provided by scanner
	//Scanner should give options - HR salary or Manager salary
	//Enter salary
	//print revised salary after deduction

}
