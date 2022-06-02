import java.util.Scanner;

public class Delete extends Contacts{

	public void delete() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name to delete the details");
		String name = sc.next();
		if(name.equals(first_name))
		{
			System.out.println("The details are found!!");
			first_name="";
			last_name="";
			addressComplete="";
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
