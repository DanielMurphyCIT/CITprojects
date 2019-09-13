package application;

public class Teacher extends Person{
	protected String subjectTaught, degree;
	

    public Teacher(String firstName, String middleName, String lastName,String email,int phone,String subjectTaught,int degreeLevel) {
    	super(firstName, middleName, lastName, email, phone);
    	this.subjectTaught = subjectTaught;
    	this.degree = degree;
    }

    public String getSubjectTaught() {
        return subjectTaught;
    }

    public String getDegree() {
        return degree;
    }
}