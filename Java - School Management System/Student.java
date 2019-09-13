package application;
import java.util.*;

public class Student extends Person{
	String dateOfBirth;
	ArrayList<Object> modules = new ArrayList<Object>();
    public Student(String firstName, String middleName, String lastName,String email,int phone,String dateOfBirth,ArrayList<Object> modules) {
    	super(firstName, middleName, lastName, email, phone);
    	this.dateOfBirth = dateOfBirth;
    }
    public void addModule(ModuleGrade modulegrade) {
        modules.add(modulegrade);
    }
    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public ArrayList<Object> getModules() {
        return modules;
    }
    public String toString()
    {
    	return firstName + " " + middleName + " " + lastName + " " + email + " " + phone + " " + dateOfBirth + " " + modules.toString();
    }

}
