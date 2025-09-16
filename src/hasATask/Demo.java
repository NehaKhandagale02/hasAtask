package hasATask;

public class Demo {

	public static void main(String[] args) {
		
		Student s = new Student();
		
		s.setId(101);
		s.setCity("Pune");
		s.setName("Komal");
		
		Degree d =  new Degree();
		
		d.setDegree("BSc");
		d.setUniversity("Pune University");
		
		s.setStudentDegree(d);
		
		System.out.println(s.toString());
		
		System.out.println(s.getId());
		System.out.println(s.getCity());
		System.out.println(s.getName());
		System.out.println(s.getStudentDegree().getDegree());
		System.out.println(s.getStudentDegree().getUniversity());
		
	

	}

}
