public class geoclass
{

        public static void main(String args[])
        {
                box b1 = new box(1);
                System.out.println("Area : " + b1.area());
		System.out.println("Volume : " + b1.volume());

		circle c1 = new circle();
                System.out.println("Area : " + c1.area());
		System.out.println("Volume : " + c1.circumference());

	}
}

