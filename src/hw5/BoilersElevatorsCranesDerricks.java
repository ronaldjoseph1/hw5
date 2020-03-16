package hw5;

public class BoilersElevatorsCranesDerricks {

	public int boiler; //boiler number
	public int elevator; //device number
	public int cd_number; //crane or derrick number
	
	public BoilersElevatorsCranesDerricks(int newboiler, int newelevator, int newcd_num) {
		boiler = newboiler;
		elevator = newelevator;
		cd_number = newcd_num;
	}
	
	public int getBoiler() {
		return boiler;
	}
	
	public int getElevator() {
		return elevator;
	}

	public int getCDNumber() {
		return cd_number;
	}
}
