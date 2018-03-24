/*Michele Pashby
 * CS 62
 * ID 30335753
 * mpashby19@cmc.edu
 */
package ps1_PashbyMichele;

public class BankTestDriver {
	
	public static void main(String[] args) {
		
		Name n1 = new Name("Napoleon", "A", "Bonaparte");
		Name n2 = new Name("Genghis", "G", "Khan");
		Name n3 = new Name("Harriet", "O", "Tubman");
		Name n4 = new Name("George", "W", "Washington");
		Name n5 = new Name ("Scooby", "D", "Doo");
		Name n6 = new Name("SpongeBob", "B", "Squarepants");
		
		//Customer is name, address, maiden, phone, social all with type String
		Customer c1 = new Customer(n1, "245 Croissant Way, Paris, France", "Robspierre", "909-123-4567", "987654321789");
		Customer c2 = new Customer(n2, "823 Empire Street, Mongolia", "Burte", "609-587-2834", "489872378");
		Customer c3 = new Customer(n3, "198 Freedom Boulevard, Richmond", "Freeman", "290-294-2932", "234857329");
		Customer c4 = new Customer(n4, "505 Independence Avenue, Mount Vernon", "Jefferson", "909-234-7143", "48923843");
		Customer c5 = new Customer(n5, "Mystery Van", "Doggo", "1-800-473-5883", "90849028203");
		Customer c6 = new Customer(n6, "Pineapple, Bikini Bottom", "Circlepants", "953-396-3296", "23985920");
		
		Bank b1 = new Bank("Wells Fargo");
		Bank b2 = new Bank("Bank of America");
		
	    SavingsAccount a1= b1.createSavingsAccount(c1);
	    CheckingAccount a2= b1.createCheckingAccount(c2);
	    SavingsAccount a3= b1.createSavingsAccount(c3);
	    SavingsAccount a4= b1.createSavingsAccount(c4);
	    CheckingAccount a5= b2.createCheckingAccount(c5);
	    SavingsAccount a6= b2.createSavingsAccount(c6);
		
	    a1.deposit(5.50);
	    a2.deposit(200);
	    a1.withdraw(2.00);
	    a3.deposit(50);
	    a4.deposit(30.75);
	    a4.withdraw(10);
	    a5.deposit(20);
	    a6.deposit(13);
	    a2.atmWithdrawl(15);
	    a6.findInterest(5);
	    
	    b1.deleteAccount(a3);   //deletes Harriet Tubman
	    b2.getNumCustomers();
	    b2.getNameOfHighestBalance();
	    b1.sortAccount();
	    b1.getAverageBalance();
	}
}
