package abstactClass;

public class HR extends Employee {
	
	//constructor - receives salary from Demo and  sends to Employee Constructor

      public HR(double salary) {
    	  super(salary);
      }
      
	@Override
	public void printSalary() {
		//for HR deduct 20 % & print salary
		double revisedSalary = salary - (salary * 0.20);
		System.out.println("Revised HR Salary after 20 % deduction : "+ revisedSalary);
		//System.out.println("HR Salary is : 100000");
		
	}

}
