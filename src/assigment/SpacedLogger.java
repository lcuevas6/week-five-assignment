package assigment;

public class SpacedLogger implements Logger{
	

	@Override
	public void log(String phrase) {
		StringBuilder newPhrase = new StringBuilder();
		for (int index = 0; index < phrase.length(); index++) {
			newPhrase.append(phrase.charAt(index)).append(" ");
		}
			System.out.println(newPhrase);
			
}

	@Override
	public void error(String phrase) {
		StringBuilder secondPhrase = new StringBuilder()	;
		for (int index = 0; index < phrase.length(); index++) {
			secondPhrase.append(phrase.charAt(index)).append(" ");
		}
			System.out.println("ERROR:" + secondPhrase);
		
	}

}
