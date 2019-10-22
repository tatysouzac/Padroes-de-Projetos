package br.edu.fapi.proxy;

public class ATMMachine implements GetATMData{

	ATMState hasCard;
	ATMState noCard;
	ATMState hasCorrectPin;
	ATMState atmOutofMoney;
	
	ATMState atmState;
	boolean correctPin= false;
	
	@Override
	public ATMState getATMData() {
		return atmState;
	}

	@Override
	public int getCashInMachine() {
		
		return 0;
	}

}
