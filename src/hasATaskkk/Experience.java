package hasATaskkk;

public class Experience {
	
	private String companyName;
	
	private String jobRole;
	
	private int yearOfExperience;

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getJobRole() {
		return jobRole;
	}

	public void setJobRole(String jobRole) {
		this.jobRole = jobRole;
	}

	public int getYearOfExperience() {
		return yearOfExperience;
	}

	public void setYearOfExperience(int yearOfExperience) {
		this.yearOfExperience = yearOfExperience;
	}

	@Override
	public String toString() {
		return "Experience [companyName=" + companyName + ", jobRole=" + jobRole + ", yearOfExperience="
				+ yearOfExperience + "]";
	}
	
	
	
	

}
