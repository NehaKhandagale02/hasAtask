package hasATaskkk;

public class Demo {

	public static void main(String[] args) {
		
		Employee e = new Employee();
		
		e.setId(101);
		e.setName("Neha");
		e.setSalary(200000);
		
		Experience ep = new Experience();
		
		ep.setCompanyName("TCS");
		ep.setJobRole("Software Developer");
		ep.setYearOfExperience(4);
		
		e.setExperience(ep);
		
		System.out.println(e.toString());
		
		System.out.println(e.getId());
		System.out.println(e.getName());
		System.out.println(e.getSalary());
		System.out.println(e.getExperience().getCompanyName());
		System.out.println(e.getExperience().getJobRole());
		System.out.println(e.getExperience().getYearOfExperience());

	}

}
