class TestArray
{
	public static void main(String args[])
	{
		int a[] = {1,2,3,4,5} ;


		float sum = 0 ;
		float avg = 0 ;

		for (int i = 0 ; i < a.length ;++i)
		{
			sum += a[i] ;
			System.out.println(a[i]);
		}

		avg = sum/a.length ;
		System.out.println("Average = " + avg );
	}

}


