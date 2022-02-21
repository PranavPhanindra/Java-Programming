public class Person
{
	protected String name ;
	protected String address;


	public Person() { name = "--" ; address = "--" ; }

	public Person(String name ,String address) 
	{
		this.name = name ;
		this.address = address ;
	}

	//Since its insane to have someone's address but not know name 
	public Person(String name) { this(name , "--");}

	public String getName() {return this.name;}
	public String getAddress() {return this.address;}

	public void getData()
	{ 
		System.out.println("Name : " + this.getName());
		System.out.println("Address : " + this.getAddress());
	}


	public static void main(String args[])
	{
		Person Pranav = new Person("Pranav" , "500070 Hyderabad");
	
		System.out.println(Pranav.getName() + " -- " + Pranav.getAddress()) ;

		Pranav.getData();
	}


}
		
