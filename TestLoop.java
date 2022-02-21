public class TestLoop
{
	public static void main(String[] args)
	{
		int x = 0;
		System.out.println("While Loop");
		while(x != 10)
		{
			System.out.println(++x);
		}

		System.out.println("For Loop");
		for(x = 0 ; x != 10 ; ++x)
			System.out.println(x);

	}
}
