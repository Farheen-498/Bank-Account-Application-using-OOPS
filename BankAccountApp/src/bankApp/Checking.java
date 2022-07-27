package bankApp;

public class Checking extends Account {

	//List Properties specific to a checking account
	private long debitCardNumber;
	private int debitCardPin;
	private double balance=20000;
	//Constructor to initialize account checking properties
	Checking(String name, String sSN, double deposit){
		super(name,sSN,deposit);
		//System.out.println("NEW CHECKING ACCOUNT...");
		accountNumber= "2"+accountNumber;
//		System.out.println("ACCOUNT NUMBER:"+accountNumber);
	
		//System.out.println("Account Holder name: "+ name);
		setDebitCard();	
	}
	public void setRate() {
		rate = getBaseRate() * .15;
	}
	private void setDebitCard() {
		debitCardNumber=(long) (Math.random()*Math.pow(10, 12));
		debitCardPin= (int)(Math.random()*Math.pow(10, 4));
	}
	public void showInfo(){
		super.showInfo();
		System.out.println("Checking Account details"
				+"\nDebit Card Number: "+debitCardNumber
				+"\nDebit Card Pin: "+debitCardPin);
	}
	//List any methods specific to the checking account 
}
