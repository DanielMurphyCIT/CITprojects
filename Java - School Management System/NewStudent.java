package application;

import java.util.ArrayList;
import java.util.Scanner;

public class NewStudent {
	public Student newStudent()
	{
	ArrayList<Object> modules = null;
	
	Scanner studentFirst = new Scanner(System.in);
	System.out.println("Enter First name");
	String Firstname = studentFirst.nextLine();
	
	Scanner studentMiddle = new Scanner(System.in);
	System.out.println("Enter Middle name");
	String Middle = studentMiddle.nextLine();
	
	Scanner studentSurname = new Scanner(System.in);
	System.out.println("Enter Surname");
	String Surname = studentSurname.nextLine();	
	
	Scanner studentPhone = new Scanner(System.in);
	System.out.println("Enter phone");
	int Phone = studentPhone.nextInt();
	
	Scanner studentEmail = new Scanner(System.in);
	System.out.println("Enter Email");
	String Email = studentEmail.nextLine();
	
	Scanner studentDOB = new Scanner(System.in);
	System.out.println("Enter DOB");
	String DOB = studentDOB.nextLine();
	Name name = new Name(Firstname, Middle, Surname);
	Student student = new Student(Firstname, Middle, Surname, Email, Phone, DOB, modules);
	for(int i=0; i<6;i++)
	{
		Scanner studentModule = new Scanner(System.in);
		System.out.println("Enter Module Name");
		String Module = studentModule.nextLine();
		Scanner studentGrade = new Scanner(System.in);
		System.out.println("Enter Grade");
		int grade = studentGrade.nextInt();
		ModuleGrade module = new ModuleGrade(Module, grade);
		student.addModule(module);
	}
	
	//System.out.print(student);
	return student;
	}
}
