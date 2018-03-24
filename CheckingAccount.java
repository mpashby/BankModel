//Michele Pashby

package ps1_PashbyMichele;

public class CheckingAccount extends Account {   // inheritance
	
	public CheckingAccount(Customer accountOwner, int accountNumber, double balance, Bank bankName) {
		super(accountOwner, accountNumber, balance, bankName);
	}
	
	public double atmWithdrawl(double withdrawAmt) {  //calculates the cost of withdrawing from another bank's ATM
		double charge=0.1;
		double fee=withdrawAmt*charge;
		balance=balance-(withdrawAmt+fee);  //new balance minus amount withdrawn and fee
		System.out.println("\nThe cost of withdrawing from another bank's ATM is "+ charge*10+"%. Your transaciton fee is $"+fee+". "+
				accountOwner.customerToString()+"'s new account balance is $"+balance);
		return balance;
	}
  
}
