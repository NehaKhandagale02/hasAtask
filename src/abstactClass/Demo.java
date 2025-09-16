package abstactClass;

import java.util.Scanner;

public class Demo{
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Employee (Manager or HR): ");
		String value = sc.next();
		
		//ask user to enter
		System.out.println("Enter Salary : ");
		double salary = sc.nextInt();
		
		Employee e;      // reference var of Employee
		
		//If we enter Manager
		if(value.equalsIgnoreCase("Manager")) {
			e = new Manager(salary);      // pass salary using constructor
		}
		else {
			e = new HR(salary);
		}
		
		// print revised salary after deduction
		e.printSalary();
	}
}









//public class Demo {
//
//	public static void main(String[] args) {
//		String value = "Manager";
//		
//		Employee e;     // reference var of Employee
//		
//		if(value.equalsIgnoreCase("manager")) {
//			e = new Manager();
//			e.printSalary();
//		}
//		else {
//			e = new HR();
//			e.printSalary();
//		}
		
		
		

	//}

//}
