import java.util.Scanner;

public class Contacts {
	static String first_name;
	static String last_name;
	static String address;
	static String city;
	static String state;
	static int zip;
	static long phone;
	static String email_id;
	static String addressComplete;
	
	public void contacts()
	{

		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter your first name :");
		first_name = sc.next();
		System.out.println("Please enter your last name :");
		last_name = sc.next();
		System.out.println("Please enter your address :");
		address = sc.next();
		addressComplete = address + sc.nextLine();
		System.out.println("Please enter your city :");
		city = sc.next();
		System.out.println("Please enter your state :");
		String state = sc.next();
		System.out.println("Please enter your zip code :");
		zip = sc.nextInt();
		System.out.println("Please enter your phone number :");
		phone = sc.nextLong();
		System.out.println("Please enter your email id :");
		email_id = sc.next();
		
	}
}
