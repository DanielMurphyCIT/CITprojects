package application;

import java.util.ArrayList;
import java.util.Scanner;

public class School {
	ArrayList<Student> Students = new ArrayList<Student>();
	ArrayList<School> ClassGroup = new ArrayList<School>();
	String className;
	public School(String className, ArrayList<Student> Students)
	{
		this.Students = Students;
		this.className = className;
	}
	public void createClassGroup()
	{
	
		Scanner classgroup = new Scanner(System.in);
		System.out.println("Enter Class name");
		className = classgroup.nextLine();
		
		//School = className + ClassGroup;
		School school = new School(className, Students);
		ClassGroup.add(school);
	}
	
	public void AddToClassGroup(String groupName, ArrayList<Student> students)
	{
		System.out.print("\nStudent Removed\n\n");
		School school = new School(groupName, students);
		int len = ClassGroup.size();
		System.out.print(len);
		for (int i = 0; i < len; i++)
		{
			System.out.print("entered for loop");
			String Student = ClassGroup.get(i).toString();
			if (Student.indexOf(groupName) != -1)
			{
				System.out.print("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
				ClassGroup.set(i, school);
				System.out.print("\n\n" + ClassGroup.toString() + "\n\n" );
			}
			else
			{
				System.out.print("\nStudent Not found in class group\n\n");
			}
		}
	}
	
	/*public void addToClassGroup()
	{
		int len = ClassGroup.size();
		for (int i = 0; i < len; i++)
		{
			String Student = ClassGroup.get(i).toString();
			if (Student.indexOf(email) != -1)
			{
				ClassGroup.remove(i);
				System.out.print("\nStudent Removed\n\n");
				System.out.print("\n\n" + ClassGroup.toString() + "\n\nj" );
			}
			else
			{
				System.out.print("\nStudent Not found in class group\n\n");
			}
		}
	}*/
	
	public String toString()
	{
		return className + " " + Students.toString();
	}
}
