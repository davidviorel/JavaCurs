import java.util.Scanner;

public class surfacePerimeter {

	public static void main(String[] args) {
	
	Scanner scanner = new Scanner(System.in);

	System.out.println("Enter an operation: ") ;
	System.out.println("ST.Surface of triangle: " ) ;
	System.out.println("PT.Perimeter of triangle: " ) ;
	System.out.println("SR.Surface of rectangle: ") ;
	System.out.println("PR.Perimeter of rectangle: ") ;
	System.out.println("SD.Surface of diamond: ") ;
	System.out.println("PD.Perimeter of diamond: ") ;
		String operation = scanner.nextLine();
	
		
	switch(operation) {
	
	case "ST":
	case "st":
 		System.out.println("Enter the base of triangle (a): ");
        	double num1 = scanner.nextDouble();
		System.out.println("Enter the height of triangle (h): ");
		double num2 = scanner.nextDouble();
		double num3 = 0.5;
		double output = num3 * num1 * num2 ;
		System.out.println("Surface of the trangle:" + output);
		break;
		
	case "PT":
	case "pt":
		System.out.println("Enter a side of triangle (a): ");
		double num4 = scanner.nextDouble();
		System.out.println("Enter a side of triangle (b): ");
		double num5 = scanner.nextDouble();	
		System.out.println("Enter a side of triangle (c): ");
		double num6 = scanner.nextDouble();
	
		output = num4 + num5 + num6 ;
		System.out.println("Perimeter of the triangle:" + output);
		break;
	case "SR":
	case "sr":
		System.out.println("Enter a side of rectangle (Length): ");
		double num7 = scanner.nextDouble();
		System.out.println("Enter a side of rectangle (Height): ");
		double num8 = scanner.nextDouble();	
		
	
		output = (num7 * num8) * 2 ;
		System.out.println("Surface of the rectangle:" + output);
		break;

	case "PR":
	case "pr":
		System.out.println("Enter a side of rectangle (L): ");
		double num9 = scanner.nextDouble();
		System.out.println("Enter a side of rectangle (l): ");
		double num10 = scanner.nextDouble();	
		
	
		output = 2 * (num9 + num10) ;
		System.out.println("Perimeter of the rectangle:" + output);
		break;
		
	case "SD":
	case "sd":
		System.out.println("Enter a diagonal of the diamond (d1): ");
		double num11 = scanner.nextDouble();
		System.out.println("Enter a diagonal of the diamond (d2): ");
		double num12 = scanner.nextDouble();	
		
	
		output = (num11 * num12) / 2 ;
		System.out.println("Surface of the diamond:" + output);
		break;

	case "PD":
	case "pd":
		System.out.println("Enter a side of diamond (l): ");
		double num13 = scanner.nextDouble();
	
	
		output = 4 * num13 ;
		System.out.println("Perimeter of the diamond:" + output);
		break;
			
		default: 
		System.out.println("<<< Sorry!!! The operation is not correctly selected >>"); 
		break; 
		
           }
	}
     }
 
	