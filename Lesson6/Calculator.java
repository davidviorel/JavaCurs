		import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

    	double num1, num2;
	System.out.println("--------------------------- " );
	System.out.println("       Info:Calculator " );
	System.out.println("     Author:David Viorel " );
	System.out.println("Description:Calculate Sum " );
	System.out.println("--------------------------- " );

        	Scanner scanner = new Scanner(System.in);
        	System.out.println("Enter first number:");

	num1 = scanner.nextDouble();
	System.out.println("Enter second number:");
        	num2 = scanner.nextDouble();

        	System.out.println("Enter an operator (+, -, *, /,%): ");
        	char operator = scanner.next().charAt(0);

	scanner.close();
        	double output;

        	switch(operator)
        	{
            	case '+':
            	output = num1 + num2;
		break;

	case '-':
            	output = num1 - num2;
		break;

	case '*':
            	output = num1 * num2;
              		break;
	
	case '/':
	output = num1 / num2;
              		break;

	case '%':
            	output = num1 % num2;
              		break;
        }

        System.out.println("num1+" "+operator+" "+num2+ "="+ output");
    }
}