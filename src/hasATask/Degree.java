package hasATask;

public class Degree {
	
	private String degree;
	
	private String university;

	public String getDegree() {
		return degree;
	}

	public void setDegree(String degree) {
		this.degree = degree;
	}

	public String getUniversity() {
		return university;
	}

	public void setUniversity(String university) {
		this.university = university;
	}

	@Override
	public String toString() {
		return "Degree [degree=" + degree + ", university=" + university + "]";
	}
	
	
	
	
	
	

}