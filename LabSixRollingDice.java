import java.util.Scanner;

public class LabSixRollingDice {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		String userInput;
		
		
		System.out.println("Welcome to Casino Royale");
		
		System.out.println("How many sides should a pair of dice have? ");
		int sides = scnr.nextInt();
		
		System.out.println("Roll the dice yes or no? ");
		userInput = scnr.next();
		
		if (userInput.equalsIgnoreCase("yes")) {
			
		} 
		
		int diceRoll1 = generateRandomDieRoll(sides);
		int diceRoll2 = generateRandomDieRoll(sides);
		
		System.out.println("Roll 1: " + diceRoll1 + "\t Roll 2: " + diceRoll2);
		
		
			
 
		} 
  
	private static int generateRandomDieRoll(int sides) {
		
		
		
		sides = (int) ( Math.random()+ 1);
	    
	    
	  		
		return sides;

       
        
		
		
		
	}
	
	
	
	
	
}       

