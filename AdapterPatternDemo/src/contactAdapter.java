
public class contactAdapter implements APIContact{
	private String firstName;
	private String lastName;
	private String emailAddress;
	private String phoneNumber;
	
	private Contact contact;
	
	public contactAdapter(Contact contact) {
		this.contact=contact;
		this.prePresentation();
	}
	
	public void prePresentation() {
		String[] str=contact.getName().split(" "); // Assuming the name takes the following format (first name last name) 
		this.setFirstName(str[0]);
		this.setLastName(str[1]);
		this.setEmailAddress(contact.getEmail());
		this.setPhoneNumber(contact.getPhone());
	}
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmailAddress() {
		return emailAddress;
	}
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	public String toString() {
		return "{First Name: "+firstName+", Last Name: "+lastName+", "+"Phone Number: "+phoneNumber+", Email Address: "+emailAddress;
	}
	
}
