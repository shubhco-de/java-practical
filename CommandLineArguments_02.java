public class CommandLineArguments_02 {

	public static void main(String[] args) {
		System.out.println("Number of Command Line Argument = "+args.length);
		
		for(int i = 0; i< args.length; i++) {
			System.out.println(("Command Line Argument "+i+" is " +args[i]));
		}
		// COMPILE IT AND GIVE aRGUMENT WITH IT LIKE
		// JAVA CommandLineArguments_02 HELLO JAVA
	}

}