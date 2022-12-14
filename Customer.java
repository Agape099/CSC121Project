public class Customer {
	//instance variables
	private String firstName;
	private String lastName;
	private String SSN;
	
	public Customer(String firstName, String lastName, String SSN) {
		this.firstName=firstName;
		this.lastName=lastName;
		this.SSN=SSN;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getFirstName() {
		return firstName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getLastName() {
		return lastName;
	}


	public void setSocialSecurityNumber(String sSN) {
		SSN = sSN;
	}
	public String getSocialSecurityNumber() {
		return SSN;
	}


}