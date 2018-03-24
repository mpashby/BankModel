/*Michele Pashby
*CS 62 HW 1
*ID 30335753
*mpashby19@cmc.edu
*/

package ps1_PashbyMichele;

public class Name {  
	private String firstName;
	private String midInitial;  //String instead of char in case user inputs A. instead of A
	private String lastName;
	
	public Name (String f, String m, String l) {  
		firstName=f;
		midInitial=m;
		lastName=l;
	}
	public String getFirstName() {
		return firstName;
	}
	
    public String getMidInitial () {
		return midInitial;
	}
    
	public String getLastName() {
		return lastName;
	}
	
	public void setFirstName(String newFirst) {
		firstName=newFirst;
	}
	
	public void setMidInitial (String newMid) {
		midInitial=newMid;
	}
	
	public void setLastName (String newLast) {
		lastName=newLast;
	}
	
    public String nameToString() {  //converts into String form
    	return (lastName+", "+firstName+" "+midInitial+".");
    }
    
	public void printName() {
		System.out.println("Full Name: "+lastName+", "+firstName+" "+midInitial+".");
	}
	
}


