package week4.lab1;

import java.util.Arrays;

public class BankCustomer {
	
	//Variables
	
	private String name;
	private String address;
	private SavingsAccount[] savaccs = new SavingsAccount[3];
	private int noOfAccs = 0;

	//Constructor
	
	
	public BankCustomer(String name, String address) {
		setName(name);
		setAddress(address);
	}
	
	
	
	//Getters & Setters
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public SavingsAccount[] getSavaccs() {
		return savaccs;
	}
	public void setSavaccs(SavingsAccount[] savaccs) {
		this.savaccs = savaccs;
	}
	
	
	public int getNoOfAccs() {
		return noOfAccs;
	}



	public void setNoOfAccs(int noOfAccs) {
		this.noOfAccs = noOfAccs;
	}


	
	//Misc Methods


	public void addAccount(SavingsAccount sav) {
		if(getNoOfAccs() <= 2) {
			savaccs[getNoOfAccs()] = sav;
			
			setNoOfAccs(getNoOfAccs()+1);
		}
		else {
			System.out.println("You have reached the maximum no. of accounts");
		}
	}
	
	public double balance(SavingsAccount[] savaccs){
		double balance = 0;
		
		for(SavingsAccount sav: savaccs) {  //foreach saving account from savaccs
			if(sav != null) {
				balance += sav.getSavingsBalance();
			}
		}
		
		return balance;
	}



	@Override
	public String toString() {
		return "BankCustomer [name=" + name + ", address=" + address + ", savaccs=" + Arrays.toString(savaccs);
	}




	
	//toString
	
	
	
	
	
}
