import java.util.Scanner;

public class Minus {

	public static void main(String[] args) {
			// Scaderea numerelor
			Scanner input=new Scanner(System.in);
			int firstNumber=0; 
			int secondNumber=0; 
			int minus;
			System.out.println("--------------------------- " );
			System.out.println("       Info:Calculator " );
			System.out.println("     Author:David Viorel " );
			System.out.println("Description:calculate Difference " );

			System.out.println("Enter First Number: ");
			firstNumber=input.nextInt();
                       		System.out.println("Enter Second Number: ");
			secondNumber=input.nextInt();
			minus=firstNumber - secondNumber;
			System.out.println("Sum of the numbers is: " + minus);
			
	}
}