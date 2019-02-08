public class contor {

	public static void main(String[] args) {
		
	outer:
	for (int iteration = 0; iteration <1; iteration++ ){
		for (int innerIteration = 0; innerIteration < 10; innerIteration++){
			if(innerIteration % 2 > 1) {
				continue outer;
		}
		System.out.println (innerIteration);


		}
	}
       }
}