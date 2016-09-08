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
		boolean fancyFriday = false; 
		boolean sunny = false;
		boolean raining = false;
		
		System.out.println("WHAT WILL YOU WEAR TODAY?");
		
		// Get input from the user
		Scanner input = new Scanner(System.in); 
		System.out.println("Is it Fancy Friday?");
		inputFancyFriday = input.nextLine();
		
		System.out.println("Is it Sunny?");
		inputSunny = input.nextLine();
		
		System.out.println("Is it Raining?");
		inputRaining = input.nextLine();
		
		//Test if the variables are working properly
		//System.out.println(inputFancyFriday + " " + inputSunny + " " + inputRaining);
		
		
		// Set condition variables based on input
		if(inputFancyFriday.equalsIgnoreCase("yes")) {
		   fancyFriday = true;
		}   
		
		if(inputSunny.equalsIgnoreCase("yes")) {
			   sunny = true;
			}   
		
		if(inputRaining.equalsIgnoreCase("yes")) {
			   raining = true;
			}  
		
		//Test if the variables are working properly
		//System.out.println(fancyFriday + " " + sunny + " " + raining);
		
		// Use if statement to decide what to wear
		//could do if(inputFancyFriday.equalsIgnoreCase("yes"))
		if(fancyFriday){
			if(sunny){
				System.out.println("Wear a tea gown");
			} else if(raining){
				System.out.println("Wear a power suit");
			}else {
				System.out.println("Wear a long gown");
			}	
		} else {
			System.out.println("Wear a t-shirt and jeans");
		}
		
		}
	}


