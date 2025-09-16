package hasATaskk;

public class Demo {

	public static void main(String[] args) {
		
		Student s = new Student();
		
		s.setId(101);
		s.setCity("Pune");
		s.setName("Asmita");
		
		Vehicle v = new Vehicle();
		
		v.setName("Shine");
		v.setType("Bike");
		
		RegistrationDetails rd = new RegistrationDetails();
		
		rd.setVehicleNo(24512);
		rd.setYearOfManufacturing(2025);
		
		s.setVh(v);
		
		v.setDetails(rd);
		
		System.out.println(s.toString());
		
		System.out.println(v.toString());
		
		
		System.out.println(s.getId());
		System.out.println(s.getName());
		System.out.println(s.getCity());
		System.out.println(s.getVh().getName());
		System.out.println(s.getVh().getType());
		System.out.println(v.getDetails().getVehicleNo());
		System.out.println(v.getDetails().getYearOfManufacturing());

		
		
	}

}
