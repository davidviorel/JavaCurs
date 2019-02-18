import java.util.Scanner;

public class oddEven {

	public static void main(String[] args) {

	System.out.println("--------------------------- " );
	System.out.println("       Info:Calculator " );
	System.out.println("     Author:David Viorel " );
	System.out.println("Description:Calcul Par Impar " );
	System.out.println("--------------------------- " );

	Scanner input = new Scanner (System.in);
	System.out.println("Enter a number");
	int number = input.nextInt();
		
	if(number % 2 == 0 )
	System.out.println ("Number is even" );
	
	else
	System.out.println ("Number is odd") ;
	}
}