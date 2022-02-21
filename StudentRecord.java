public class StudentRecord

{
	private String name;
	private String address;
	private int age;
	private double math;
	private double engl;
	private double sci;
	private double avg;
	
	private static int studentCount;

	
	
	
	
	
	
	
	
	
	
	
	public String getName() { return this.name ; }

	public void setName (String Name) { this.name = Name ; }

	public double getAvg()
	{
		double result = 0 ;
		result = (math + eng + sci)/3;
	}

	public stativ int getStudentCount() { return studentcount ; }

