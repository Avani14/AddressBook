import java.util.ArrayList;

public class Display extends AddContacts{
	
	public Display(String first_name, String last_name, String address, String city, String state, int zip, long phone,
			String email_id) {
		super(first_name, last_name, address, city, state, zip, phone, email_id);
		// TODO Auto-generated constructor stub
	}

	public static void display()
	{
		
		for(Contacts add : arrayOfContacts)
		{
			System.out.println(add);
		}
	}
}
