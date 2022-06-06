import java.util.Scanner;

public class Main {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to Address Book!!!");
		Scanner sc = new Scanner(System.in);
		int option;
		do {
		System.out.println("Enter \n 1 to add contact \n 2 to display the contacts \n 3 to edit a contact \n 4 to delete the contact \n 0 to Exit the program");
		option = sc.nextInt();
		
		switch(option)
		{
		case 1:
			AddContacts.addContacts();
		break;
		case 2:
			Display.display();
			break;
		case 3:	
			Edit.edit_contact();
//			d.display();
			break;
		case 4:
			Delete.delete();
//			d.display();
			break;
		case 0:
			break;
		default: System.out.println("Please enter valid number");
		}
		}while(option != 0);
	}

}

