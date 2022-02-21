class circle
{
	private float x = 0;
	private float y = 0;

	private float radius = 0;

	public circle(float x,float y, float radius)
	{ this.x = x ; this.y = y ; this.radius = radius ; } 

	public circle(float radius)
	{ this(0,0,radius) ; }

	public circle()
	{ this(0,0,1); }


	public float getRadius()
	{ return this.radius ;}

	public float area()
	{ return ( (22/7) * this.getRadius() * this.getRadius() ) ; }

	public float circumference()
	{ return ( 2 * (22/7) * this.getRadius() ) ; } 

}

