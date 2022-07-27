package bankApp;

public class Savings extends Account {

	//List Properties specific to a saving account
	private int safetyDepositboxId;
	private int safetyDepositboxCode;
	private double balance=30000;
	//Constructor to initialize settings for savings properties
	
	public Savings(String name, String sSN, double deposit) {
		super(name,sSN,deposit);
		accountNumber="1"+accountNumber;
//		System.out.println("ACCOUNT NUMBER:"+accountNumber);
//		System.out.println("NEW SAVINGS ACCOUNT");
		
		setSafetyDepositBox();
		
	}
	
	@Override
	public void setRate() {
		rate = getBaseRate() - .25;
		}

	
	private void setSafetyDepositBox() {
     safetyDepositboxId=(int) (Math.random()* Math.pow(10, 3));
     safetyDepositboxCode =(int) (Math.random()* Math.pow(10, 4));
    // System.out.println(safetyDepositboxId);
		
	}

	public void showInfo(){
		super.showInfo();
		System.out.println(
				 "Your savings Account Features:-"
				+"\nSafety Deposit ID: "+safetyDepositboxId
				+"\nSafety Deposit Pin: "+safetyDepositboxCode);
	}
	//List any methods specific to savings account

	
}
