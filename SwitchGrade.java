public class SwitchGrade
{
	public static void main(String[] args)
	{
		int grade = 90 ;
		switch(grade)
		{
			case 100 :
				System.out.println("Excellent");
				break;
			case 90 :
				System.out.println("Good Jab!");
				break;
			case 80 :
				System.out.println("Can do better");
				break;
			default:
				System.out.println("Invalid input");
		}
	}
}
