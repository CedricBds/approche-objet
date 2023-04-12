package fr.diginamic.entites;

public class Theatre {
	
	protected String name;
	protected int maxCapacity = 20;
	protected int totalRegistered;
	protected double totalBenefits;
	
	
	public String register(int clientNumber, int price) {
		


		/**
		 * The max capacity is not reached
		 */
		if (this.totalRegistered + clientNumber <= this.maxCapacity) {
			//add clients to the registered users
			this.totalRegistered += clientNumber;
			this.totalBenefits += price;
			return clientNumber + " registered. " + (this.maxCapacity - this.totalRegistered) + " available places"
			+ "\n" + this.totalBenefits + " € of benefits";

		}
		
		return "All places are taken.";
		
		
	}
	

}
