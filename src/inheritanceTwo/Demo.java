package inheritanceTwo;

public class Demo {

	public static void main(String[] args) {
		//obj of Developer
		Employee e = new Developer();
		
		Developer d = new Developer();
		d.printVehicle();
		Developer.printVehicle();
		System.out.println(Developer.abc);
		
//		System.out.println(e.name);
//		System.out.println(e.empId);
//		e.printCity();
//        e.printSalary();
	}

}
