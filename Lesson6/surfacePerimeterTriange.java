import java.util.Scanner;

public class surfacePerimeterTriange {

	public static void main(String[] args) {
	
	Scanner scanner = new Scanner(System.in);

	System.out.println("Enter an operation: ");
	System.out.println("S. Surface of the triangle: " );
	System.out.println("P. Perimeter of the triangle: " );
	char operation = scanner.next().charAt(0);
			
		
	switch(operation) {
	
	case 'S':
	case 's':
 		System.out.println("Enter the base of triangle (a): ");
        	double num1 = scanner.nextDouble();
		System.out.println("Enter the height of triangle (h): ");
		double num2 = scanner.nextDouble();
		double num3 = 0.5;
		double output = num3 * num1 * num2 ;
		System.out.println("Surface of the trangle:" + output);
		break;
		
	case 'P':
	case 'p':
		System.out.println("Enter a side of triangle (a): ");
		double num4 = scanner.nextDouble();
		System.out.println("Enter a side of triangle (b): ");
		double num5 = scanner.nextDouble();	
		System.out.println("Enter a side of triangle (c): ");
		double num6 = scanner.nextDouble();
	
		output = num4 + num5 + num6 ;
		System.out.println("Perimeter of the triangle:" + output);
		break;
		
		default: 
		System.out.println("<<< Sorry!!! The operation is not correctly selected >>"); 
		break; 
		
           }
	}
     }
 
	