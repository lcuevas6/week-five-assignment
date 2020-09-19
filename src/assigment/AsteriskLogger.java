package assigment;

public class AsteriskLogger implements Logger{

	@Override
	public void log(String phrase) {
		System.out.println("***" + phrase + "***");
		
	}

	@Override
	public void error(String phrase) {
		System.out.println("************************");
		System.out.println("***Error:" + phrase + "***");
		System.out.println("************************");
		
	}

}

