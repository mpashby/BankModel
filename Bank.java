//Michele Pashby
//CS 62 HW 1
//ID 30335753
//mpashby19@cmc.edu;

package ps1_PashbyMichele;
import java.util.*;

public class Bank {
	String bankName; 
	int count=0; //counts number of accounts
	Account accountArray[]= new Account[100];

	public Bank(String bankName){
		this.bankName=bankName;
	} 
	public String getBankName() {
		return bankName;
	}
	
	public void setBankName(String newBName) {
		bankName=newBName;
	}
	
	public String bankToString() {
		return (bankName);
	}
	
	public void printAccountArray() {
		for (int i=0; i<=count-1; i++) {
			accountArray[i].printInfo();
		}
	}
	
	public SavingsAccount createSavingsAccount (Customer c) {  
		Random rnd= new Random();
		int newNumber=rnd.nextInt(1000) + 501;
		SavingsAccount newOwner= new SavingsAccount (c, newNumber, 0.0, this);
		accountArray[count]=newOwner;
		count++;
	    newOwner.printInfo();
	    return newOwner;
	}
	
	public CheckingAccount createCheckingAccount (Customer c) {
		Random rnd= new Random();
		int newNumber=rnd.nextInt(1000) + 501;
		CheckingAccount newOwner= new CheckingAccount (c, newNumber, 0.0, this);
		accountArray[count]=newOwner;
		count++;
	    newOwner.printInfo();
	    return newOwner;
	}
	
	public void deleteAccount (Account account) {
		for (int i=0; i<accountArray.length; i++) {
			if (accountArray[i]==account) {
				accountArray[i]=null;
				
				// switch last account with empty spot
				accountArray[i] = accountArray[count-1];
				accountArray[count-1] = null;
				count--;
				break;
			}
		}
	}
	
	public void getNumCustomers () {
		System.out.println("\n"+ this.bankToString() +" Number of Accounts: "+ count); //counts number of accounts
	}
	
	public void getAverageBalance () {
		double avg=0;
		int avgCount=0;
		double checkAvg=0;
		int checkAvgCount=0;
		double saveAvg=0;
		int saveAvgCount=0;
		
		for (int i=0; i<count; i++) {
			avg+= accountArray[i].getBalance();
			avgCount++;
			
			if (accountArray[i] instanceof CheckingAccount ) {
				checkAvg+=accountArray[i].getBalance();
				checkAvgCount++;
			}
			else { // saving 
				saveAvg+=accountArray[i].getBalance();
				saveAvgCount++;	
			}
		}	
		avg= avg/avgCount;
		checkAvg=checkAvg/checkAvgCount;
		saveAvg=saveAvg/saveAvgCount;
		System.out.println("\n"+bankName+" Average Account Balance: $"+avg+"\nAverage Checking Account Balance: $"+checkAvg+
				"\nAverage Savings Account Balance: $"+saveAvg);
	}  
	
	public void getNameOfHighestBalance () {
		double highest=0.0;
		Customer highestName=null;
		for (int i=0; i<count; i++) {
				if (accountArray[i].getBalance() > highest) {
					highest=accountArray[i].getBalance();
					highestName=accountArray[i].getAccountOwner();
				}
		}
		System.out.println("\n"+this.bankToString()+" Name of Highest Balance: "+highestName.customerToString());
	}
		
	public void sortAccount () {	
    Account holder=null;
	for (int i=0; i< count; i++) {   //or go i<count
	   int min_index=i;
	   for (int j=i+1; j<count; j++) {
	         if (accountArray[j].getBalance() <= accountArray[min_index].getBalance()) {
	           min_index = j;
	           holder=accountArray[i];
	    	   accountArray[i] = accountArray[min_index]; 
	    	   accountArray[min_index] = holder;   //swaps
	         }
	 }
	}   
	System.out.println("\n"+this.bankToString()+" Sorted bank account array: ");
	this.printAccountArray();
	}	
}
