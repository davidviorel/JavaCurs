import java.util.Scanner;
	public class WhatsUp {
	public static void main(String[] args){
			String version = System.getProperty("java.version");			
			System.out.println("\nHello Mr who are you");	
                        System.out.println("\nIntroduce yourself SOLDIER");
                                Scanner reader = new Scanner(System.in);
				String userName = reader.next();
				reader.close();
		System.out.println("\nNice to meet you, ");
		System.out.println("\nI'm a Stanislav Scerbatiuc and i'm a yours mentor");
	}
}