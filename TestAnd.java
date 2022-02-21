public class TestAnd
{
	public static void main(String[] args)
	{
		int i = 0 ;
		int j = 0 ;
		
		boolean test = false ;

		//&& - demonstration

		test = (i > 0) && ( j++ > 9 );
		
		System.out.println(i);
		System.out.println(j);
		System.out.println(test) ;
		//& demonstration 
		test = (i > 0)  & ( j++ > 9 );
		
		System.out.println(i);
		System.out.println(j);
		System.out.println(test) ;
	}
}
