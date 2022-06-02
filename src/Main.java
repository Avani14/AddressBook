
public class Main {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to Address Book!!!");
		Contacts c = new Contacts();
		c.contacts();
		Display d = new Display();
		d.display();
		Edit e = new Edit();
		e.edit_contact();
		d.display();
		Delete del = new Delete();
		del.delete();
		d.display();
	}

}

