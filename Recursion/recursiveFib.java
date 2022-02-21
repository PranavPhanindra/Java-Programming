class recursiveFib
{
	int n ;

	int fib(int n)
	{
		if (n == 0)
			return 0;
		else if (n == 1)
			return 1 ;
		else 
			return ( fib(n-1) + fib(n-2) ) ;
	}


	public static void main(String[] args)
	{
		recursiveFib f = new recursiveFib() ;

		f.n = Integer.parseInt(args[0]);

		for(int i = 0 ; i != f.n ; ++i )
			System.out.println(f.fib(i));
	}
}
