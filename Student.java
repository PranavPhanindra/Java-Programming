public class Student extends Person
{
	public Student() { }

	public Student(String name , String Address) { super(name , Address) ;}

	public static void main(String args[])
	{
		Student Kris = new Student("Kris","Hyd");
		Kris.getData();
	}


}


