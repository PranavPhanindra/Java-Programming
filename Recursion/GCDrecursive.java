/*
 * gcd(m,n) = gcd(n,m) 
 * gcd(m,n) = m if m = 0 
 * gcd(m,n) = 1 if m = 1 
 * gcd(m,n) = m/n if m = n
 * gcd(m,n) = gcd(m , n%m)
 * 
 */

public class GCDrecursive
{
	int m , n ;

	int gcd(int m , int n)
	{
		if(m > 0) 
			return gcd(n,m);
		if(m == n) 
			return m ;
		if(m == 0)
			return n;
		if(m == 1)
			return 1;
		return gcd(m , n%m);
	}

	public static void main(String[] args)
	{
		GCDrecursive g = new GCDrecursive() ;
		g.m = Integer.parseInt(args[0]);
		g.n = Integer.parseInt(args[1]);

		System.out.println(""+g.gcd(g.m, g.n));
	}
}

