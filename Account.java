//Michele Pashby
//CS 62 HW 1
//ID 30335753
//mpashby19@cmc.edu

package ps1_PashbyMichele;

public abstract class Account implements Comparable {
    Customer accountOwner; //Account owner, who is the customer, obj composition  
	int accountNumber;   
	double balance;
	Bank bankName;
	
	public Account(Customer accountOwner, int accountNum, double balance, Bank bankName) { 	
		this.accountOwner=accountOwner;
		this.accountNumber=accountNum;
		this.balance=balance; 
		this.bankName = bankName;
	}
	
	public Customer getAccountOwner() {
		return accountOwner;
	}
	
	public int getAccountNum () {
		return accountNumber;
	}
	
	public double getBalance() {
		return this.balance;
	}

	public Bank getBankName() {
		return bankName;
	}
	
	public double withdraw(double withdraw){
		balance= balance - withdraw;
		return balance;
	}
	
	public double deposit(double add) {
	 balance=balance+add;
	 return balance;
	}
	
	public void printInfo() {
		System.out.println("Customer: "+accountOwner.customerToString()+"\tAccount Number: "+accountNumber+"\tBalance: "+balance);
	} 
	public String accountToString() {
		return ("Customer: "+accountOwner.customerToString()+"\tAccount Number: "+accountNumber+"\tBalance: "+balance);
	}
	//ovverride function
    public int compareTo (Object o) {
	  if (balance < ((Account) o).balance) 
	      return -1;
	  else if (balance > ((Account) o).balance) 
			  return 1;  
	  else  //when equal
		  return 0;
	  
  }
}
