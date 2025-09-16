package abstactClass;

public class Manager extends Employee {
	
	
	//constructor - receives salary from Demo & sends to Employee constructor
	public Manager(double salary) {
		super(salary);
	}
	
	

	@Override
	public void printSalary() {
		//for manager deduct 10 % and print salary
		double revisedSalary = salary - (salary * 0.10);
		System.out.println("Revised Manager Salary after 10 % deduction : " + revisedSalary);
		//System.out.println("Manager Salary is : 20000");
		
	}

}
