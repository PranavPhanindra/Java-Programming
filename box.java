class box
{
	private float x = 0;
	private float y = 0;
	private float z = 0;

	public box(float x , float y , float z){ this.x = x ; this.y = y ; this.z = z ;}

	public box(float a){this(a,a,a);}

	public float getx() { return this.x; }
	public float gety() { return this.y; }
	public float getz() { return this.z; }

	public float area() 
	{ return ( 2* ( this.getx() * this.gety() + this.gety() * this.getz() + this.getz() * this.getx() ) ); }

	public void getData()
	{ 
		System.out.println("Length : " + this.getx());
		System.out.println("Breadth: " + this.gety());
		System.out.println("Depth  : " + this.getz());
	}

	public float volume()
	{ return (this.getx() * this.gety() * this.getz()); }
}

