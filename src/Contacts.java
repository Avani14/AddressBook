
public class Contacts {
	static String first_name;
	static String last_name;
	static String address;
	static String city;
	static String state;
	static int zip;
	static long phone;
	static String email_id; 
	public Contacts(String first_name,String last_name,String address,String city, String state,int zip,long phone,String email_id)
	{
		this.first_name = first_name;
		this.last_name = last_name;
		this.address = address;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.phone = phone;
		this.email_id = email_id;
		
		
	}
	
	public String toString()
	{
		return "Contanct details are as follows : \nFirst Name is :"+first_name+"\nLast Name is "+last_name+"\nAddress is :"+address+"\nCity is "+city
				+"\nState is "+state+"\nZip code is "+zip+"\nPhone number  is "+phone+"\nEmail id is "+email_id;
	}
}
