import java.util.Scanner ;

public class MaxCalc{
	public static void main(String args[]){
		int sum  = 0 ;
		float avg = 0;

		int l[] ;
		System.out.println("Enter the input : " );
		Scanner input = new Scanner(System.in);

		while(input.nextInt())
			l.add(input.nextInt());

		for(int i = 0 ; i != l.size() ; ++i)
			sum += l.get(i);

		avg = sum / l.size() ;

		System.out.println("Sum : " + sum);
		System.out.println("Avg : " + avg);
	} 
}


