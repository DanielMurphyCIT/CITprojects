package application;

public class Person extends Name{
    protected String email;
    public void setEmail(String email) {
		this.email = email;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}

	protected int phone;

    public Person(String firstName, String middleName, String lastName,String email,int phone) {
    	super(firstName,middleName,lastName);
    	this.email = email;
    	this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public int getPhone() {
        return phone;
    }
}
