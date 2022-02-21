public class TestBreak 
{
	public static void main(String[] args)
	{
		String names[] = {"Pranav" , "Aryan" , "Anurag" , "SriRam" };
		String searchName  = "Rohit" ; 

		boolean foundName = false ;

		for( int i = 0 ; i != names.length ; ++i )
		{
			if( names[i] == searchName )
			{
				foundName = true ;
				break;
			}
		}

		if (foundName)
			System.out.println("The name is found ");
		else 
			System.out.println("The name is not found ");
	}
}
