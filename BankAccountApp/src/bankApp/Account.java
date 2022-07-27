package bankApp;

public abstract class Account implements IBaseRate {

	//List common properties for savings And checking accounts
	private String name;
	private String sSN;
	private double balance;
	protected String accountNumber;
	private static int index=1000;
	protected double rate;
	
	//Constructor to set base properties and initialize the account
	
	public Account(String name, String sSN, double initDeposit) {
		this.name=name;
		this.sSN=sSN;
		this.balance=initDeposit;
	//ystem.out.println("NEW ACCOUNT :");
		//System.out.println("NAME:" +name+" sSN: "+sSN+" Balance: Rs "+balance);
		
		index++;
		this.accountNumber=setAccountNumber();
		//System.out.println(getBaseRate());
		setRate();
	}
	public abstract void setRate();
	//List common methods
	
	private String setAccountNumber() {
		String lastTwoOfSSN=sSN.substring(sSN.length()-2,sSN.length());
		int uniqueId=index;
		int randomNumber=(int) (Math.random()*Math.pow(10,3));
		return lastTwoOfSSN + uniqueId+randomNumber;
	}
	
	public void compound() {
		double accruedBalance= balance*(rate/100);
		System.out.println("Accrued amount: Rs" +accruedBalance);
		balance=balance+accruedBalance;
	}
	public void deposit(double amount) {
		balance = balance+amount;
		System.out.println("Depositing Rs "+amount);
	}
	
	public void withdraw(double amount) {
		balance = balance-amount;
		System.out.println("Withdrawing Rs "+amount);
	}
	
	public void printBalance() {
		System.out.println("Your Balance is now: "+balance);
	}
	public void transfer(String toWhere,double amount) {
		balance= balance-amount;
		System.out.println("Transfering the amount Rs "+amount+" to "+toWhere);
	}
	public void showInfo() {
		System.out.println(
				"\nNAME: "+name+
				"\nACCOUNT NUMBER: "+accountNumber+
				"\nBALANCE: "+balance+
				"\nRATE: "+rate+" %"
				);
	}
	
}
