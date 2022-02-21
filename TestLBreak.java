public class TestLBreak
{
	public static void main(String[]  args)
	{
		int [][] mat = { {1,0,0} , {0,1,0} , {0,0,1} } ;
		int searchNum = 10;
		boolean foundNum = false ;
searchLabel:
		for(int i = 0 ; i != mat.length ; ++i)
		{
			for(int j = 0 , check = 0 ; j != mat[i].length ; ++j , ++check)
			{
				System.out.println(check);
				if(searchNum == mat[i][j])
				{
					foundNum = true ;
					break searchLabel ;
				}
			}
		}

		if (foundNum == true)
			System.out.println("Found");
		else
			System.out.println("Not Found");
	}
}

