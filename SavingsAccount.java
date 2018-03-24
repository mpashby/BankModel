//Michele Pashby
//CS 62 HW 1
//ID 30335753
//mpashby19@cmc.edu

package ps1_PashbyMichele;

public class SavingsAccount extends Account {

	public SavingsAccount (Customer accountOwner, int accountNumber, double balance, Bank bankName) {
		super(accountOwner,accountNumber, balance, bankName);// parent constructor
	}
   
	public void findInterest(int year) {  //calculates earned interest over x years when interest is calculated and paid once a year
		//take account number, use number to get balance
		double rate= 0.06;
		double interest= balance+ (balance* rate *year);
		System.out.println("\n"+accountOwner.customerToString()+" 's $"+balance+" will turn into $"+interest+" over "+year+" years.");
	}
}
