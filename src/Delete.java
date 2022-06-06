import java.util.Scanner;

public class Delete extends Contacts{

	public Delete(String first_name, String last_name, String address, String city, String state, int zip, long phone,
			String email_id) {
		super(first_name, last_name, address, city, state, zip, phone, email_id);
		// TODO Auto-generated constructor stub
	}

	public static void delete() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name to delete the details");
		String name = sc.next();
		if(name.equals(first_name))
		{
			System.out.println("The details are found!!");
			first_name="";
			last_name="";
			address="";
			zip=(Integer) null;
			phone=(Long) null;
			state="";
			city="";
			email_id="";
			
			System.out.println("The details are deleted!!");
		}
	}
}
