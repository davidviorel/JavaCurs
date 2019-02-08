import java.util.Scanner;

public class Inmultire {

	public static void main(String[] args) {
			// Operatie de inmultire
			Scanner input=new Scanner(System.in);
			int firstNumber=0; 
			int secondNumber=0; 
			int inmultire;
			System.out.println("--------------------------- " );
			System.out.println("       Info:Calculator " );
			System.out.println("     Author:David Viorel " );
			System.out.println("Description:calculate Multiply " );

			System.out.println("Enter First Number: ");
			firstNumber=input.nextInt();
                     		System.out.println("Enter Second Number: ");
			secondNumber=input.nextInt();
			inmultire=firstNumber * secondNumber;
			System.out.println("Sum of the numbers is: " + inmultire);
			
	}
}