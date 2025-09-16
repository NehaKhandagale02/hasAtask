package hasA;

public class Demo {

	public static void main(String[] args) {
		
		Student s = new Student();
		
		s.setId(101);
		s.setCity("Pune");
		s.setName("Neha");

		//obj of PersonalDetails
		PersonalDetails p = new PersonalDetails();
		
		p.setFatherName("abc");
		p.setMotherName("xyz");

		s.setDetails(p);
		
		System.out.println(s.toString());
		
		System.out.println(s.getId());
		System.out.println(s.getCity());
		System.out.println(s.getName());
		System.out.println(s.getDetails().getFatherName());
		System.out.println(s.getDetails().getMotherName());
		
		
		
			}

}




//Encapsulation - 
//Data members (id, name, city, fatherName, etc.) are private.
//Access is given through getter and setter methods.
//
//Has-A Relationship (Composition / Aggregation) -   means One class contains another class as a field.
//Student has-a PersonalDetails.
//
//This shows object inside another object