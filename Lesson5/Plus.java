import java.util.Scanner;

public class Plus {

	public static void main(String[] args) {
			// Adunarea numerelor
			Scanner input=new Scanner(System.in);
			int firstNumber=0; 
			int secondNumber=0; 
			int sum;
			System.out.println("--------------------------- " );
			System.out.println("       Info:Calculator " );
			System.out.println("     Author:David Viorel " );
			System.out.println("Description:Calculate Sum " );

			System.out.println("Enter First Number: ");
			firstNumber=input.nextInt();
                        		System.out.println("Enter Second Number: ");
			secondNumber=input.nextInt();
			sum=firstNumber + secondNumber;
			System.out.println("Sum of the numbers is: " + sum);
			
			
	}
}