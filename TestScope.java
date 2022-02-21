public class TestScope
{
	public static void main(String[] args)
	{
	
		int b = 102912;
		{
			int a = 100;
			System.out.println(a);
			System.out.println(b);
		}
		int a = 1000;
		System.out.println(a);

	}
}

