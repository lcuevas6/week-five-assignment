package assigment;

public class App {

	public static void main(String[] args) {
		
		Logger logger = new AsteriskLogger();
		
		logger.log("Hello Luis");
		
		System.out.println("\n");
		
		logger.error("Warning Luis");
		
		System.out.println("\n");
		
		Logger newPhrase = new SpacedLogger();
		
		newPhrase.log("Hello Luis");
		
		System.out.println("\n");
		
		newPhrase.error("Warning Luis");
		
	}

}
