package project_enum;

public class ServiceArea {
	
	private EmployeeArea serviceArea;
	
	public ServiceArea(EmployeeArea serviceArea) {
		this.serviceArea = serviceArea;
	}

	public EmployeeArea getServiceArea() {
		return serviceArea;
	}
	
	public void setServiceArea(EmployeeArea serviceArea) {
		this.serviceArea = serviceArea;
	}
}
