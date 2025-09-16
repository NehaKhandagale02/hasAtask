package hasATaskk;

public class RegistrationDetails {
	
	private int vehicleNo;
	
	private int yearOfManufacturing;

	public int getVehicleNo() {
		return vehicleNo;
	}

	public void setVehicleNo(int vehicleNo) {
		this.vehicleNo = vehicleNo;
	}

	public int getYearOfManufacturing() {
		return yearOfManufacturing;
	}

	public void setYearOfManufacturing(int yearOfManufacturing) {
		this.yearOfManufacturing = yearOfManufacturing;
	}

	@Override
	public String toString() {
		return "RegistrationDetails [vehicleNo=" + vehicleNo + ", yearOfManufacturing=" + yearOfManufacturing + "]";
	}
	
	
	
	
	
	

}
