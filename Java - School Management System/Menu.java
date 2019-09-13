package application;

import java.util.Scanner;

public class Menu {
	public void menu ()
	{
	Scanner menu = new Scanner(System.in);
	System.out.println("Please choose from one of the following options \n\n 1.Create new student \n\n 2. Remove Student \n\n 3. Search for a student \n\n 4.Display all students in a class \n\n 5. Create new class \n\n 6. Quit \n\n");
	int menuChoice = menu.nextInt();
	if (menuChoice == 1)
	{
		NewStudent Student = new NewStudent();
		ClassGroup classgroup = new ClassGroup();
		classgroup.addStudent(Student.newStudent());
		Menu myMenu = new Menu();
		myMenu.menu();
		
	}
	else if(menuChoice == 2)
	{
		ClassGroup classgroup = new ClassGroup();
	    Scanner studentEmail = new Scanner(System.in);
		System.out.println("\n\nEnter Email");
		String Email = studentEmail.nextLine();
		classgroup.removeStudent(Email);
		Menu myMenu = new Menu();
		myMenu.menu();
	}
	else if(menuChoice == 3)
	{
		ClassGroup classgroup = new ClassGroup();
	    Scanner studentEmail = new Scanner(System.in);
		System.out.println("\n\nEnter Email");
		String Email = studentEmail.nextLine();
		classgroup.searchForStudent(Email);
		Menu myMenu = new Menu();
		myMenu.menu();
	}
	else if(menuChoice == 4)
	{
		ClassGroup classgroup = new ClassGroup();
		classgroup.displayClassGroup();
		Menu myMenu = new Menu();
		myMenu.menu();
	}
	else if(menuChoice == 5)
	{
		System.out.println("Was unable to complete");
		Menu myMenu = new Menu();
		myMenu.menu();
	}
	else if(menuChoice == 6)
	{
		System.exit(0);
	}
	}
}
