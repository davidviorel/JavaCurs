import java.util.Scanner;

public class parImpar {

	public static void main(String[] args) {

	System.out.println("--------------------------- " );
	System.out.println("       Info:Calculator " );
	System.out.println("     Author:David Viorel " );
	System.out.println("Description:Calcul Par Impar " );
	System.out.println("--------------------------- " );

	Scanner sc=new Scanner (System.in);
	System.out.println("introduce-ti un numar");
	int numar = sc.nextInt();
		
	if(numar % 2 == 0 );
	System.out.println ("Este par");
	else
	System.out.println ("Este impar");
	}
}