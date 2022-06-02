import java.util.Scanner;

public class Edit extends Contacts{
	public void edit_contact()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name to edit the details");
		String name = sc.next();
		if(name.equals(first_name))
		{
			System.out.println("We found the name");
			System.out.println("Please edit the details of "+name);
			contacts();
		}
	}
}
