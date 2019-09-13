package application;

import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class ClassGroup {
ArrayList<Student> ClassGroup = new ArrayList<Student>(); 
public void addStudent(Student element) {
    ClassGroup.add(element);
    System.out.print(ClassGroup);
    Scanner createGroup = new Scanner(System.in);
		Scanner GroupName = new Scanner(System.in);
		System.out.println("\n\n please name your group: ");
		String groupname = GroupName.nextLine();
		School school = new School(groupname, ClassGroup);
		school.AddToClassGroup(groupname, ClassGroup);
	
   
    
}

public void removeStudent(String email) {
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
}
public void searchForStudent(String email) {
	int len = ClassGroup.size();
	for (int i = 0; i < len; i++)
	{
		String Student = ClassGroup.get(i).toString();
		if (Student.indexOf(email) != -1)
		{
			System.out.print("\nStudent Found\n\n");
			System.out.print("\n\n" + ClassGroup.toString() + "\n\nj" );
		}
		else
		{
			System.out.print("\nStudent Not found in class group\n\n");
		}
	}
}

public void displayClassGroup()
{
	System.out.print("\n\n" + ClassGroup.toString() + "\n\nj" );
}
}
