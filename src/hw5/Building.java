package hw5;

public class Building {
	/* define class variables 
	 * building info taken from http://a810-bisweb.nyc.gov/bisweb/bispi00.jsp 
	 * */
	private String name; //for buildings with names
	private String arch_style; //architecture style
	private String state;
	private String county;
	private String city;
	private String local_govt;
	private int house_number;
	private String street;
	private int block;
	private int lot;
	private int building_id; //building identification number
	
	/* define methods for class */
	
	public Building(int new_hn, String new_street) {
		house_number = new_hn;
		street = new_street;
	}
	
	public int getHouseNumber() {
		return house_number;		
	}
	
	public String getStreet() {
		return street;		
	}
	
	public void setName(String name) {
		
	}

	public String getName() {
		return name;		
	}
	
	void setState(String state) {
		
	}
	
	String getState() {
		return state;
	}
	
	protected void setCounty(String county) {
		
	}
	
	protected String getCounty() {
		return county;
	}
	
	protected void setCity(String city) {
		
	}
	
	protected String getCity() {
		return city;
	}
	
	protected void setLocalGovt(String local_govt) {
		
	}
	
	protected String getLocalGovt() {
		return local_govt;
	}
	
	public void setBlock(int block) {
		
	}
	
	public int getBlock() {
		return block;
	}

	public void setLot(int lot) {
		
	}
	
	public int getLot() {
		return lot;
	}
	
	public void setBuildingID(int building_id) {
		
	}
	
	public int getBuildingID() {
		return building_id;
	}
	
	
	public void printBuildingInfo() {
		System.out.println("Here is the building information");
		System.out.println("The building name is " + name+" and the architecture type is "+arch_style);
		System.out.println("Building Id is " + building_id);
		System.out.println("Address is " + house_number +" "+street+", "+city+", "+state);
		System.out.println("Here is the building information");
		
	}
	
	/*create associations and run main program*/
	public static void main(String[] args) {
		
		/*hard coded variables for below function calls*/
		int hn1 = 110;
		String street1 = "8th Street";
		int jnum1 = 8904;
		int permnum1 = 12;
		int compnum1 = 22334;
		int newboiler1 = 11;
		int newelevator1 = 22;
		int newcd_num1 = 33;
		int newelect1 = 9022;
		int newgas1 = 339393;
		
		//create instances of all class objects w above variables
		// test comment for Git Push
		Building building = new Building(hn1, street1);	
		BuildingApplications buildingapplication = new BuildingApplications(jnum1, permnum1);
		ComplaintsSummonsViolations complaintsummonsviolations = new ComplaintsSummonsViolations(compnum1);
		BoilersElevatorsCranesDerricks boilerelevatorcranederrick = new BoilersElevatorsCranesDerricks(newboiler1, newelevator1, newcd_num1);
		GasElectricAuthorizations gaselectricauth = new GasElectricAuthorizations(newelect1, newgas1);
		// add more stuff
		building.name = "Folsom Library";
		building.arch_style = "Brutalist";
		building.city = "Troy";
		building.state = "NY";
		building.building_id = 29;
		buildingapplication.permit_type = "alteration";
		//display some stuff from all used instance of all objects to show full OO principles at work
		building.printBuildingInfo();
		System.out.println("The permit number is " + buildingapplication.permit_number);
		System.out.println("The permit type is " + buildingapplication.permit_type);
		System.out.println("The complaint number is " + complaintsummonsviolations.complaint_number);
		System.out.println("The boiler number is " + boilerelevatorcranederrick.boiler);
		System.out.println("The crane number is " + boilerelevatorcranederrick.elevator);
		System.out.println("The boiler number is " + boilerelevatorcranederrick.cd_number);
		System.out.println("The electricity authorization # is " + gaselectricauth.elect_auth);
		System.out.println("The gas authorization # is " + gaselectricauth.gas_auth);
	}

}






