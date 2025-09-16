package array;

import java.util.Scanner;

public class Demo3 {

	public static void main(String[] args) {
		
		Student s = new Student();
		
		s.setId(101);
		s.setName("Ram");
		s.setCity("Pune");
		
        Student s1 = new Student();
		
		s1.setId(102);
		s1.setName("Shyam");
		s1.setCity("Delhi");
		
        Student s2 = new Student();
		
		s2.setId(103);
		s2.setName("Raj");
		s2.setCity("Mumbai");
		
       Student s4 = new Student();
		
		s4.setId(104);
		s4.setName("Michael");
		s4.setCity("Chennai");
		
		Student[] studentArray = {s,s1,s2,s4}; // array of Student object
		//studentArray[2]=s4;   //Replace element at index 2
		
//		for(int i =0; i < studentArray.length; i++) {
//			System.out.println(studentArray[i]);
//		}
		
		
		//val get
//		for(int i = 0; i < studentArray.length; i++) {
//			
//			System.out.println(studentArray[i].getId());
//			System.out.println(studentArray[i].getName());
//			System.out.println(studentArray[i].getCity());
//		}
		
		
		//find a student who is from pune
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter city : ");
		String city = sc.next();
		
		for(int i = 0; i < studentArray.length; i++) {
			
			if(studentArray[i].getCity().equals(city )) {
				System.out.println(studentArray[i].getId());
				System.out.println(studentArray[i].getName());
				System.out.println(studentArray[i].getCity());
			}
			
			//Enter a age field then print students who have age more 18
		}
		
		
		
		
	}

}
