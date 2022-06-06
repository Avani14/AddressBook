import java.util.Scanner;

public class Edit extends Contacts{
	public Edit(String first_name, String last_name, String address, String city, String state, int zip, long phone,
			String email_id) {
		super(first_name, last_name, address, city, state, zip, phone, email_id);
		// TODO Auto-generated constructor stub
	}

	public static void edit_contact()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name to edit the details");
		String name = sc.next();
		if(name.equals(first_name))
		{
			System.out.println("We found the name");
			System.out.println("Please edit the details of "+name);
			
		}
	}
}
