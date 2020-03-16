package hw5;

public class GasElectricAuthorizations {

	int elect_auth;
	int gas_auth;
	
	public GasElectricAuthorizations(int newelectric, int newgas) {
		elect_auth = newelectric;
		gas_auth = newgas;
	}
	
	public int getElectricAuthorization() {
		return elect_auth;
	}
}
