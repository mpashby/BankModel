//Michele Pashby


package ps1_PashbyMichele;

public class Customer {
	private Name customerName;
	private String address;
	private String maiden;  //maiden name
	String phone;    //phone number is a string in case user enters it as xxx-xxx-xxxx instead of as an integer
	String social;  //Social Security
	

 public Customer (Name n, String a, String m, String p, String s) {
	 this.customerName=n;
	 this.address=a;
	 this.maiden=m;
	 this.phone=p;
	 this.social=s;
 }
 public Name getCusName() {
	 return customerName;
 }
 
 public String getAddress() {
	 return address;
 }
 
 public String getMaiden() {
	 return maiden;
 }
 
 public String getPhone() {
	 return phone;
 }
 
 public String getSocial() {
	 return social;
 }
 
 public void setName (Name newName) {
	 customerName=newName;
 }
 
 public void setAddress(String newAdd) {
	 address=newAdd;
 }
 
 public void setMaiden(String newMaiden) {
	 maiden=newMaiden;
 }
 
 public void setPhone (String newPhone) {
	 phone = newPhone;
 }
 
 public void setSocial(String newSocial) {
	 social=newSocial;
 }
 
 public void printCustomer () {  //prints all information
	 System.out.print("Customer: "+ customerName.nameToString()+"\nAddress: "+address+"\nMaiden Name: "+maiden+
			 "\nPhone Number: "+phone+"\nSocial Security Number: "+social);
 }
 public String customerToString() {  //returns customer name as a string
	 return customerName.nameToString();
 }
 
 public void printCusName() {  //prints just name
	 customerName.printName();
 }
 
}
