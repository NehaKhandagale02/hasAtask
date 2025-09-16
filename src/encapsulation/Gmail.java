package encapsulation;

public class Gmail {
	
	private String email;
	                           // - email & password are private so they can only be accessed inside Gmail class itself.
	private String password;
	
	public String getEmail() {
		return email;
	}
	
	
//	public void setEmail(String email) {
//		this.email = email;
//	}

	
//	public String getPassword() {
//		return password;
//	}
//	
	
	public void setPassword(String password) {
		this.password = password;
	}
}




//Encapsulation is the process of hiding the data (variables) of a class by declaring them as private, 
//and providing controlled access to them using public methods (getters and setters).


//g.email = "abc@gmail.com"; // ❌ Not allowed
//g.setPassword("mypassword"); // ✅ sets password
//System.out.println(g.getEmail()); // ✅ gets email


