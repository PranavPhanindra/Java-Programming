public class Book
{
	String name ;
	double price ;

	public Book(String name , double price)
	{ 
		this.name = name ;
		this.price = price ;
	}

	public Book()
	{ this("",0); }


	public static void main(String[] args)
	{
		Book b1 =new Book("gifted hands" , 90);
		System.out.println(b1.toString());

		Book[] Book_DB;
                Book_DB = new Book[10];


		for(int i = 0 ; i != 10 ; ++i)
			Book_DB[i] =new Book("gifted hands" , 90);
		for(int i = 0 ; i != 10 ; ++i)
			System.out.println(Book_DB[i].toString()) ;
	}
}
