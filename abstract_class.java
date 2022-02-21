abstract class Geometry
{
	static final double PI = 3.14;
	public abstract double area() ;
	public abstract double circumference();
	public abstract void getDim();

}

class circle extends Geometry 
{
	private double r ;
	public circle(double r)
	{ this.r = r ;}

	public circle()
	{ this(1) ;}

	public double area()
	{ return PI * r *r ;}

	public double circumference()
	{ return 2 * PI * r ; }

	public double getRad()
	{ return r ; }

	public void getDim()
	{ System.out.println("Radius of Circle : " + this.getRad() ) ; }
}

class rectangle extends Geometry 
{
	private double l , w ;

	public rectangle(double l , double w)
	{ this.l = l ; this.w = w ; }

	public rectangle()
	{ this(0 , 0) ; }

	public double area()
	{ return this.l * this.w; }

	public double getL()
	{return l;}

	public double getW()
	{return w ;}

	public void getDim()
	{ System.out.println( "Dimensions are... Length : " + this.getL() + ";Width : " + this.getW() ) ; }

	public double circumference()
	{ return 2*(this.getL() + this.getW()) ; }




}



public class abstract_class
{
	public static void main(String []args)
	{
		Geometry [] geoObj = new Geometry[3] ;

		geoObj[0] = new circle() ;
		geoObj[1] = new circle(2);
		geoObj[2] = new rectangle(4,2) ;

		for(int i = 0 ;  i != 3 ; ++i)
		{
			System.out.println(geoObj[i].area());
			System.out.println(geoObj[i].circumference());
			geoObj[i].getDim();
		}
	}
}





