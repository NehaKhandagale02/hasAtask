package hasATaskk;

public class Student {
	
	private int id;
	
	private String name;
	
	private String city;
	
	
	private Vehicle vh;
	
	

	public Vehicle getVh() {
		return vh;
	}

	public void setVh(Vehicle vh) {
		this.vh = vh;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", city=" + city + ", vh=" + vh + "]";
	}
	
	
	
	
	
	
	
	
	

}
