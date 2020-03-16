package hw5;

public class BuildingApplications {

	int job_number;
	int permit_number;
	int plumbing_wo; //work order
	String permit_type;
	
	public BuildingApplications(int newjobnum, int newpermnum) {
		job_number = newjobnum;
		permit_number = newpermnum;
	}
	
	public void setJobNumber(int job_number) {
		
	}
	
	public int getJobNumber() {
		return job_number;
	}
	
	public void setPermitNumber(int permit_number) {
		
	}
	
	public int getPermitNumber() {
		return permit_number;
	}

	public void setPlumbingWO(int plumbing_wo) {
		
	}
	
	public int getPlumbingWO() {
		return plumbing_wo;
	}

	public void setPermitType(String permit_type) {
		
	}
	
	public String getPermitType() {
		return permit_type;
	}
	
	public void printApplicationInfo() {
		System.out.println("Here is the building information");
		System.out.println("Permit number is " + permit_number);
		System.out.println("Permit type is " + permit_type);
	}
}
