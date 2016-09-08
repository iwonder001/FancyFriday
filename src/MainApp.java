import java.util.Scanner;

/**

 * This is a demo app for deciding what to wear.
 */

/**
 * @author Student
 *
 */
public class MainApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String inputFancyFriday, inputSunny, inputRaining;
		boolean fancyFriday, sunny, raining;
		
		// Get input from the user
		Scanner input = new Scanner(System.in); 
		System.out.println("Is it Fancy Friday?");
		inputFancyFriday = input.nextLine();
		
		System.out.println("Is it Sunny?");
		inputSunny = input.nextLine();
		
		System.out.println("Is it Raining?");
		inputRaining = input.nextLine();
		
		//Test if the variables are working properly
		System.out.println(inputFancyFriday + "" + inputSunny + "" + inputRaining);
		
		
		// Set condition variables based on input
		
		// Use if statement to decide what to wear

	}

}
