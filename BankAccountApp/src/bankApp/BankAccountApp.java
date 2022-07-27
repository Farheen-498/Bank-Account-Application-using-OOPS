package bankApp;

import java.util.LinkedList;
import java.util.List;

public class BankAccountApp {

	public static void main(String[] args) {
		//Read .csv File and then create new accounts based on that data
		
		List<Account> accounts = new LinkedList<Account>();
		
		String file="D:\\NewBankAccounts.csv";
		List<String []> readaccountHolders= Utilities.CSV.read(file);
		for(String [] accountHolder: readaccountHolders) {
		//System.out.println("CREATING NEW ACCOUNT");
		
		String name= accountHolder[0];
		String sSN= accountHolder[1];
		String accountType=accountHolder[2];
		double initDeposit=Double.parseDouble(accountHolder[3]);
	//ystem.out.println(name+ " "+sSN+ " "+ accountType+ " Rs "+initDeposit);
		if(accountType.equals("Savings")) {
			
			accounts.add(new Savings(name,sSN,initDeposit));
		}
		else if(accountType.equals("Checking")) {
			
			accounts.add(new Checking(name,sSN,initDeposit));
		}
		else {
			System.out.println("ERROR READING THE ACCOUNT!!");
		}
		
		for(Account acc: accounts) {
			System.out.println("\n****************************");
			acc.showInfo();	
	}
	
		accounts.get((int) Math.random() * accounts.size()).deposit(1000);
		accounts.get((int) Math.random() * accounts.size()).deposit(1500);
	}
		
	/*	Checking checking = new Checking("Farheen Ali","23456789",1234);

		Savings savings = new Savings("Heena Ali","123456719",3456);
		
		checking.showInfo();
		System.out.println("*****************************");
		savings.showInfo();
		checking.deposit(200);
		checking.printBalance();
		savings.withdraw(300);
		savings.printBalance();
		savings.transfer("Rent", 600);
		savings.printBalance();
		savings.compound();
		savings.printBalance(); */
		
	}

}
