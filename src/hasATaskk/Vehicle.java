package hasATaskk;

public class Vehicle {
	
	private String name;
	
	private String type;
	
	
	private RegistrationDetails details;
	
	
	

	public RegistrationDetails getDetails() {
		return details;
	}

	public void setDetails(RegistrationDetails details) {
		this.details = details;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Vehicle [name=" + name + ", type=" + type + ", details=" + details + "]";
	}
	
	
	
	
	

}
